/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.customerappgateway.client.store.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.diviso.graeshoppe.customerappgateway.client.store.model.DeliveryInfoDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-30T14:09:05.929+05:30[Asia/Kolkata]")

@Api(value = "DeliveryInfoResource", description = "the DeliveryInfoResource API")
public interface DeliveryInfoResourceApi {

    @ApiOperation(value = "createDeliveryInfo", nickname = "createDeliveryInfoUsingPOST", notes = "", response = DeliveryInfoDTO.class, tags={ "delivery-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeliveryInfoDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/delivery-infos",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<DeliveryInfoDTO> createDeliveryInfoUsingPOST(@ApiParam(value = "deliveryInfoDTO" ,required=true )  @Valid @RequestBody DeliveryInfoDTO deliveryInfoDTO);


    @ApiOperation(value = "deleteDeliveryInfo", nickname = "deleteDeliveryInfoUsingDELETE", notes = "", tags={ "delivery-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/delivery-infos/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDeliveryInfoUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllDeliveryInfos", nickname = "getAllDeliveryInfosUsingGET", notes = "", response = DeliveryInfoDTO.class, responseContainer = "List", tags={ "delivery-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeliveryInfoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/delivery-infos",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<DeliveryInfoDTO>> getAllDeliveryInfosUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getDeliveryInfo", nickname = "getDeliveryInfoUsingGET", notes = "", response = DeliveryInfoDTO.class, tags={ "delivery-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeliveryInfoDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/delivery-infos/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<DeliveryInfoDTO> getDeliveryInfoUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchDeliveryInfos", nickname = "searchDeliveryInfosUsingGET", notes = "", response = DeliveryInfoDTO.class, responseContainer = "List", tags={ "delivery-info-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeliveryInfoDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/delivery-infos",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<DeliveryInfoDTO>> searchDeliveryInfosUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateDeliveryInfo", nickname = "updateDeliveryInfoUsingPUT", notes = "", response = DeliveryInfoDTO.class, tags={ "delivery-info-resource", })
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
