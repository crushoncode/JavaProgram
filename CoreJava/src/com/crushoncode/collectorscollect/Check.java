package com.crushoncode.collectorscollect;

import java.util.List;

public class Check {
	public static void main(String[] args) {
		
		List<String> names = List.of("Anand", "Ravi", "Neha", "Priya");

		List<Employee> list = names.stream().map(Employee::new).toList();
		System.out.println(list);
		
	}

}
