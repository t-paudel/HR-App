package io.swagger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.model.ApplyCompOff;
import io.swagger.model.ApplyLeave;
import io.swagger.model.History;
import io.swagger.model.MessageStatus;
import io.swagger.model.UserLeaves;
import io.swagger.repository.HistoryRepository;
import io.swagger.repository.LeaveRepository;
import io.swagger.util.DateUtility;
import io.swagger.util.LeaveUtility;

@Service
public class UserLeaveService 
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
		
		leaveRepo.delete(empId);
		if(leaveRepo.findByEmployeeId(empId).equals(null))
		{
			status.setMessage("Data deleted successfully.");
			status.setStatus(true);
		}
		else
		{
			status.setMessage("Delete unsuccessful!!");
			status.setStatus(false);
		}
		
		return status;
	}
	
	public MessageStatus applyLeave(ApplyLeave data)
	{
		int diff;
		DateUtility dateUtil = new DateUtility();
		LeaveUtility leaveUtil = new LeaveUtility();
		MessageStatus status = new MessageStatus();
		UserLeaves leaves = new UserLeaves();
		History history = new History();
		
		leaves = leaveRepo.findByEmployeeId(data.getEmployeeId());
		diff = dateUtil.DateDiff(data.getStartDate(), data.getEndDate());	
		
		switch(data.getLeaveType())
		{
			case "sickLeave":
				status = leaveUtil.getStatus("Sick Leave", diff, leaves.getSickLeave());
				if(status.isStatus())
					leaves.setSickLeave(leaves.getSickLeave()-diff);
				break;
				
			case "casualLeave":
				status = leaveUtil.getStatus("Casual Leave", diff, leaves.getCasualLeave());
				if(status.isStatus())
					leaves.setCasualLeave(leaves.getCasualLeave()-diff);
				break;
				
			case "earnedLeave":
				status = leaveUtil.getStatus("Earned Leave", diff, leaves.getEarnedLeave());
				if(status.isStatus())
					leaves.setCasualLeave(leaves.getEarnedLeave()-diff);
				break;
				
			case "lop":
				status = leaveUtil.getStatus("Loss of Pay", diff, leaves.getLossOffPay());
				if(status.isStatus())
					leaves.setCasualLeave(leaves.getLossOffPay()-diff);
				break;
				
			case "maternityLeave":
				status = leaveUtil.getStatus("Maternity Leave", diff, leaves.getMaternityLeave());
				if(status.isStatus())
					leaves.setCasualLeave(leaves.getMaternityLeave()-diff);
				break;
				
			case "compOff":
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
	
	public MessageStatus ApplyCompOff(ApplyCompOff data)
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
