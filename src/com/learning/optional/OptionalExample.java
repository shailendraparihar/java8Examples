package com.learning.optional;

import java.util.Optional;
import java.util.function.Function;

public class OptionalExample {

	public static void main(String... args) {

		String string = "where are you ?";
		String emptyString = "";
		Function<String, String> getSecondWord = t -> {

			return t.split(" ").length > 1 ? t.split(" ")[1] : null;
		};

		Function<String, Integer> getLetterCount = t -> t.split(" ").length;

		// If we pass empty String it will give null pointer exception
		// Integer count = getSecondWord.andThen(getLetterCount).apply(string);
		// System.out.println("Total length : " + count);

		// Using Optional
		/*
		 * Optional<String> myOptional =
		 * Optional.ofNullable(getSecondWord.apply("this is")); if
		 * (myOptional.isPresent()) {
		 * 
		 * String s = myOptional.get(); // System.out.println("the values is : " + s);
		 * myOptional.ifPresent(System.out::println);
		 * 
		 * } else { System.out.println("no value present"); }
		 */
		// OR
		Optional.ofNullable(getSecondWord.apply("this is")).ifPresent(System.out::println);
		Optional.ofNullable(getSecondWord.apply("this is")).map(getLetterCount).ifPresent(System.out::println);
	}
}
