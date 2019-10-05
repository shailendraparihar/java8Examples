package com.learning.stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamWithRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> stringStream = Stream.of("one", "there", "how", "eleph", "new");
		// stringStream.forEach(s -> System.out.println(s));
		// OR
		stringStream.forEach(System.out::println);

		Stream<Double> doubleStream = Stream.of(3.4, 5.2, 45.4);
		doubleStream.forEach(System.out::println);

		DoubleStream myDoubleStream = DoubleStream.of(3.4, 5.2, 45.4);
		myDoubleStream.forEach(System.out::println);

		IntStream intStream = IntStream.range(1, 100);
		intStream.forEach(System.out::println);
	}

}
