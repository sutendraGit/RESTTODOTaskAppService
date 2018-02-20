package com.sutendra.creations.TODOTaskDataManager.model;


import javax.xml.bind.annotation.XmlRootElement;

import com.sutendra.creations.TODOTaskDataManager.utils.AppConstants.TASK_STATUS;

@XmlRootElement
public class CompletedTask extends Task {

	private String taskCompletedTime;
	private String taskStartedTime;
	private boolean isTaskCompletedSatisfactorily;
	
	public CompletedTask() {}

	public CompletedTask(String plannedTaskStartTime, String plannedTaskCompleteTime, int taskPriority,
			String taskName, TASK_STATUS taskStatus,String taskCompletedTime, String taskStartedTime, boolean isTaskCompletedSatisfactorily) {
		super(plannedTaskStartTime, plannedTaskCompleteTime, taskPriority, taskName, taskStatus);
		this.taskCompletedTime = taskCompletedTime;
		this.taskStartedTime = taskStartedTime;
		this.isTaskCompletedSatisfactorily = isTaskCompletedSatisfactorily;
	}

	public String getTaskCompletedTime() {
		return taskCompletedTime;
	}

	public void setTaskCompletedTime(String taskCompletedTime) {
		this.taskCompletedTime = taskCompletedTime;
	}

	public String getTaskStartedTime() {
		return taskStartedTime;
	}

	public void setTaskStartedTime(String taskStartedTime) {
		this.taskStartedTime = taskStartedTime;
	}

	public boolean isTaskCompletedSatisfactorily() {
		return isTaskCompletedSatisfactorily;
	}

	public void setTaskCompletedSatisfactorily(boolean isTaskCompletedSatisfactorily) {
		this.isTaskCompletedSatisfactorily = isTaskCompletedSatisfactorily;
	}
	
	@Override
	public void setTaskStatus(TASK_STATUS taskStatus) {
		this.taskStatus  = taskStatus;
	}
	
}
