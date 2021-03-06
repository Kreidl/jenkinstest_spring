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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Validated
@Api(value = "people", description = "the people API")
public interface PeopleApi {

    @ApiOperation(value = "GetPeople", nickname = "getPeople", notes = "", response = PersonModel.class, responseContainer = "List", tags={ "people", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Schemas", response = PersonModel.class, responseContainer = "List") })
    @RequestMapping(value = "/people",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PersonModel>> getPeople();


    @ApiOperation(value = "Get Person", nickname = "getPerson", notes = "", response = PersonModel.class, tags={ "people", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Schemas", response = PersonModel.class) })
    @RequestMapping(value = "/people/{personname}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<PersonModel> getPerson(@ApiParam(value = "a Name of a Person",required=true) @PathVariable("personname") String personname);

}
