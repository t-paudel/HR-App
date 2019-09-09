package io.swagger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.model.AvailCompOff;
import io.swagger.model.ApplyLeave;
import io.swagger.model.History;
import io.swagger.model.MessageStatus;
import io.swagger.model.UserLeaves;
import io.swagger.repository.HistoryRepository;
import io.swagger.repository.LeaveRepository;
import io.swagger.util.DateUtility;
import io.swagger.util.LeaveUtility;

@Service
public class LeaveService 
{
	@Autowired
	private LeaveRepository leaveRepo;
	
	@Autowired
	private HistoryRepository historyRepo;
	
	public UserLeaves addLeaves(UserLeaves data)
	{
		UserLeaves leaves = new UserLeaves();
		leaves = leaveRepo.insert(data);
		
		return leaves;
	}
	
	public UserLeaves getLeavesByEmployeeId(String empId)
	{
		UserLeaves leaves = new UserLeaves();
		leaves = leaveRepo.findByEmployeeId(empId);
		
		return leaves;
	}
	
	public MessageStatus deleteLeaves(String empId)
	{
		MessageStatus status =  new MessageStatus();
		UserLeaves leaves = new UserLeaves();
		
		leaves = leaveRepo.findByEmployeeId(empId);
		leaves.setDisplayStatus(false);
		leaveRepo.save(leaves);
		
		status.setMessage("Data deleted successfully.");
		status.setStatus(true);
		
		return status;
	}
	
	public MessageStatus applyLeave(ApplyLeave data)
	{
		System.out.println("LeaveService::applyLeave()");
		int diff;
		DateUtility dateUtil = new DateUtility();
		LeaveUtility leaveUtil = new LeaveUtility();
		MessageStatus status = new MessageStatus();
		UserLeaves leaves = new UserLeaves();
		History history = new History();
		
		leaves = leaveRepo.findByEmployeeId(data.getEmployeeId());
		diff = dateUtil.DateDiff(data.getStartDate(), data.getEndDate());	
		
		System.out.println(data.getLeaveType());
		
		switch(data.getLeaveType())
		{
			case "Sick Leave":
				status = leaveUtil.getStatus("Sick Leave", diff, leaves.getSickLeave());
				if(status.isStatus())
					leaves.setSickLeave(leaves.getSickLeave()-diff);
				break;
				
			case "Casual Leave":
				status = leaveUtil.getStatus("Casual Leave", diff, leaves.getCasualLeave());
				if(status.isStatus())
					leaves.setCasualLeave(leaves.getCasualLeave()-diff);
				break;
				
			case "Earned Leave":
				status = leaveUtil.getStatus("Earned Leave", diff, leaves.getEarnedLeave());
				if(status.isStatus())
					leaves.setCasualLeave(leaves.getEarnedLeave()-diff);
				break;
				
			case "Loss of Pay":
				status = leaveUtil.getStatus("Loss of Pay", diff, leaves.getLossOfPay());
				if(status.isStatus())
					leaves.setCasualLeave(leaves.getLossOfPay()-diff);
				break;
				
			case "Maternity Leave":
				status = leaveUtil.getStatus("Maternity Leave", diff, leaves.getMaternityLeave());
				if(status.isStatus())
					leaves.setCasualLeave(leaves.getMaternityLeave()-diff);
				break;
				
			case "Comp-Off":
				status = leaveUtil.getStatus("Comp-off", diff, leaves.getCompOff());
				if(status.isStatus())
					leaves.setCasualLeave(leaves.getCompOff()-diff);
				break;
		}
		
		if(status.isStatus())
		{
			history.setEmployeeId(leaves.getEmployeeId());
			history.setService("Applied for Leave");
			history.setStartDate(data.getStartDate());
			history.setEndDate(data.getEndDate());
			history.setLeaveType(data.getLeaveType());
			history.setReason(data.getReason());
			history.setStatus(History.StatusEnum.PENDING);
			history.setDisplayStatus(true);
			
			leaveRepo.save(leaves);
			historyRepo.save(history);			
		}
		
		return status;
	}
	
	public MessageStatus ApplyCompOff(AvailCompOff data)
	{
		MessageStatus status = new MessageStatus();
		History history = new History();
		
		history.setEmployeeId(data.getEmployeeId());
		history.setService("Applied for Comp-Off");
		history.setStartDate(data.getStartDate());
		history.setEndDate(data.getEndDate());
		history.setLeaveType("NA");
		history.setReason(data.getReason());
		history.setStatus(History.StatusEnum.PENDING);
		history.setDisplayStatus(true);
		
		historyRepo.save(history);
		
		return status;
	}
	
}
