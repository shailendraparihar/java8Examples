package com.learning.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class MyStreamExample {

	public static void main(String[] args) {

		Set<Integer> mySet = new HashSet<>();
		mySet.add(10);
		mySet.add(11);
		mySet.add(12);
		mySet.add(13);
		mySet.add(14);
		mySet.add(15);
		mySet.add(16);
		mySet.add(17);
		mySet.add(18);
		mySet.add(19);

		Stream<Integer> stream = mySet.stream();
		// stream.forEach(System.out::println);// Not sorted
		// stream.sorted().forEach(System.out::println);// sorted ascending order
		stream.sorted((first, second) -> second - first).forEach(System.out::println);// Descending Order

		Set<Integer> myTreeSet = new TreeSet<>();
		myTreeSet.add(10);
		myTreeSet.add(11);
		myTreeSet.add(12);
		myTreeSet.add(13);
		myTreeSet.add(14);
		myTreeSet.add(15);
		myTreeSet.add(16);
		myTreeSet.add(17);
		myTreeSet.add(18);
		myTreeSet.add(19);

		Stream<Integer> treeSetStream = myTreeSet.stream();
		treeSetStream.forEach(System.out::println);
	}

}
