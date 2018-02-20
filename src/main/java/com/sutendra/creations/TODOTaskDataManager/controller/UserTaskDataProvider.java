package com.sutendra.creations.TODOTaskDataManager.controller;


public class UserTaskDataProvider {

	getTodaysTasks(){}
	getTodaysFirstTask(){}
	getTodaysTopThreeTasks(){}
	getYesterdaysPendingTasks(){}
	getProlongingPendingTasks(){}
	
	
	getTaskDetails(String TaskName){}
	
	getCompletedTasks(){}
	
	getTasksProlongingForGivenMonth(){}
	getTasksProlongingForGivenYear(){}
	
	addTask(CurrentTask task){}
	
	updateTaskPlannedStartTime(Date newTime){}
	updateTaskPriority(int  priority){}
	updateTaskAsCompleted(String taskName){}
	updateTaskAsPending(String taskName){}
	
	removeTask(String taskName){}
	
}
