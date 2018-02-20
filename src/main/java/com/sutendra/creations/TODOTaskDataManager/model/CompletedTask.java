package com.sutendra.creations.TODOTaskDataManager.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.sutendra.creations.TODOTaskDataManager.utils.AppConstants.TASK_STATUS;

@XmlRootElement
public class CompletedTask extends Task {

	private Date taskCompletedTime;
	private Date taskStartedTime;
	private boolean isTaskCompletedSatisfactorily;
	
	public CompletedTask() {}

	public CompletedTask(Date plannedTaskStartTime, Date plannedTaskCompleteTime, int taskPriority,
			String taskName, TASK_STATUS taskStatus,Date taskCompletedTime, Date taskStartedTime, boolean isTaskCompletedSatisfactorily) {
		super(plannedTaskStartTime, plannedTaskCompleteTime, taskPriority, taskName, taskStatus);
		this.taskCompletedTime = taskCompletedTime;
		this.taskStartedTime = taskStartedTime;
		this.isTaskCompletedSatisfactorily = isTaskCompletedSatisfactorily;
	}

	public Date getTaskCompletedTime() {
		return taskCompletedTime;
	}

	public void setTaskCompletedTime(Date taskCompletedTime) {
		this.taskCompletedTime = taskCompletedTime;
	}

	public Date getTaskStartedTime() {
		return taskStartedTime;
	}

	public void setTaskStartedTime(Date taskStartedTime) {
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
