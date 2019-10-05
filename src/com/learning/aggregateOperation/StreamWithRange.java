package com.learning.aggregateOperation;

import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamWithRange {

	public static void main(String[] args) {

		Stream<String> stringStream = Stream.of("one", "there", "how", "eleph", "new");

		Stream<Double> doubleStream = Stream.of(3.4, 5.2, 45.4);

		DoubleStream myDoubleStream = DoubleStream.of(3.4, 5.2, 45.4);

		IntStream intStream = IntStream.range(1, 100);

		OptionalInt optional = intStream.max();

		Integer max = optional.getAsInt();
		System.out.println("Max : " + max);
		System.out.println("---------------------------");
		intStream = IntStream.range(1, 100);
		System.out.println("Min : " + intStream.min().getAsInt());
		System.out.println("---------------------------");
		intStream = IntStream.range(1, 100);
		System.out.println("average : " + intStream.average().getAsDouble());
		System.out.println("---------------------------");
		intStream = IntStream.range(1, 100);
		System.out.println("average : " + intStream.sum());
	}

}
