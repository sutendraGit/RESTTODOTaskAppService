package com.sutendra.creations.TODOTaskDataManager.dao;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;

import com.sutendra.creations.TODOTaskDataManager.model.CompletedTask;
import com.sutendra.creations.TODOTaskDataManager.model.CurrentTask;
import com.sutendra.creations.TODOTaskDataManager.model.PendingTask;
import com.sutendra.creations.TODOTaskDataManager.utils.ProlongedTaskMap;

public class UserTaskData {
	
	private PriorityQueue<CurrentTask> currentTaskQueue;
	private ProlongedTaskMap prolongingTaskMap;
	private ArrayDeque<CompletedTask> completedTaskPool;
	
	
	public void createCurrentTaskQueue(){
		currentTaskQueue = new PriorityQueue<>(TASK_COMPARISION_RULE);
	}
	
	public void createProlongingTaskMap(){
		prolongingTaskMap = new ProlongedTaskMap(6,(float) 0.75);
	}
	
	public void createCompletedTaskPool(){
		completedTaskPool = new ArrayDeque<>();
	}

	public PriorityQueue<CurrentTask> getCurrentTaskQueue() {
		return currentTaskQueue;
	}
	
	public void setCurrentTaskQueue(PriorityQueue<CurrentTask> currentTaskQueue) {
		this.currentTaskQueue = currentTaskQueue;
	}
	
	public LinkedHashMap<String, PendingTask> getProlongingTaskMap() {
		return prolongingTaskMap;
	}
	
	public void setProlongingTaskMap(ProlongedTaskMap prolongingTaskMap) {
		this.prolongingTaskMap = prolongingTaskMap;
	}

	public ArrayDeque<CompletedTask> getCompletedTaskPool() {
		return completedTaskPool;
	}
	
	
	public void setCompletedTaskPool(ArrayDeque<CompletedTask> completedTaskPool) {
		this.completedTaskPool = completedTaskPool;
	}
	
	public static final  Comparator<CurrentTask> TASK_COMPARISION_RULE = new Comparator<CurrentTask>() {

		@Override
		public int compare(CurrentTask t1, CurrentTask t2) {
			
			if(t1.getTaskPriority() != t2.getTaskPriority()){
				return t1.getTaskPriority() - t2.getTaskPriority();
			}
				
			return t1.getTaskName().compareToIgnoreCase(t2.getTaskName());
		}
	};
	
}
