package com.practice;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class A implements Serializable {
	public static void main(String[] args) throws ParseException {
		String date="1990/11/08";
		Date d=new SimpleDateFormat("yyyy/MM/dd").parse(date);
		//getNumberOfWeek(d);
		testPrimtiveType();
		
		
		
	}

	private static void testPrimtiveType() {
		// TODO Auto-generated method stub
		int i = 0;
		Integer i1 = null;
		Double d = null;
		System.out.println(i+"" +i1+" "+d);
		
	}

	private static void getNumberOfWeek(Date date) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		
		cal.setTime(date);
		int weekNo=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekNo);
	}
	

}

