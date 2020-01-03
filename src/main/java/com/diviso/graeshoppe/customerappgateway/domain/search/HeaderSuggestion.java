package com.diviso.graeshoppe.customerappgateway.domain.search;

public class HeaderSuggestion {
	private String indexName;
	private String suggestionData;
	public String getIndexName() {
		return indexName;
	}
	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}
	public String getSuggestionData() {
		return suggestionData;
	}
	public void setSuggestionData(String suggestionData) {
		this.suggestionData = suggestionData;
	}
	@Override
	public String toString() {
		return "HeaderSuggestion [indexName=" + indexName + ", suggestionData=" + suggestionData + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((indexName == null) ? 0 : indexName.hashCode());
		result = prime * result + ((suggestionData == null) ? 0 : suggestionData.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeaderSuggestion other = (HeaderSuggestion) obj;
		if (indexName == null) {
			if (other.indexName != null)
				return false;
		} else if (!indexName.equals(other.indexName))
			return false;
		if (suggestionData == null) {
			if (other.suggestionData != null)
				return false;
		} else if (!suggestionData.equals(other.suggestionData))
			return false;
		return true;
	}
	
	
}
