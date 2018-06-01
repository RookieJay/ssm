package com.car.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTime {

public static String getTime(){
		
		Date day=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		return df.format(day);	
		}
}
