package com.learning.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorGroupingByExample {

	public static void main(String... strings) {

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Brandon", "Admin", 4000));
		employeeList.add(new Employee("carl", "Admin", 3000));
		employeeList.add(new Employee("John", "IT", 5000));
		employeeList.add(new Employee("Tim", "HR", 3000));
		employeeList.add(new Employee("Harry", "IT", 2000));

		//
		Map<String, List<Employee>> employeeByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println("---------------------------");

		// to Get total salary of each department
		Map<String, Double> salaryMap = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
		System.out.println("---------------------------");

		// To Get Average Salary of each department
		Map<String, Double> averageSalaryMap = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("---------------------------");

	}
}
