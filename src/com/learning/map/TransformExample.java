package com.learning.map;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class TransformExample {

	public static void main(String[] args) {

		List<String> dateList = new ArrayList<>();
		dateList.add("01/01/2018");
		dateList.add("02/03/2018");
		dateList.add("03/04/2018");
		dateList.add("04/05/2018");
		dateList.add("05/06/2018");

		Stream<String> stringStream = dateList.stream();
		stringStream.map(TransformExample::convertDate).forEach(System.out::println);
		System.out.println("-------------------");

		stringStream = dateList.stream();
		stringStream.map(TransformExample::convertDate).filter(TransformExample::isWeekend)
				.forEach(System.out::println);
		// Here in above line we are passing Predicate to filter.
		// Precicate is what where we pass on input type and it returns Boolean.
		System.out.println("-------------------");
		// if we want to print only week days then do the given below:-
		// Negate the predicate

		stringStream = dateList.stream();
		stringStream.map(TransformExample::convertDate).filter(t -> !TransformExample.isWeekend(t))
				.forEach(System.out::println);

	}

	public static Date convertDate(String stringDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		try {
			return dateFormat.parse(stringDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static boolean isWeekend(Date date) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
				|| calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;

	}
}
