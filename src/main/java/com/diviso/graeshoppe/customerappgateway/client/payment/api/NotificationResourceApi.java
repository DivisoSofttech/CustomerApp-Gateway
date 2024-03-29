/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.customerappgateway.client.payment.api;

import com.diviso.graeshoppe.customerappgateway.client.payment.model.NotificationDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-12T12:18:51.390+05:30[Asia/Calcutta]")

@Api(value = "NotificationResource", description = "the NotificationResource API")
public interface NotificationResourceApi {

    @ApiOperation(value = "createNotification", nickname = "createNotificationUsingPOST", notes = "", response = NotificationDTO.class, tags={ "notification-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NotificationDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/notifications",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<NotificationDTO> createNotificationUsingPOST(@ApiParam(value = "notificationDTO" ,required=true )  @Valid @RequestBody NotificationDTO notificationDTO);


    @ApiOperation(value = "deleteNotification", nickname = "deleteNotificationUsingDELETE", notes = "", tags={ "notification-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/notifications/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteNotificationUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllNotifications", nickname = "getAllNotificationsUsingGET", notes = "", response = NotificationDTO.class, responseContainer = "List", tags={ "notification-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NotificationDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/notifications",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<NotificationDTO>> getAllNotificationsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getNotification", nickname = "getNotificationUsingGET", notes = "", response = NotificationDTO.class, tags={ "notification-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NotificationDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/notifications/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<NotificationDTO> getNotificationUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchNotifications", nickname = "searchNotificationsUsingGET", notes = "", response = NotificationDTO.class, responseContainer = "List", tags={ "notification-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NotificationDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/notifications",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<NotificationDTO>> searchNotificationsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateNotification", nickname = "updateNotificationUsingPUT", notes = "", response = NotificationDTO.class, tags={ "notification-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NotificationDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/notifications",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<NotificationDTO> updateNotificationUsingPUT(@ApiParam(value = "notificationDTO" ,required=true )  @Valid @RequestBody NotificationDTO notificationDTO);

}
