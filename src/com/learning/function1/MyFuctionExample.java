package com.learning.function1;

import java.util.function.Function;

public class MyFuctionExample {

	public static void main(String[] args) {

		Function<Integer, String> numberToText = new Function<Integer, String>() {

			@Override
			public String apply(Integer t) {
				switch (t) {
				case 1:
					return "one";
				case 2:
					return "two";
				case 3:
					return "three";
				case 4:
					return "four";
				default:
					return "unknown";
				}
			}
		};

		Function<String, Integer> wordCountDunction = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.split(" ").length;
			}
		};

		String text = numberToText.apply(3);
		Integer wordCount = wordCountDunction.apply("we are the one");
		System.out.println(wordCount);

		// Chained call
		// First we are counting the number and after that converting the same
		// number as text
		// First "wordCountDunction" will be invoked and then "numberToText"
		System.out.println(wordCountDunction.andThen(numberToText).apply("we are the one"));

		// Compose do the same as andThen but in reverse order
		// First "numberToText" will be invoked and then "wordCountDunction"
		System.out.println(wordCountDunction.compose(numberToText).apply(4));

		// Note: in both the cases "andThen" and "compose" the output type of
		// the first function should be same as input type of the second
		// function. Otherwise it will give exception

	}

}
