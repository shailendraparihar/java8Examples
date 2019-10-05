package com.learning.function;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDate {

	private String dayName;
	private Date currentDate;
	private Date nextDate;

	public MyDate() {
		super();
		this.currentDate = new Date();
		this.nextDate = getNextDay(currentDate);
		this.dayName = getDayName(nextDate);
	}

	public String getDayName() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
		return dateFormat.format(new Date());
	}

	public String getDayName(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
		return dateFormat.format(date);
	}

	public Date getNextDay(Date date) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		Date newDate = calendar.getTime();
		return newDate;
	}

	public boolean isWeekend(Date date) {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
				|| calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
	}

	public static boolean isWednesday(Date date) {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY;
	}
}
