package io.swagger.api;

import io.swagger.model.ApplyCompOff;
import io.swagger.model.ApplyLeave;
import io.swagger.model.History;
import io.swagger.model.UserLeaves;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-06T06:17:29.965Z[GMT]")
@Controller
public class LeaveManagementApiController implements LeaveManagementApi {

    private static final Logger log = LoggerFactory.getLogger(LeaveManagementApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LeaveManagementApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addLeaveHistory(@ApiParam(value = "History Object that needs to be added" ,required=true )  @Valid @RequestBody List<History> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> addLeaves(@ApiParam(value = "Leave Object that needs to be added" ,required=true )  @Valid @RequestBody UserLeaves body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> applyCompOff(@ApiParam(value = "ApplyLeave Object that needs to be added" ,required=true )  @Valid @RequestBody ApplyCompOff body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> applyLeaves(@ApiParam(value = "ApplyLeave Object that needs to be added" ,required=true )  @Valid @RequestBody ApplyLeave body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteEmployeeLeaveHistory(@ApiParam(value = "Employee id to delete",required=true) @PathVariable("employeeId") String employeeId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteleaves(@ApiParam(value = "Employee id to delete",required=true) @PathVariable("employeeId") String employeeId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<UserLeaves>> getAllEmployeeLeaveHistory(@ApiParam(value = "Employee id to delete",required=true) @PathVariable("employeeId") String employeeId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UserLeaves>>(objectMapper.readValue("[ {\n  \"earnedLeave\" : 1,\n  \"compOff\" : 5,\n  \"employeeId\" : \"employeeId\",\n  \"maternityLeave\" : 5,\n  \"displayStatus\" : true,\n  \"id\" : \"id\",\n  \"lossOffPay\" : 2,\n  \"sickLeave\" : 0,\n  \"casualLeave\" : 6\n}, {\n  \"earnedLeave\" : 1,\n  \"compOff\" : 5,\n  \"employeeId\" : \"employeeId\",\n  \"maternityLeave\" : 5,\n  \"displayStatus\" : true,\n  \"id\" : \"id\",\n  \"lossOffPay\" : 2,\n  \"sickLeave\" : 0,\n  \"casualLeave\" : 6\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UserLeaves>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UserLeaves>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<UserLeaves>> getAllleaves() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UserLeaves>>(objectMapper.readValue("[ {\n  \"earnedLeave\" : 1,\n  \"compOff\" : 5,\n  \"employeeId\" : \"employeeId\",\n  \"maternityLeave\" : 5,\n  \"displayStatus\" : true,\n  \"id\" : \"id\",\n  \"lossOffPay\" : 2,\n  \"sickLeave\" : 0,\n  \"casualLeave\" : 6\n}, {\n  \"earnedLeave\" : 1,\n  \"compOff\" : 5,\n  \"employeeId\" : \"employeeId\",\n  \"maternityLeave\" : 5,\n  \"displayStatus\" : true,\n  \"id\" : \"id\",\n  \"lossOffPay\" : 2,\n  \"sickLeave\" : 0,\n  \"casualLeave\" : 6\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UserLeaves>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UserLeaves>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<UserLeaves>> getEmployeeLeaveHistory(@ApiParam(value = "Employee id to delete",required=true) @PathVariable("employeeId") String employeeId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UserLeaves>>(objectMapper.readValue("[ {\n  \"earnedLeave\" : 1,\n  \"compOff\" : 5,\n  \"employeeId\" : \"employeeId\",\n  \"maternityLeave\" : 5,\n  \"displayStatus\" : true,\n  \"id\" : \"id\",\n  \"lossOffPay\" : 2,\n  \"sickLeave\" : 0,\n  \"casualLeave\" : 6\n}, {\n  \"earnedLeave\" : 1,\n  \"compOff\" : 5,\n  \"employeeId\" : \"employeeId\",\n  \"maternityLeave\" : 5,\n  \"displayStatus\" : true,\n  \"id\" : \"id\",\n  \"lossOffPay\" : 2,\n  \"sickLeave\" : 0,\n  \"casualLeave\" : 6\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UserLeaves>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UserLeaves>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<UserLeaves>> getLeavesByEmployeeId(@ApiParam(value = "EmployeeId to filter by",required=true) @PathVariable("employeeId") Long employeeId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UserLeaves>>(objectMapper.readValue("[ {\n  \"earnedLeave\" : 1,\n  \"compOff\" : 5,\n  \"employeeId\" : \"employeeId\",\n  \"maternityLeave\" : 5,\n  \"displayStatus\" : true,\n  \"id\" : \"id\",\n  \"lossOffPay\" : 2,\n  \"sickLeave\" : 0,\n  \"casualLeave\" : 6\n}, {\n  \"earnedLeave\" : 1,\n  \"compOff\" : 5,\n  \"employeeId\" : \"employeeId\",\n  \"maternityLeave\" : 5,\n  \"displayStatus\" : true,\n  \"id\" : \"id\",\n  \"lossOffPay\" : 2,\n  \"sickLeave\" : 0,\n  \"casualLeave\" : 6\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UserLeaves>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UserLeaves>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateLeaveHistory(@ApiParam(value = "History Object that needs to be added" ,required=true )  @Valid @RequestBody List<History> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
