package com.training.quest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Employee> employeeCities = new ArrayList<>();

		List<Employee> employees = Arrays.asList(new Employee("Bharat", 001, "Bengaluru"),
				new Employee("Raja", 003, "Gurgaon"), new Employee("Sakshi", 007, "Malerkotla"),
				new Employee("Anjali", 004, "Surat"), new Employee("Ishika", 005, "Gurgaon"));

		
		System.out.println("List of all Employees: ");
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
		System.out.println();
		System.out.println("Employees from specific city 'Gurgaon': ");
		for (Employee emp : employees) {
			if (emp.getCity().equals("Gurgaon")) {
				employeeCities.add(emp);
				System.out.println(emp);
			}

		}
	}

}
