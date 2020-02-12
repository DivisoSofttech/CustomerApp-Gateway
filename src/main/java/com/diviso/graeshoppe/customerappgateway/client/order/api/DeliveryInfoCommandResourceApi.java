/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.customerappgateway.client.order.api;

import com.diviso.graeshoppe.customerappgateway.client.order.model.CommandResource;
import com.diviso.graeshoppe.customerappgateway.client.order.model.DeliveryInfoDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-12T12:18:43.416+05:30[Asia/Calcutta]")

@Api(value = "DeliveryInfoCommandResource", description = "the DeliveryInfoCommandResource API")
public interface DeliveryInfoCommandResourceApi {

    @ApiOperation(value = "createDeliveryInfo", nickname = "createDeliveryInfoUsingPOST", notes = "", response = CommandResource.class, tags={ "delivery-info-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CommandResource.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/delivery-infos/{taskId}/{orderId}",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<CommandResource> createDeliveryInfoUsingPOST(@ApiParam(value = "orderId",required=true) @PathVariable("orderId") String orderId,@ApiParam(value = "taskId",required=true) @PathVariable("taskId") String taskId,@ApiParam(value = "deliveryInfoDTO" ,required=true )  @Valid @RequestBody DeliveryInfoDTO deliveryInfoDTO);


    @ApiOperation(value = "deleteDeliveryInfo", nickname = "deleteDeliveryInfoUsingDELETE", notes = "", tags={ "delivery-info-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/delivery-infos/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDeliveryInfoUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllDeliveryInfos", nickname = "getAllDeliveryInfosUsingGET", notes = "", response = DeliveryInfoDTO.class, responseContainer = "List", tags={ "delivery-info-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeliveryInfoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/delivery-infos",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<DeliveryInfoDTO>> getAllDeliveryInfosUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getDeliveryInfo", nickname = "getDeliveryInfoUsingGET", notes = "", response = DeliveryInfoDTO.class, tags={ "delivery-info-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeliveryInfoDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/delivery-infos/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<DeliveryInfoDTO> getDeliveryInfoUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchDeliveryInfos", nickname = "searchDeliveryInfosUsingGET", notes = "", response = DeliveryInfoDTO.class, responseContainer = "List", tags={ "delivery-info-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeliveryInfoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/delivery-infos",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<DeliveryInfoDTO>> searchDeliveryInfosUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateDeliveryInfo", nickname = "updateDeliveryInfoUsingPUT", notes = "", response = DeliveryInfoDTO.class, tags={ "delivery-info-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeliveryInfoDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/delivery-infos",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<DeliveryInfoDTO> updateDeliveryInfoUsingPUT(@ApiParam(value = "deliveryInfoDTO" ,required=true )  @Valid @RequestBody DeliveryInfoDTO deliveryInfoDTO);

}
