package com.learning.function;

import java.util.Calendar;
import java.util.Date;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyDateExample {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_WEEK, 4);
		Date saDate = calendar.getTime();
		// Supplier returns a value and does not accept anything
		Supplier<MyDate> myDateSupplier = MyDate::new;
		MyDate myDate = myDateSupplier.get();

		// Get Day name using supplier(calling method without method parameters)
		Supplier<String> dayNameSupplier = myDate::getDayName;
		System.out.println(dayNameSupplier.get());

		// Function Interface is used when we have one input type and one return type
		// For example here getName accepts Date and returns String
		Function<Date, String> dayPrinter = myDate::getDayName;
		System.out.println(dayPrinter.apply(new Date()));

		// Predicate is used to check some logic
		// accept some input and Returns True or false

		Predicate<Date> weekendPredicate = myDate::isWeekend;
		System.out.println(weekendPredicate.test(saDate));

		Predicate<Date> wednesdayPredicate = MyDate::isWednesday;
		System.out.println(wednesdayPredicate.test(new Date()));
	}

}
