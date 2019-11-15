/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.report.api;

import com.diviso.graeshoppe.client.report.model.OrderMaster;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-15T11:16:15.523+05:30[Asia/Kolkata]")

@Api(value = "ReportResource", description = "the ReportResource API")
public interface ReportResourceApi {

    @ApiOperation(value = "getReportAsPdf", nickname = "getReportAsPdfUsingGET", notes = "", response = byte[].class, tags={ "report-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/report/pdf/{orderNumber}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> getReportAsPdfUsingGET(@ApiParam(value = "orderNumber",required=true) @PathVariable("orderNumber") String orderNumber);


    @ApiOperation(value = "getReportByOrderNumber", nickname = "getReportByOrderNumberUsingGET", notes = "", response = OrderMaster.class, tags={ "report-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderMaster.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/report/order-report/{orderNumber}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<OrderMaster> getReportByOrderNumberUsingGET(@ApiParam(value = "orderNumber",required=true) @PathVariable("orderNumber") String orderNumber);


    @ApiOperation(value = "getReportSummaryAsPdf", nickname = "getReportSummaryAsPdfUsingGET", notes = "", response = byte[].class, tags={ "report-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/report/reportSummary/{date}/{storeId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> getReportSummaryAsPdfUsingGET(@ApiParam(value = "date",required=true) @PathVariable("date") String date,@ApiParam(value = "storeId",required=true) @PathVariable("storeId") String storeId);


    @ApiOperation(value = "getReportWithAuxAndComboAsPdf", nickname = "getReportWithAuxAndComboAsPdfUsingGET", notes = "", response = byte[].class, tags={ "report-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/report/auxcombo/{orderNumber}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> getReportWithAuxAndComboAsPdfUsingGET(@ApiParam(value = "orderNumber",required=true) @PathVariable("orderNumber") String orderNumber);

}
