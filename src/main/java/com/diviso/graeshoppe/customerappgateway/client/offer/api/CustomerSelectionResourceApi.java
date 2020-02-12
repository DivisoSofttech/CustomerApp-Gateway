/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.customerappgateway.client.offer.api;

import com.diviso.graeshoppe.customerappgateway.client.offer.model.CustomerSelectionDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-12T12:18:57.994+05:30[Asia/Calcutta]")

@Api(value = "CustomerSelectionResource", description = "the CustomerSelectionResource API")
public interface CustomerSelectionResourceApi {

    @ApiOperation(value = "createCustomerSelection", nickname = "createCustomerSelectionUsingPOST", notes = "", response = CustomerSelectionDTO.class, tags={ "customer-selection-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerSelectionDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/customer-selections",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<CustomerSelectionDTO> createCustomerSelectionUsingPOST(@ApiParam(value = "customerSelectionDTO" ,required=true )  @Valid @RequestBody CustomerSelectionDTO customerSelectionDTO);


    @ApiOperation(value = "deleteCustomerSelection", nickname = "deleteCustomerSelectionUsingDELETE", notes = "", tags={ "customer-selection-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/customer-selections/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCustomerSelectionUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllCustomerSelections", nickname = "getAllCustomerSelectionsUsingGET", notes = "", response = CustomerSelectionDTO.class, responseContainer = "List", tags={ "customer-selection-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerSelectionDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/customer-selections",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<CustomerSelectionDTO>> getAllCustomerSelectionsUsingGET(@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getCustomerSelection", nickname = "getCustomerSelectionUsingGET", notes = "", response = CustomerSelectionDTO.class, tags={ "customer-selection-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerSelectionDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/customer-selections/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<CustomerSelectionDTO> getCustomerSelectionUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchCustomerSelections", nickname = "searchCustomerSelectionsUsingGET", notes = "", response = CustomerSelectionDTO.class, responseContainer = "List", tags={ "customer-selection-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerSelectionDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/customer-selections",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<CustomerSelectionDTO>> searchCustomerSelectionsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "updateCustomerSelection", nickname = "updateCustomerSelectionUsingPUT", notes = "", response = CustomerSelectionDTO.class, tags={ "customer-selection-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CustomerSelectionDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/customer-selections",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<CustomerSelectionDTO> updateCustomerSelectionUsingPUT(@ApiParam(value = "customerSelectionDTO" ,required=true )  @Valid @RequestBody CustomerSelectionDTO customerSelectionDTO);

}
