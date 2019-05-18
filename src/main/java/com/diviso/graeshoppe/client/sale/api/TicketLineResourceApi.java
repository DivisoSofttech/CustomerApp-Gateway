/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.sale.api;

import com.diviso.graeshoppe.client.sale.model.TicketLineDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-18T09:48:16.188+05:30[Asia/Kolkata]")

@Api(value = "TicketLineResource", description = "the TicketLineResource API")
public interface TicketLineResourceApi {

    @ApiOperation(value = "createTicketLine", nickname = "createTicketLineUsingPOST", notes = "", response = TicketLineDTO.class, tags={ "ticket-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TicketLineDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/ticket-lines",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<TicketLineDTO> createTicketLineUsingPOST(@ApiParam(value = "ticketLineDTO" ,required=true )  @Valid @RequestBody TicketLineDTO ticketLineDTO);


    @ApiOperation(value = "deleteTicketLine", nickname = "deleteTicketLineUsingDELETE", notes = "", tags={ "ticket-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/ticket-lines/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteTicketLineUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "findAllTicketLinesBySaleId", nickname = "findAllTicketLinesBySaleIdUsingGET", notes = "", response = TicketLineDTO.class, responseContainer = "List", tags={ "ticket-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TicketLineDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/findAllTicketLinesBySaleId/{saleId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<TicketLineDTO>> findAllTicketLinesBySaleIdUsingGET(@ApiParam(value = "saleId",required=true) @PathVariable("saleId") Long saleId);


    @ApiOperation(value = "getAllTicketLines", nickname = "getAllTicketLinesUsingGET", notes = "", response = TicketLineDTO.class, responseContainer = "List", tags={ "ticket-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TicketLineDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/ticket-lines",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<TicketLineDTO>> getAllTicketLinesUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getTicketLine", nickname = "getTicketLineUsingGET", notes = "", response = TicketLineDTO.class, tags={ "ticket-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TicketLineDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/ticket-lines/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<TicketLineDTO> getTicketLineUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchTicketLines", nickname = "searchTicketLinesUsingGET", notes = "", response = TicketLineDTO.class, responseContainer = "List", tags={ "ticket-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TicketLineDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/ticket-lines",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<TicketLineDTO>> searchTicketLinesUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateTicketLine", nickname = "updateTicketLineUsingPUT", notes = "", response = TicketLineDTO.class, tags={ "ticket-line-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TicketLineDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/ticket-lines",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<TicketLineDTO> updateTicketLineUsingPUT(@ApiParam(value = "ticketLineDTO" ,required=true )  @Valid @RequestBody TicketLineDTO ticketLineDTO);

}
