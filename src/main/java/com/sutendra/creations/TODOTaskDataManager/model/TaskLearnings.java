package com.sutendra.creations.TODOTaskDataManager.model;

import com.sutendra.creations.TODOTaskDataManager.utils.AppConstants.TASK_LEARNING_RULE;

public class TaskLearnings {
	
	private int learningId;
	private String learningMsg;
	private TASK_LEARNING_RULE learningRule;

	public TaskLearnings(int learningId, String learningMsg, TASK_LEARNING_RULE learningRule) {
		super();
		this.learningId = learningId;
		this.learningMsg = learningMsg;
		this.learningRule = learningRule;
	}
	
	public int getLearningId() {
		return learningId;
	}
	public void setLearningId(int learningId) {
		this.learningId = learningId;
	}
	public String getLearningMsg() {
		return learningMsg;
	}
	public void setLearningMsg(String learningMsg) {
		this.learningMsg = learningMsg;
	}
	public TASK_LEARNING_RULE getLearningRule() {
		return learningRule;
	}
	public void setLearningRule(TASK_LEARNING_RULE learningRule) {
		this.learningRule = learningRule;
	}
	
	
	

}
