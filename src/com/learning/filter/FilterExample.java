package com.learning.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterExample {

	public static void main(String[] args) {

		List<Player> players = new ArrayList<Player>();
		players.add(new Player(1, 2, 3, 4));
		players.add(new Player(0, 10, 0, 20));
		players.add(new Player(3, 5, 6, 3));
		players.add(new Player(8, 0, 10, 4));
		players.add(new Player(1, 0, 1, 8));

		Stream<Player> playerStream = players.stream();

		playerStream.forEach(t -> System.out.println("Match : " + t.matchCount));
		System.out.println("-----------------");
		// We have to create stream again
		playerStream = players.stream();
		playerStream.filter(t -> t.matchCount > 10).forEach(System.out::println);
		System.out.println("-----------------");
		// More than one filter
		playerStream = players.stream();
		playerStream.filter(t -> t.matchCount > 5).filter(t -> t.foul < 6).forEach(System.out::println);

	}
}
