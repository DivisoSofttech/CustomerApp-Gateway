package com.diviso.graeshoppe.service.impl;

import static org.elasticsearch.action.search.SearchType.QUERY_THEN_FETCH;
import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;
import static org.elasticsearch.index.query.QueryBuilders.rangeQuery;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.FetchSourceFilterBuilder;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.core.query.StringQuery;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.product.model.AuxilaryLineItem;
import com.diviso.graeshoppe.client.product.model.Category;
import com.diviso.graeshoppe.client.product.model.ComboLineItem;
import com.diviso.graeshoppe.client.product.model.Discount;
import com.diviso.graeshoppe.client.product.model.Product;
import com.diviso.graeshoppe.client.product.model.StockCurrent;
import com.diviso.graeshoppe.service.ProductQueryService;
import com.github.vanroy.springdata.jest.JestElasticsearchTemplate;
import com.github.vanroy.springdata.jest.aggregation.AggregatedPage;

import io.searchbox.client.JestClient;
import io.searchbox.core.search.aggregation.TermsAggregation;
import io.searchbox.core.search.aggregation.TermsAggregation.Entry;

@Service
public class ProductQueryServiceImpl implements ProductQueryService{


	private final JestClient jestClient;
	private final JestElasticsearchTemplate elasticsearchTemplate;

	private final Logger log = LoggerFactory.getLogger(ProductQueryServiceImpl.class);

	public ProductQueryServiceImpl(JestClient jestClient) {
		this.jestClient = jestClient;
		this.elasticsearchTemplate = new JestElasticsearchTemplate(this.jestClient);
	}

	@Autowired
	ElasticsearchOperations elasticsearchOperations;
	
	@Override
	public Page<Product> findAllProductBySearchTerm(String searchTerm, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(matchQuery("name", searchTerm).prefixLength(2)).build();

		return elasticsearchOperations.queryForPage(searchQuery, Product.class);
	}

	@Override
	public Page<Product> findProductByCategoryId(Long categoryId, String userId, Pageable pageable) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("category.id", categoryId))
						.must(QueryBuilders.matchQuery("iDPcode", userId)))
				.build();
		return elasticsearchOperations.queryForPage(searchQuery, Product.class);
	}
	
	@Override
	public Page<StockCurrent> findStockCurrentByProductId(Long productId, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("product.id", productId)).build();
		return elasticsearchOperations.queryForPage(searchQuery, StockCurrent.class);
	}

	@Override
	public Page<StockCurrent> findStockCurrentByProductName(String name, String storeId, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("product.name", name))
						.must(QueryBuilders.matchQuery("product.iDPcode", storeId)))
				.build();

		return new PageImpl(elasticsearchOperations.queryForPage(searchQuery, StockCurrent.class).stream()
				.filter(stockcurrent -> stockcurrent.getProduct().isIsAuxilaryItem() == false)
				.collect(Collectors.toList()));
	}
	
	@Override
	public Page<Product> findAllProductsByStoreId(String storeId) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("iDPcode", storeId)).build();
		return elasticsearchOperations.queryForPage(searchQuery, Product.class);
	}

	@Override
	public List<Product> findAllProducts() {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForList(searchQuery, Product.class);
	}

	@Override
	public Page<StockCurrent> findStockCurrentByStoreId(String iDPcode) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("iDPcode", iDPcode)).build();

		Page<StockCurrent> stockCurrentPage = elasticsearchOperations.queryForPage(searchQuery, StockCurrent.class);

		List<StockCurrent> notAuxStockCurrentProducts = new ArrayList<StockCurrent>();

		stockCurrentPage.forEach(s -> {

			if (s.getProduct().isIsAuxilaryItem() == false) {
				notAuxStockCurrentProducts.add(s);
			}
		});

		return new PageImpl(notAuxStockCurrentProducts);
	}
	
	@Override
	public List<Entry> findCategoryAndCount(Pageable pageable) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery())
				.withSearchType(QUERY_THEN_FETCH)

				.withIndices("product").withTypes("product")

				.addAggregation(AggregationBuilders.terms("totalcategories").field("category.name.keyword"))
				.withPageable(pageable).build();

		AggregatedPage<Product> result = elasticsearchTemplate.queryForPage(searchQuery, Product.class);

		TermsAggregation categoryAggregation = result.getAggregation("totalcategories", TermsAggregation.class);

		return categoryAggregation.getBuckets();

	}

	@Override
	public List<Entry> findCategoryAndCountByStoreId(String storeId,Pageable pageable) {
		
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery())
				
				.withSearchType(QUERY_THEN_FETCH).withIndices("product").withTypes("product")
				
				.addAggregation(AggregationBuilders.terms("totalcategories").field("category.name.keyword")
						
						.order(org.elasticsearch.search.aggregations.bucket.terms.Terms.Order.aggregation("avgPrice",
								
								true))
						.subAggregation(AggregationBuilders.avg("avgPrice").field("sellingPrice"))
						
						.subAggregation(AggregationBuilders.terms("store").field("iDPcode.keyword")))
				.build();

		AggregatedPage<Product> result = elasticsearchTemplate.queryForPage(searchQuery, Product.class);

		TermsAggregation orderAgg = result.getAggregation("totalcategories", TermsAggregation.class);

		List<Entry> storeBasedEntry = new ArrayList<Entry>();

		/*List<Entry> listentry=orderAgg.getBuckets().stream().filter(bucket->bucket.getKey().equals(customerId))
		.filter(bucket->  bucket.getAggregation("store", TermsAggregation.class).getBuckets()
				.stream()
				.filter(subbucket-> subbucket.getKey().equals(storeId)).findFirst().isPresent()
				).collect(Collectors.toList());
		*/
		
		orderAgg.getBuckets().forEach(bucket -> {
			
			int i = 0;
			double averagePrice = bucket.getAvgAggregation("avgPrice").getAvg();

			System.out.println(String.format("Key: %s, Doc count: %d, Average Price: %f", bucket.getKey(),
					bucket.getCount(), averagePrice));

			System.out.println("SSSSSSSSSSSSSSSSSS"
					+ bucket.getAggregation("store", TermsAggregation.class).getBuckets().get(i).getKeyAsString());

			String storeName = bucket.getAggregation("store", TermsAggregation.class).getBuckets().get(i)
					.getKeyAsString();
			
			if (storeName.equals(storeId)) {
				
				Entry storeEntry = bucket;
				
				storeBasedEntry.add(storeEntry);
			}
			i++;
			System.out.println(
					"SSSSSSSSSSSSSSSSSS" + bucket.getAggregation("store", TermsAggregation.class).getBuckets().size());
		});
		// return orderAgg.getBuckets();
	return storeBasedEntry;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.diviso.graeshoppe.service.QueryService#findAllProductByName(java.
	 * lang. String)
	 */
	@Override
	public Page<Product> findAllProductByName(String name) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchQuery("name", name)).build();
		return elasticsearchOperations.queryForPage(searchQuery, Product.class);

	}

	@Override
	public Page<StockCurrent> findAllStockCurrentByProductNameStoreId(String productName, String storeId) {
		StringQuery stringQuery = new StringQuery(
				QueryBuilders.boolQuery().must(QueryBuilders.termQuery("iDPcode", storeId))
						.must(QueryBuilders.termQuery("product.name", productName)).toString());

		return elasticsearchOperations.queryForPage(stringQuery, StockCurrent.class);

	}

	/*
	 * to find Product by storeId and categoryName
	 */
	@Override
	public Page<Product> findProductByStoreIdAndCategoryName(String userId, String categoryName, Pageable pageable) {

		List<Category> categoryList = new ArrayList<>();
		FetchSourceFilterBuilder sourceFilter = new FetchSourceFilterBuilder();
		sourceFilter.withExcludes("category");

		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(QueryBuilders.boolQuery().must(QueryBuilders.termQuery("iDPcode.keyword", userId))
						.must(QueryBuilders.termQuery("category.name.keyword", categoryName)))
				.withIndices("product").withTypes("product").withSourceFilter(sourceFilter.build())
				.withPageable(pageable).build();

		return elasticsearchOperations.queryForPage(searchQuery, Product.class);

	}

	@Override
	public List<StockCurrent> findStockCurrentByStoreIdAndCategoryId(String userId, Long categoryId,
			Pageable pageable) {

		List<StockCurrent> stockCurrentList = new ArrayList<>();
		FetchSourceFilterBuilder sourceFilter = new FetchSourceFilterBuilder();
		sourceFilter.withExcludes("category");

		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(QueryBuilders.boolQuery().must(QueryBuilders.termQuery("iDPcode.keyword", userId))
						.must(QueryBuilders.termQuery("category.id", categoryId)))
				.withIndices("product").withTypes("product").withSourceFilter(sourceFilter.build())
				.withPageable(pageable).build();

		List<Product> productList = elasticsearchOperations.queryForPage(searchQuery, Product.class).getContent();

		for (Product product : productList) {
			System.out.println(
					"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=List of product:" + product);
			if ((product.isIsAuxilaryItem() == false)) {

				StringQuery query = new StringQuery(termQuery("product.id", product.getId()).toString());

				stockCurrentList.add(elasticsearchOperations.queryForObject(query, StockCurrent.class));
				for (StockCurrent stockCurrent : stockCurrentList) {

					System.out.println(
							"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=stockcurrentList"
									+ stockCurrent);
				}

				System.out.println("<<<<<<<stockCurrentSize:" + stockCurrentList.size());
			}
		}

		return stockCurrentList;

	}

	@Override
	public Product findProductById(Long id) {
		log.info("..............id  impl ............." + id);

		StringQuery searchQuery = new StringQuery(termQuery("id", id).toString());

		return elasticsearchOperations.queryForObject(searchQuery, Product.class);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findAndSortProductByPrice(java
	 * .lang.Double, java.lang.Double)
	 */
	@Override
	public Page<StockCurrent> findAndSortProductByPrice(Double from, Double to) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(rangeQuery("sellPrice").gte(from).lte(to))
				.withSort(SortBuilders.fieldSort("sellPrice").order(SortOrder.DESC)).build();

		return elasticsearchOperations.queryForPage(searchQuery, StockCurrent.class);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.diviso.graeshoppe.service.QueryService#findProductsByCategoryName(
	 * java.lang.String)
	 */
	@Override
	public Page<Product> findProductsByCategoryName(String name) {

		List<Product> products = findAllProducts();

		List<Product> categoryNameBasedProduct = new ArrayList<Product>();

		products.forEach(p -> {

			if (p.getCategory().getName().equals(name)) {

				categoryNameBasedProduct.add(p);
			}

		});

		return new PageImpl(categoryNameBasedProduct);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.diviso.graeshoppe.service.QueryService#findAllAuxilariesByProductId(
	 * java.lang.Long)
	 */
	@Override
	public Page<AuxilaryLineItem> findAllAuxilariesByProductId(Long productId) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("product.id", productId)).build();

		return elasticsearchOperations.queryForPage(searchQuery, AuxilaryLineItem.class);

	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findStockCurrentByCategoryName
	 * (java.lang.String)
	 */
	@Override
	public Page<StockCurrent> findStockCurrentByCategoryNameAndStoreId(String categoryName, String storeId) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(
				QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("product.category.name.keyword", categoryName))
						.must(QueryBuilders.matchQuery("product.iDPcode", storeId)))
				.build();
		return elasticsearchOperations.queryForPage(searchQuery, StockCurrent.class);

	}

	@Override
	public Page<ComboLineItem> findAllCombosByProductId(Long productId) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("product.id", productId)).build();

		return elasticsearchOperations.queryForPage(searchQuery, ComboLineItem.class);

	}

	@Override
	public Discount findDiscountByProductId(Long productId) {
		StringQuery searchQuery = new StringQuery(termQuery("id", productId).toString());
		Product product = elasticsearchOperations.queryForObject(searchQuery, Product.class);
		return product.getDiscount();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.diviso.graeshoppe.service.QueryService#findNotAuxilaryProducts(java.
	 * lang.String, org.springframework.data.domain.Pageable)
	 */
	/*
	 * @Override public Page<Product> findNotAuxilaryProducts(String iDPcode,
	 * Pageable pageable) { SearchQuery searchQuery = new
	 * 
	 * NativeSearchQueryBuilder().withQuery(termQuery("iDPcode", iDPcode)).build();
	 * 
	 * List<Product> products = elasticsearchOperations.queryForList(searchQuery,
	 * Product.class);
	 * 
	 * 
	 * List<Product> notAuxProducts = new ArrayList<Product>();
	 * 
	 * products.forEach(p -> {
	 * 
	 * if ((p.isIsAuxilaryItem() == false)) {
	 * 
	 * notAuxProducts.add(p); }
	 * 
	 * });
	 * 
	 * return new PageImpl(notAuxProducts); }
	 */
	
}
