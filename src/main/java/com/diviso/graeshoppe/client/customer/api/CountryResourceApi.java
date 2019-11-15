/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.client.customer.api;

import com.diviso.graeshoppe.client.customer.model.CountryDTO;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-15T08:26:13.311849+05:30[Asia/Kolkata]")

@Api(value = "CountryResource", description = "the CountryResource API")
public interface CountryResourceApi {

    @ApiOperation(value = "createCountry", nickname = "createCountryUsingPOST", notes = "", response = CountryDTO.class, tags={ "country-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CountryDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/countries",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<CountryDTO> createCountryUsingPOST(@ApiParam(value = "countryDTO" ,required=true )  @Valid @RequestBody CountryDTO countryDTO);


    @ApiOperation(value = "deleteCountry", nickname = "deleteCountryUsingDELETE", notes = "", tags={ "country-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/countries/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCountryUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllCountries", nickname = "getAllCountriesUsingGET", notes = "", response = CountryDTO.class, responseContainer = "List", tags={ "country-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CountryDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/countries",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<CountryDTO>> getAllCountriesUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getCountry", nickname = "getCountryUsingGET", notes = "", response = CountryDTO.class, tags={ "country-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CountryDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/countries/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<CountryDTO> getCountryUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchCountries", nickname = "searchCountriesUsingGET", notes = "", response = CountryDTO.class, responseContainer = "List", tags={ "country-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CountryDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/countries",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<CountryDTO>> searchCountriesUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateCountry", nickname = "updateCountryUsingPUT", notes = "", response = CountryDTO.class, tags={ "country-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CountryDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/countries",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<CountryDTO> updateCountryUsingPUT(@ApiParam(value = "countryDTO" ,required=true )  @Valid @RequestBody CountryDTO countryDTO);

}
