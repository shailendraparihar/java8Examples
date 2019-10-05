package com.learning.lambda;

import java.util.Calendar;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyLambdaExample {

	public static void main(String... stri) {

		Function<String, Integer> findWordCount = (t) -> {
			return t.split(" ").length;
		};

		Integer i = findWordCount.apply("please count the words");
		System.out.println("total count : " + i);

		Predicate<String> sizeChecker = t -> t.length() < 50;
		System.out.println(sizeChecker.test("jdfjkdjfk dkfjdkfj"));

		Supplier<Calendar> calendarSupplier = () -> Calendar.getInstance();

		Calendar c = calendarSupplier.get();
		System.out.println(c.getTime());
	}
}
