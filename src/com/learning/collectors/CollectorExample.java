package com.learning.collectors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorExample {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Brandon", "Admin", 4000));
		employeeList.add(new Employee("carl", "Admin", 3000));
		employeeList.add(new Employee("John", "IT", 5000));
		employeeList.add(new Employee("Tim", "HR", 3000));
		employeeList.add(new Employee("Harry", "IT", 2000));

		// Get Sum using Collectors
		double cost = employeeList.stream().collect(Collectors.summingDouble(t -> t.getSalary()));
		System.out.println("cost is : " + cost);
		System.out.println("-----------------------");

		// Print distinct department
		employeeList.stream().map(t -> t.getDepartment()).distinct().forEach(System.out::println);
		System.out.println("-----------------------");

		// Collect to List
		List<String> departmentList = employeeList.stream().map(t -> t.getDepartment()).distinct()
				.collect(Collectors.toList());
		departmentList.forEach(System.out::println);
		System.out.println("-----------------------");

		// Collect to HashSet
		Set<String> departmentSet = employeeList.stream().map(t -> t.getDepartment()).distinct()
				.collect(Collectors.toCollection(HashSet::new));
		departmentSet.forEach(System.out::println);
		System.out.println("-----------------------");

	}

}
