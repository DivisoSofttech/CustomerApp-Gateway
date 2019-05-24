/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.order.api;

import com.diviso.graeshoppe.client.order.model.CommandResource;
import com.diviso.graeshoppe.client.order.model.OrderPaymentDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-23T15:17:21.066+05:30[Asia/Kolkata]")

@Api(value = "PaymentCommandResource", description = "the PaymentCommandResource API")
public interface PaymentCommandResourceApi {

    @ApiOperation(value = "createPayment", nickname = "createPaymentUsingPOST", notes = "", response = OrderPaymentDTO.class, tags={ "payment-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderPaymentDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/payments",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<OrderPaymentDTO> createPaymentUsingPOST(@ApiParam(value = "paymentDTO" ,required=true )  @Valid @RequestBody OrderPaymentDTO paymentDTO);


    @ApiOperation(value = "deletePayment", nickname = "deletePaymentUsingDELETE", notes = "", tags={ "payment-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/payments/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePaymentUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllPayments", nickname = "getAllPaymentsUsingGET", notes = "", response = OrderPaymentDTO.class, responseContainer = "List", tags={ "payment-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderPaymentDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/payments",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<OrderPaymentDTO>> getAllPaymentsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getPayment", nickname = "getPaymentUsingGET", notes = "", response = OrderPaymentDTO.class, tags={ "payment-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderPaymentDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/payments/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<OrderPaymentDTO> getPaymentUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "makePayment", nickname = "makePaymentUsingPOST", notes = "", response = CommandResource.class, tags={ "payment-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CommandResource.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/payments/makePayment/{taskId}",
        produces = "*/*", 
        method = RequestMethod.POST)
    ResponseEntity<CommandResource> makePaymentUsingPOST(@NotNull @ApiParam(value = "status", required = true) @Valid @RequestParam(value = "status", required = true) String status,@ApiParam(value = "taskId",required=true) @PathVariable("taskId") String taskId);


    @ApiOperation(value = "searchPayments", nickname = "searchPaymentsUsingGET", notes = "", response = OrderPaymentDTO.class, responseContainer = "List", tags={ "payment-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderPaymentDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/payments",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<OrderPaymentDTO>> searchPaymentsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updatePayment", nickname = "updatePaymentUsingPUT", notes = "", response = OrderPaymentDTO.class, tags={ "payment-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderPaymentDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/payments",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<OrderPaymentDTO> updatePaymentUsingPUT(@ApiParam(value = "paymentDTO" ,required=true )  @Valid @RequestBody OrderPaymentDTO paymentDTO);

}
