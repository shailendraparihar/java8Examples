package com.learning.function2;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<String> sizeChecker = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() < 50;
			}
		};

		Predicate<String> specialWordChecker = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.contains("world");
			}
		};

		String text = "Our world is very beautiful";
		boolean isProperString = sizeChecker.test(text);
		System.out.println(isProperString);

		// Predicate accepts a value and returns true or false.
		// negate is not of "test()" in predicate.
		// the below condition specifies if size is not less than 50 AND text
		// contains "world" then only it will return true.
		boolean negateAnd = sizeChecker.negate().and(specialWordChecker).test(text);
		System.out.println("Negate AND : " + negateAnd);

		// the below condition specifies if size is not less than 50 OR text
		// contains "world" then only it will return true.
		boolean negateOr = sizeChecker.negate().or(specialWordChecker).test(text);
		System.out.println("Negate OR : " + negateOr);

	}

}
