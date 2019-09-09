package io.swagger.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.model.History;
import io.swagger.model.MessageStatus;
import io.swagger.repository.HistoryRepository;

@Service
public class HistoryService 
{
	@Autowired
	private HistoryRepository historyRepo;
	
	public List<History> getEmployeeLeaveHistory(String empId)
	{
		List<History> history  = new ArrayList<>();
		history = historyRepo.findByEmployeeId(empId);
		return history;
	}
	
	public History updateLeaveHistory(History data)
	{
		History history = new History();
		history = historyRepo.save(historyRepo.findById(data.getId()));		
		
		return history;
	}
	
	public MessageStatus deleteEmployeeLeaveHistory(String id)
	{
		MessageStatus status = new MessageStatus();
		History history = new History();
		
		history = historyRepo.findById(id);
		history.setDisplayStatus(false);
		historyRepo.save(history);
		
		status.setStatus(false);
		status.setMessage("Data deleted successfully.");
		
		return status;
	}
}
