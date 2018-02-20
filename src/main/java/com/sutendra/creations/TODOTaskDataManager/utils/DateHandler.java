package com.sutendra.creations.TODOTaskDataManager.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateHandler {

	public static   String convertDate(String dayName,int hour,int minute){
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
		
		if(AppConstants.TODAY.equals(dayName)){
			calendar.set(calendar.get(calendar.YEAR),calendar.get(calendar.MONTH),calendar.get(calendar.DAY_OF_MONTH),hour,minute) ;
			return dateFormat.format(calendar.getTime());
		}
		
		if(AppConstants.YESTERDAY.equals(dayName)){
			calendar.set(calendar.get(calendar.YEAR),calendar.get(calendar.MONTH),calendar.get(calendar.DAY_OF_MONTH)-1,hour,minute) ;
			return dateFormat.format(calendar.getTime());
		}

		return dateFormat.format(calendar.getTime());
		
	}
}
