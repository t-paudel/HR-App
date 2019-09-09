package io.swagger.api;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiParam;
import io.swagger.model.AvailCompOff;
import io.swagger.model.ApplyLeave;
import io.swagger.model.History;
import io.swagger.model.MessageStatus;
import io.swagger.model.UserLeaves;
import io.swagger.service.HistoryService;
import io.swagger.service.LeaveService;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-06T06:17:29.965Z[GMT]")

@RestController
public class LeaveManagementApiController implements LeaveManagementApi {

     
    @Autowired
    private LeaveService leaveService;
    
    @Autowired
    private HistoryService historyService;
    
    public ResponseEntity<UserLeaves> addLeaves(@ApiParam(value = "Leave Object that needs to be added" ,required=true )  @Valid @RequestBody UserLeaves body) 
    {
    	System.out.println("inside addLeaves()");
    	
    	UserLeaves leaves = new UserLeaves();
        leaves = leaveService.addLeaves(body);
        
        return new ResponseEntity<UserLeaves>(leaves,HttpStatus.OK);
    }
    
    public ResponseEntity<UserLeaves> getLeavesByEmployeeId(@ApiParam(value = "EmployeeId to filter by",required=true) @PathVariable("employeeId") String empId) 
    {
    	System.out.println("inside getLeavesByEmployeeId()");
    	
    	UserLeaves leaves = new UserLeaves();
    	leaves = leaveService.getLeavesByEmployeeId(empId);
    	
        return new ResponseEntity<UserLeaves>(leaves,HttpStatus.OK);
    }
    
    public ResponseEntity<MessageStatus> deleteleaves(@ApiParam(value = "Employee id to delete",required=true) @PathVariable("employeeId") String empId) 
    {
    	System.out.println("inside deleteleaves()");
    	
    	MessageStatus status = new MessageStatus();
    	status = leaveService.deleteLeaves(empId);
    	
        return new ResponseEntity<MessageStatus>(status,HttpStatus.OK);
    }
    
    public ResponseEntity<MessageStatus> applyLeave(@ApiParam(value = "ApplyLeave Object that needs to be added" ,required=true )  @Valid @RequestBody ApplyLeave body) 
    {
    	System.out.println("inside applyLeaves()");
    	
    	MessageStatus status = new MessageStatus();
    	status = leaveService.applyLeave(body);
    	return new ResponseEntity<MessageStatus>(status,HttpStatus.OK);
    }
       
    public ResponseEntity<MessageStatus> availCompOff(@ApiParam(value = "ApplyLeave Object that needs to be added" ,required=true )  @Valid @RequestBody AvailCompOff body) 
    {
    	System.out.println("inside applyCompOff()");
    	
    	MessageStatus status = new MessageStatus();
        status = leaveService.ApplyCompOff(body);
        return new ResponseEntity<MessageStatus>(status,HttpStatus.OK);
    }

    public ResponseEntity<List<History>> getEmployeeLeaveHistory(@ApiParam(value = "Employee id to delete",required=true) @PathVariable("employeeId") String employeeId) 
    {
    	System.out.println("inside getEmployeeLeaveHistory()");
    	
    	List<History> history = new ArrayList<History>();
    	history = historyService.getEmployeeLeaveHistory(employeeId);
    	
    	return new ResponseEntity<List<History>>(history,HttpStatus.OK);
    }  

    public ResponseEntity<History> updateLeaveHistory(@ApiParam(value = "History Object that needs to be added" ,required=true )  @Valid @RequestBody History body) 
    {
    	System.out.println("inside updateLeaveHistory()");
    	
    	History history = new History();
    	history = historyService.updateLeaveHistory(body);
    	
        return new ResponseEntity<History>(history,HttpStatus.OK);
    }
    
    public ResponseEntity<MessageStatus> deleteEmployeeLeaveHistory(@ApiParam(value = "Employee id to delete",required=true) @PathVariable("id") String id) 
    {
    	System.out.println("inside deleteEmployeeLeaveHistory()");
    	
    	MessageStatus status = new MessageStatus();
    	status = historyService.deleteEmployeeLeaveHistory(id);
    	
    	return new ResponseEntity<MessageStatus>(status,HttpStatus.OK);
    }

}
