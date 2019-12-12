/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.order.api;

import com.diviso.graeshoppe.client.order.model.OpenTask;
import com.diviso.graeshoppe.client.order.model.OrderDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-12T14:59:45.796530+05:30[Asia/Kolkata]")

@Api(value = "OrderQueryResource", description = "the OrderQueryResource API")
public interface OrderQueryResourceApi {

    @ApiOperation(value = "countByCustomerIdAndStatusName", nickname = "countByCustomerIdAndStatusNameUsingGET", notes = "", response = Long.class, tags={ "order-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Long.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/count-by-customerid-statusname/{customerId}/{statusName}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Long> countByCustomerIdAndStatusNameUsingGET(@ApiParam(value = "customerId",required=true) @PathVariable("customerId") String customerId,@ApiParam(value = "statusName",required=true) @PathVariable("statusName") String statusName);


    @ApiOperation(value = "countByStoreIdAndCustomerId", nickname = "countByStoreIdAndCustomerIdUsingGET", notes = "", response = Long.class, tags={ "order-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Long.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/count-by-storeid-customerid/{storeId}/{customerId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<Long> countByStoreIdAndCustomerIdUsingGET(@ApiParam(value = "customerId",required=true) @PathVariable("customerId") String customerId,@ApiParam(value = "storeId",required=true) @PathVariable("storeId") String storeId);


    @ApiOperation(value = "findByDeliveryInfoId", nickname = "findByDeliveryInfoIdUsingGET", notes = "", response = OrderDTO.class, tags={ "order-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/findByDeliveryInfoId/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<OrderDTO> findByDeliveryInfoIdUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getTaskDetails", nickname = "getTaskDetailsUsingGET", notes = "", response = OpenTask.class, tags={ "order-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OpenTask.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/taskDetails/{taskName}/{orderId}/{storeId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<OpenTask> getTaskDetailsUsingGET(@ApiParam(value = "orderId",required=true) @PathVariable("orderId") String orderId,@ApiParam(value = "storeId",required=true) @PathVariable("storeId") String storeId,@ApiParam(value = "taskName",required=true) @PathVariable("taskName") String taskName);


    @ApiOperation(value = "getTasks", nickname = "getTasksUsingGET", notes = "", response = OpenTask.class, responseContainer = "List", tags={ "order-query-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OpenTask.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/tasks",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<OpenTask>> getTasksUsingGET(@ApiParam(value = "assignee") @Valid @RequestParam(value = "assignee", required = false) String assignee,@ApiParam(value = "assigneeLike") @Valid @RequestParam(value = "assigneeLike", required = false) String assigneeLike,@ApiParam(value = "candidateGroup") @Valid @RequestParam(value = "candidateGroup", required = false) String candidateGroup,@ApiParam(value = "candidateGroups") @Valid @RequestParam(value = "candidateGroups", required = false) String candidateGroups,@ApiParam(value = "candidateUser") @Valid @RequestParam(value = "candidateUser", required = false) String candidateUser,@ApiParam(value = "createdAfter") @Valid @RequestParam(value = "createdAfter", required = false) String createdAfter,@ApiParam(value = "createdBefore") @Valid @RequestParam(value = "createdBefore", required = false) String createdBefore,@ApiParam(value = "createdOn") @Valid @RequestParam(value = "createdOn", required = false) String createdOn,@ApiParam(value = "name") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "nameLike") @Valid @RequestParam(value = "nameLike", required = false) String nameLike);

}
