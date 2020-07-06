/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.kienast.jenkinstest.rest.api;

import com.kienast.jenkinstest.rest.api.model.PersonModel;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Validated
@Api(value = "getPerson", description = "the getPerson API")
public interface GetPersonApi {

    @ApiOperation(value = "Get Person", nickname = "getPerson", notes = "", response = PersonModel.class, tags={ "getPerson", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Schemas", response = PersonModel.class) })
    @RequestMapping(value = "/getPerson/{personname}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<PersonModel> getPerson(@ApiParam(value = "a Name of a Person",required=true) @PathVariable("personname") String personname);

}