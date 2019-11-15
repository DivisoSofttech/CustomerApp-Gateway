/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.offer.api;

import com.diviso.graeshoppe.client.offer.model.User;
import com.diviso.graeshoppe.client.offer.model.UserDTO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.Valid;
import java.util.List;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T16:47:08.654128+05:30[Asia/Kolkata]")

@Api(value = "UserResource", description = "the UserResource API")
public interface UserResourceApi {

    @ApiOperation(value = "getAllUsers", nickname = "getAllUsersUsingGET", notes = "", response = UserDTO.class, responseContainer = "List", tags={ "user-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/users",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<UserDTO>> getAllUsersUsingGET(@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Long offset,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,@ApiParam(value = "") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "") @Valid @RequestParam(value = "paged", required = false) Boolean paged,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort,@ApiParam(value = "") @Valid @RequestParam(value = "sort.sorted", required = false) Boolean sortSorted,@ApiParam(value = "") @Valid @RequestParam(value = "sort.unsorted", required = false) Boolean sortUnsorted,@ApiParam(value = "") @Valid @RequestParam(value = "unpaged", required = false) Boolean unpaged);


    @ApiOperation(value = "getAuthorities", nickname = "getAuthoritiesUsingGET", notes = "", response = String.class, responseContainer = "List", tags={ "user-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/users/authorities",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<String>> getAuthoritiesUsingGET();


    @ApiOperation(value = "getUser", nickname = "getUserUsingGET", notes = "", response = UserDTO.class, tags={ "user-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/users/{login}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<UserDTO> getUserUsingGET(@ApiParam(value = "login",required=true) @PathVariable("login") String login);


    @ApiOperation(value = "search", nickname = "searchUsingGET", notes = "", response = User.class, responseContainer = "List", tags={ "user-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/users/{query}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<User>> searchUsingGET(@ApiParam(value = "query",required=true) @PathVariable("query") String query);

}
