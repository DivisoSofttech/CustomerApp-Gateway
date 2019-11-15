/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.product.api;

import com.diviso.graeshoppe.client.product.model.ReasonDTO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-22T12:40:29.255+05:30[Asia/Calcutta]")

@Api(value = "ReasonResource", description = "the ReasonResource API")
public interface ReasonResourceApi {

    @ApiOperation(value = "createReason", nickname = "createReasonUsingPOST", notes = "", response = ReasonDTO.class, tags={ "reason-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReasonDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reasons",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ReasonDTO> createReasonUsingPOST(@ApiParam(value = "reasonDTO" ,required=true )  @Valid @RequestBody ReasonDTO reasonDTO);


    @ApiOperation(value = "deleteReason", nickname = "deleteReasonUsingDELETE", notes = "", tags={ "reason-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/reasons/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteReasonUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllReasons", nickname = "getAllReasonsUsingGET", notes = "", response = ReasonDTO.class, responseContainer = "List", tags={ "reason-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReasonDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reasons",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ReasonDTO>> getAllReasonsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getReason", nickname = "getReasonUsingGET", notes = "", response = ReasonDTO.class, tags={ "reason-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReasonDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reasons/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<ReasonDTO> getReasonUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchReasons", nickname = "searchReasonsUsingGET", notes = "", response = ReasonDTO.class, responseContainer = "List", tags={ "reason-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReasonDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/reasons",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<ReasonDTO>> searchReasonsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateReason", nickname = "updateReasonUsingPUT", notes = "", response = ReasonDTO.class, tags={ "reason-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ReasonDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/reasons",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<ReasonDTO> updateReasonUsingPUT(@ApiParam(value = "reasonDTO" ,required=true )  @Valid @RequestBody ReasonDTO reasonDTO);

}
