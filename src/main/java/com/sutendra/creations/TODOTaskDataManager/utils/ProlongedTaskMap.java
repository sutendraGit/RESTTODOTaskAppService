package com.sutendra.creations.TODOTaskDataManager.utils;

import java.util.LinkedHashMap;
import java.util.Map;

import com.sutendra.creations.TODOTaskDataManager.model.PendingTask;

public class ProlongedTaskMap extends LinkedHashMap<String,PendingTask>{
	
	private int capacity;
	
	public ProlongedTaskMap(int capacity,float loadFactor){
		super(capacity,loadFactor,true);
		this.capacity = capacity;
	}
	
	@Override
	public boolean removeEldestEntry(Map.Entry<String,PendingTask> eldest){
		return this.size() > capacity;
	}

}
