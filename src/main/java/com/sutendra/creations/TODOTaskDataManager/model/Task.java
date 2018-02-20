package com.sutendra.creations.TODOTaskDataManager.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.sutendra.creations.TODOTaskDataManager.utils.AppConstants;
import com.sutendra.creations.TODOTaskDataManager.utils.AppConstants.TASK_LEARNING_RULE;
import com.sutendra.creations.TODOTaskDataManager.utils.AppConstants.TASK_STATUS;

@XmlRootElement
public abstract class Task {
	
	private Date plannedTaskStartTime;
	private Date plannedTaskCompleteTime;
	private String taskName;
	protected TASK_STATUS taskStatus;
	private List<TASK_LEARNING_RULE> taskLearnings;
	private int taskPriority;
	
	public Task(){}
	
	public Task(Date plannedTaskStartTime, Date plannedTaskCompleteTime, int taskPriority,String taskName,TASK_STATUS taskStatus) {
		super();
		this.plannedTaskStartTime = plannedTaskStartTime;
		this.plannedTaskCompleteTime = plannedTaskCompleteTime;
		this.taskPriority = taskPriority;
		this.taskName = taskName;
		this.taskStatus = taskStatus;
		taskLearnings = new ArrayList<>();
	}
	
	public void addTaskLearning(TASK_LEARNING_RULE learning){
		taskLearnings.add(learning);
	}

	@XmlTransient
	public List<TASK_LEARNING_RULE> getTaskLearnings() {
		return taskLearnings;
	}

	public  abstract void setTaskStatus(TASK_STATUS taskStatus);
		
	public TASK_STATUS getTaskStatus(){
		return taskStatus;
	}
	


	public Date getPlannedTaskStartTime() {
		return plannedTaskStartTime;
	}


	public void setPlannedTaskStartTime(Date plannedTaskStartTime) {
		this.plannedTaskStartTime = plannedTaskStartTime;
	}


	public Date getPlannedTaskCompleteTime() {
		return plannedTaskCompleteTime;
	}


	public void setPlannedTaskCompleteTime(Date plannedTaskCompleteTime) {
		this.plannedTaskCompleteTime = plannedTaskCompleteTime;
	}


	public int getTaskPriority() {
		return taskPriority;
	}


	public void setTaskPriority(int taskPriority) {
		this.taskPriority = taskPriority;
	}

	
	public String getTaskName() {
		return taskName;
	}


	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}
