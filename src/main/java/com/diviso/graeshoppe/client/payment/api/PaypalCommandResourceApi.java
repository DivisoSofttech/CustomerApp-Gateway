/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.payment.api;

import java.util.List;
import com.diviso.graeshoppe.client.payment.model.Patch;
import com.diviso.graeshoppe.client.payment.model.PaymentExecutionRequest;
import com.diviso.graeshoppe.client.payment.model.PaymentInitiateRequest;
import com.diviso.graeshoppe.client.payment.model.PaymentInitiateResponse;
import com.diviso.graeshoppe.client.payment.model.RefundSaleRequest;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-23T12:15:47.246272+05:30[Asia/Kolkata]")

@Api(value = "PaypalCommandResource", description = "the PaypalCommandResource API")
public interface PaypalCommandResourceApi {

    @ApiOperation(value = "executePayment", nickname = "executePaymentUsingPOST", notes = "", tags={ "paypal-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/payments/paypal/{payment_id}/execute",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Void> executePaymentUsingPOST(@ApiParam(value = "payment_id",required=true) @PathVariable("payment_id") String paymentId,@ApiParam(value = "paymentExecutionRequest"  )  @Valid @RequestBody PaymentExecutionRequest paymentExecutionRequest);


    @ApiOperation(value = "initiatePayment", nickname = "initiatePaymentUsingPOST", notes = "", response = PaymentInitiateResponse.class, tags={ "paypal-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PaymentInitiateResponse.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/payments/paypal/initiate",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<PaymentInitiateResponse> initiatePaymentUsingPOST(@ApiParam(value = "paymentInitiateRequest" ,required=true )  @Valid @RequestBody PaymentInitiateRequest paymentInitiateRequest);


    @ApiOperation(value = "refundSale", nickname = "refundSaleUsingPOST", notes = "", tags={ "paypal-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/payments/paypal/sale/{sale_id}/refund",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Void> refundSaleUsingPOST(@ApiParam(value = "sale_id",required=true) @PathVariable("sale_id") String saleId,@ApiParam(value = "refundSaleRequest" ,required=true )  @Valid @RequestBody RefundSaleRequest refundSaleRequest);


    @ApiOperation(value = "updatePayment", nickname = "updatePaymentUsingPATCH", notes = "", tags={ "paypal-command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/payments/paypal/{payment_id}",
        consumes = "application/json",
        method = RequestMethod.PATCH)
    ResponseEntity<Void> updatePaymentUsingPATCH(@ApiParam(value = "payment_id",required=true) @PathVariable("payment_id") String paymentId,@ApiParam(value = "patchRequest" ,required=true )  @Valid @RequestBody List<Patch> patch);

}
