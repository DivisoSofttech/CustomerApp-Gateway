/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.order.api;

import com.diviso.graeshoppe.client.order.model.OrderMaster;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-20T12:09:18.063864+05:30[Asia/Kolkata]")

@Api(value = "ReportQueryResource", description = "the ReportQueryResource API")
public interface ReportQueryResourceApi {

    @ApiOperation(value = "findOrderCountByCustomerIdAndStatusName", nickname = "findOrderCountByCustomerIdAndStatusNameUsingGET", notes = "", response = Long.class, tags={ "report-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Long.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/order-from-customer-status/{customerId}/{statusName}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Long> findOrderCountByCustomerIdAndStatusNameUsingGET(@ApiParam(value = "statusName",required=true) @PathVariable("statusName") String statusName,@ApiParam(value = "customerId") @Valid @RequestParam(value = "customerId", required = false) String customerId,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "findOrderCountByCustomerIdAndStoreId", nickname = "findOrderCountByCustomerIdAndStoreIdUsingGET", notes = "", response = Long.class, tags={ "report-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Long.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/order-from-customer-storeid/{storeId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Long> findOrderCountByCustomerIdAndStoreIdUsingGET(@ApiParam(value = "customerId",required=true) @PathVariable("customerId") String customerId,@ApiParam(value = "storeId",required=true) @PathVariable("storeId") String storeId,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "findOrderCountByCustomerId", nickname = "findOrderCountByCustomerIdUsingGET", notes = "", response = Long.class, tags={ "report-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Long.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/order-from-customer/{customerId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Long> findOrderCountByCustomerIdUsingGET(@ApiParam(value = "customerId",required=true) @PathVariable("customerId") String customerId,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getOrderMaster", nickname = "getOrderMasterUsingGET", notes = "", response = OrderMaster.class, tags={ "report-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderMaster.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/main-report/{orderId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<OrderMaster> getOrderMasterUsingGET(@ApiParam(value = "orderId",required=true) @PathVariable("orderId") String orderId,@ApiParam(value = "statusName",required=true) @PathVariable("statusName") String statusName,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);

}
