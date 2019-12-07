/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.store.api;

import com.diviso.graeshoppe.client.store.model.StoreAddressDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-02T13:57:13.442+05:30[Asia/Kolkata]")

@Api(value = "StoreAddressResource", description = "the StoreAddressResource API")
public interface StoreAddressResourceApi {

    @ApiOperation(value = "createStoreAddress", nickname = "createStoreAddressUsingPOST", notes = "", response = StoreAddressDTO.class, tags={ "store-address-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = StoreAddressDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/store-addresses",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<StoreAddressDTO> createStoreAddressUsingPOST(@ApiParam(value = "storeAddressDTO" ,required=true )  @Valid @RequestBody StoreAddressDTO storeAddressDTO);


    @ApiOperation(value = "deleteStoreAddress", nickname = "deleteStoreAddressUsingDELETE", notes = "", tags={ "store-address-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/store-addresses/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteStoreAddressUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllStoreAddresses", nickname = "getAllStoreAddressesUsingGET", notes = "", response = StoreAddressDTO.class, responseContainer = "List", tags={ "store-address-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = StoreAddressDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/store-addresses",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<StoreAddressDTO>> getAllStoreAddressesUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getStoreAddress", nickname = "getStoreAddressUsingGET", notes = "", response = StoreAddressDTO.class, tags={ "store-address-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = StoreAddressDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/store-addresses/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<StoreAddressDTO> getStoreAddressUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchStoreAddresses", nickname = "searchStoreAddressesUsingGET", notes = "", response = StoreAddressDTO.class, responseContainer = "List", tags={ "store-address-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = StoreAddressDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/store-addresses",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<StoreAddressDTO>> searchStoreAddressesUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateStoreAddress", nickname = "updateStoreAddressUsingPUT", notes = "", response = StoreAddressDTO.class, tags={ "store-address-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = StoreAddressDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/store-addresses",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<StoreAddressDTO> updateStoreAddressUsingPUT(@ApiParam(value = "storeAddressDTO" ,required=true )  @Valid @RequestBody StoreAddressDTO storeAddressDTO);

}
