/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.customerappgateway.client.order.api;

import com.diviso.graeshoppe.customerappgateway.client.order.model.AuxilaryOrderLineDTO;
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

@Api(value = "AuxilaryOrderLineResource", description = "the AuxilaryOrderLineResource API")
public interface AuxilaryOrderLineResourceApi {

    @ApiOperation(value = "createAuxilaryOrderLine", nickname = "createAuxilaryOrderLineUsingPOST", notes = "", response = AuxilaryOrderLineDTO.class, tags={ "auxilary-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AuxilaryOrderLineDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/auxilary-order-lines",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<AuxilaryOrderLineDTO> createAuxilaryOrderLineUsingPOST(@ApiParam(value = "auxilaryOrderLineDTO" ,required=true )  @Valid @RequestBody AuxilaryOrderLineDTO auxilaryOrderLineDTO);


    @ApiOperation(value = "deleteAuxilaryOrderLine", nickname = "deleteAuxilaryOrderLineUsingDELETE", notes = "", tags={ "auxilary-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/auxilary-order-lines/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAuxilaryOrderLineUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllAuxilaryOrderLines", nickname = "getAllAuxilaryOrderLinesUsingGET", notes = "", response = AuxilaryOrderLineDTO.class, responseContainer = "List", tags={ "auxilary-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AuxilaryOrderLineDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/auxilary-order-lines",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<AuxilaryOrderLineDTO>> getAllAuxilaryOrderLinesUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getAuxilaryOrderLine", nickname = "getAuxilaryOrderLineUsingGET", notes = "", response = AuxilaryOrderLineDTO.class, tags={ "auxilary-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AuxilaryOrderLineDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/auxilary-order-lines/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<AuxilaryOrderLineDTO> getAuxilaryOrderLineUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchAuxilaryOrderLines", nickname = "searchAuxilaryOrderLinesUsingGET", notes = "", response = AuxilaryOrderLineDTO.class, responseContainer = "List", tags={ "auxilary-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AuxilaryOrderLineDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/auxilary-order-lines",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<AuxilaryOrderLineDTO>> searchAuxilaryOrderLinesUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateAuxilaryOrderLine", nickname = "updateAuxilaryOrderLineUsingPUT", notes = "", response = AuxilaryOrderLineDTO.class, tags={ "auxilary-order-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AuxilaryOrderLineDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/auxilary-order-lines",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<AuxilaryOrderLineDTO> updateAuxilaryOrderLineUsingPUT(@ApiParam(value = "auxilaryOrderLineDTO" ,required=true )  @Valid @RequestBody AuxilaryOrderLineDTO auxilaryOrderLineDTO);

}
