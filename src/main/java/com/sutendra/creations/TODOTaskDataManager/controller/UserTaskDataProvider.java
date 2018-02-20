package com.sutendra.creations.TODOTaskDataManager.controller;

import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sutendra.creations.TODOTaskDataManager.model.CompletedTask;
import com.sutendra.creations.TODOTaskDataManager.model.CurrentTask;
import com.sutendra.creations.TODOTaskDataManager.model.PendingTask;
import com.sutendra.creations.TODOTaskDataManager.model.Task;
import com.sutendra.creations.TODOTaskDataManager.utils.AppConstants;
import com.sutendra.creations.TODOTaskDataManager.utils.AppConstants.TASK_STATUS;
import com.sutendra.creations.TODOTaskDataManager.utils.DateHandler;

@Path("/tasks")
public class UserTaskDataProvider {


	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<CurrentTask> getTodaysTasks(){
		
		List<CurrentTask> currentTasks = new ArrayList<>();
		String  startTimeTask1 = DateHandler.convertDate(AppConstants.TODAY, 5, 30);
		String endTimeTask1 = DateHandler.convertDate(AppConstants.TODAY, 6, 00);
		String startTimeTask2 = DateHandler.convertDate(AppConstants.YESTERDAY, 6, 10);
		String endTimeTask2 = DateHandler.convertDate(AppConstants.YESTERDAY, 6, 40);
		CurrentTask task1 =  new CurrentTask(startTimeTask1,endTimeTask1,AppConstants.MAJOR_TASK,"Task1",TASK_STATUS.CURRENT);
		CurrentTask task2 =  new CurrentTask(startTimeTask2,endTimeTask2,AppConstants.URGENT_TASK,"Task2",TASK_STATUS.CURRENT);
		task2.setTaskInProgress(true);
		
		currentTasks.add(task1);
		currentTasks.add(task2);
		
		return currentTasks;
	}
	

	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void  addTask(CurrentTask currenttask){
		
		
	}
	
	
	
	public CurrentTask getTodaysFirstTask(){
		return null;}
	
	public List<CurrentTask>getTodaysTopThreeTasks(){
		return null;}
	
	public List<PendingTask>getYesterdaysPendingTasks(){
		return null;}
	
	public List<PendingTask>getProlongingPendingTasks(){
		return null;}
	
	public Task getTaskDetails(String TaskName){
		return null;}
	
	public List<CompletedTask> getCompletedTasks(){
		return null;}
	
	//getTasksProlongingForGivenMonth(){}
	
	public List<PendingTask> getTasksProlongingForGivenYear(){
		return null;}
	
	public void updateTaskPlannedStartTime(Date newTime){}
	public void updateTaskPriority(int  priority){}
	public void updateTaskAsCompleted(String taskName){}
	public void updateTaskAsPending(String taskName){}
	
	public void removeTask(String taskName){}
	
}
