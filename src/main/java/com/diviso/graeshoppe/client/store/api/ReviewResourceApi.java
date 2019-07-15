/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.store.api;

import com.diviso.graeshoppe.client.store.domain.Review;
import com.diviso.graeshoppe.client.store.model.ReviewDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-15T14:57:07.355+05:30[Asia/Calcutta]")

@Api(value = "ReviewResource", description = "the ReviewResource API")
public interface ReviewResourceApi {

    @ApiOperation(value = "createReview", nickname = "createReviewUsingPOST", notes = "", response = ReviewDTO.class, tags={ "review-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReviewDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reviews",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ReviewDTO> createReviewUsingPOST(@ApiParam(value = "reviewDTO" ,required=true )  @Valid @RequestBody ReviewDTO reviewDTO);


    @ApiOperation(value = "deleteReview", nickname = "deleteReviewUsingDELETE", notes = "", tags={ "review-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/reviews/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteReviewUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllReviews", nickname = "getAllReviewsUsingGET", notes = "", response = ReviewDTO.class, responseContainer = "List", tags={ "review-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReviewDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reviews",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ReviewDTO>> getAllReviewsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getReview", nickname = "getReviewUsingGET", notes = "", response = ReviewDTO.class, tags={ "review-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReviewDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reviews/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ReviewDTO> getReviewUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "modelToDto", nickname = "modelToDtoUsingPOST", notes = "", response = ReviewDTO.class, tags={ "review-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReviewDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/review/modelToDto",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ReviewDTO> modelToDtoUsingPOST(@ApiParam(value = "Review" ,required=true )  @Valid @RequestBody Review review);


    @ApiOperation(value = "searchReviews", nickname = "searchReviewsUsingGET", notes = "", response = ReviewDTO.class, responseContainer = "List", tags={ "review-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReviewDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/reviews",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ReviewDTO>> searchReviewsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateReview", nickname = "updateReviewUsingPUT", notes = "", response = ReviewDTO.class, tags={ "review-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReviewDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reviews",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<ReviewDTO> updateReviewUsingPUT(@ApiParam(value = "reviewDTO" ,required=true )  @Valid @RequestBody ReviewDTO reviewDTO);

}
