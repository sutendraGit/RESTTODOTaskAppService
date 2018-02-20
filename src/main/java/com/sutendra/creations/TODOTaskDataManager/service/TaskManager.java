package com.sutendra.creations.TODOTaskDataManager.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sutendra.creations.TODOTaskDataManager.dao.UserTaskData;
import com.sutendra.creations.TODOTaskDataManager.model.CompletedTask;
import com.sutendra.creations.TODOTaskDataManager.model.CurrentTask;
import com.sutendra.creations.TODOTaskDataManager.model.PendingTask;
import com.sutendra.creations.TODOTaskDataManager.model.TaskLearnings;

public class TaskManager {
	
	private Map<String,UserTaskData> userTaskMap;
	private String userName;
	
	TaskManager(){
		userTaskMap = new HashMap<>();
	}
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}



	public void addCurrentTask(CurrentTask currentTask){
		UserTaskData taskData = userTaskMap.get(userName);
		
		if(taskData == null){
			 taskData = new UserTaskData();
			 taskData.createCurrentTaskQueue();
			 taskData.getCurrentTaskQueue().add(currentTask);
		}else{
			if(taskData.getCurrentTaskQueue() != null){
				taskData.getCurrentTaskQueue().add(currentTask);
			}
			else{
				taskData.createCurrentTaskQueue();
				taskData.getCurrentTaskQueue().add(currentTask);
			}
		}
	}

	public void addPendingTask(CurrentTask currentTask){
		
	}
	
	public void addCompletedTask(CurrentTask currentTask){
		
	}
	
	public void updateCurrentTask(CurrentTask currentTask){
		
	}

	public void updatePendingTask(CurrentTask currentTask){
		
	}
	
	public void updateCompletedTask(CurrentTask currentTask){
		
	}
	
	
	public boolean deleteCurrentTask(String taskName){
		return false;
	}

	public boolean deletePendingTask(String taskName){
		return false;
	}
	
	public boolean deleteCompletedTask(String taskName){
		return false;
	}
	
	
	public CurrentTask getCurrentTask(String taskName){
		return null;
	}
	
	public CurrentTask getPendingTask(String taskName){
		return null;
	}
		
	public CurrentTask getCompletedTask(String taskName){
		return null;
	}
	
	
	public void addCurrentTaskLearning(String taskName,TaskLearnings learning){
		
	}
	
	public void addCompletedTaskLearning(String taskName,TaskLearnings learning){
		
	}
	
	public void getCurrentTaskLearnings(String taskName){
		
	}
	
	public void getCompletedTaskLearnings(String taskName){
		
	}
	
	public List<CurrentTask> getAllCurrentTask(){
		return null;
		
	}
	
	public List<PendingTask> getAllPendingTask(){
		return null;
		
	}
	
	public List<CompletedTask> getAllCompletedTask(){
		return null;
		
	}
	
	public List<CurrentTask> getFirstNHighPriorityCurrentTask(int n){
		return null;
		
	}
	
	public CurrentTask getHighestPriorityTask(){
		return null;
		
	}
}
