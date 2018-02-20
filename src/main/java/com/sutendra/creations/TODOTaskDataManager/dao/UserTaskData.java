package com.sutendra.creations.TODOTaskDataManager.dao;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.Stack;

import com.sutendra.creations.TODOTaskDataManager.model.CompletedTask;
import com.sutendra.creations.TODOTaskDataManager.model.CurrentTask;
import com.sutendra.creations.TODOTaskDataManager.model.PendingTask;

public class UserTaskData {
	
	private PriorityQueue<CurrentTask> currentTaskQueue;
	private LinkedHashMap<String,PendingTask> prolongingTaskMap;
	private Stack<PendingTask> yesterdaysTask;
	private ArrayDeque<CompletedTask> completedTaskPool;
	
	public PriorityQueue<CurrentTask> getCurrentTaskQueue() {
		return currentTaskQueue;
	}
	
	public void setCurrentTaskQueue(PriorityQueue<CurrentTask> currentTaskQueue) {
		this.currentTaskQueue = currentTaskQueue;
	}
	
	public LinkedHashMap<String, PendingTask> getProlongingTaskMap() {
		return prolongingTaskMap;
	}
	
	public void setProlongingTaskMap(LinkedHashMap<String, PendingTask> prolongingTaskMap) {
		this.prolongingTaskMap = prolongingTaskMap;
	}
	
	public Stack<PendingTask> getYesterdaysTask() {
		return yesterdaysTask;
	}
	
	public void setYesterdaysTask(Stack<PendingTask> yesterdaysTask) {
		this.yesterdaysTask = yesterdaysTask;
	}
	
	public ArrayDeque<CompletedTask> getCompletedTaskPool() {
		return completedTaskPool;
	}
	
	public void setCompletedTaskPool(ArrayDeque<CompletedTask> completedTaskPool) {
		this.completedTaskPool = completedTaskPool;
	}
	
}
