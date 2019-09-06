package io.swagger.util;

import io.swagger.model.MessageStatus;

public class LeaveUtility 
{
	public MessageStatus getStatus(String leaveType,int dateDiff,int availableLeaves)
	{
		MessageStatus message = new MessageStatus();
		if(dateDiff<availableLeaves)
		{
			message.setMessage(leaveType + "applied successfully");
			message.setStatus(true);
		}
		else
		{
			message.setMessage("You do not have sufficient " + leaveType);
			message.setStatus(false);
		}
		
		return message;
	}
}
