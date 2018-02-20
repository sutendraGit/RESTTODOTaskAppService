package com.sutendra.creations.TODOTaskDataManager.model;


import javax.xml.bind.annotation.XmlRootElement;

import com.sutendra.creations.TODOTaskDataManager.utils.AppConstants.TASK_STATUS;

@XmlRootElement
public class PendingTask extends Task {
	
	private int procrasinationCount;
	
	public PendingTask(){}
	
	public PendingTask(String plannedTaskStartTime, String plannedTaskCompleteTime, int taskPriority,String taskName, TASK_STATUS taskStatus) {
		super(plannedTaskStartTime, plannedTaskCompleteTime, taskPriority,taskName, taskStatus);
		procrasinationCount  = 1;
	}

	public int incrementAndGetProcrasinationCount(){
		return procrasinationCount++;
	}

	public int getProcrasinationCount() {
		return procrasinationCount;
	}

	public void setProcrasinationCount(int procrasinationCount) {
		this.procrasinationCount = procrasinationCount;
	}
	
	@Override
	public void setTaskStatus(TASK_STATUS taskStatus) {
		this.taskStatus  = taskStatus;
	}

}
