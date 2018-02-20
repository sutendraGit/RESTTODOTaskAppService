package com.sutendra.creations.TODOTaskDataManager.model;


import javax.xml.bind.annotation.XmlRootElement;

import com.sutendra.creations.TODOTaskDataManager.utils.AppConstants.TASK_STATUS;

@XmlRootElement
public class CurrentTask extends Task{
	
	private boolean isTaskInProgress;
	
	public CurrentTask(){}

	public CurrentTask(String plannedTaskStartTime, String plannedTaskCompleteTime,int taskPriority, String taskName, TASK_STATUS taskStatus) {
		super(plannedTaskStartTime, plannedTaskCompleteTime, taskPriority,taskName, taskStatus);
		isTaskInProgress = false;
	}


	public boolean isTaskInProgress() {
		return isTaskInProgress;
	}

	public void setTaskInProgress(boolean isTaskInProgress) {
		this.isTaskInProgress = isTaskInProgress;
	}

	@Override
	public void setTaskStatus(TASK_STATUS taskStatus) {
		this.taskStatus  = taskStatus;
	}

}
