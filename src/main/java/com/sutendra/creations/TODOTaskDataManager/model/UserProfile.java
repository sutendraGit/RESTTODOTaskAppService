package com.sutendra.creations.TODOTaskDataManager.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserProfile {

	private String userName;
	private String userOccupation;
	
	public UserProfile(){}
	
	public UserProfile(String userName, String userOccupation) {
		super();
		this.userName = userName;
		this.userOccupation = userOccupation;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserOccupation() {
		return userOccupation;
	}
	public void setUserOccupation(String userOccupation) {
		this.userOccupation = userOccupation;
	}
	
	
}
