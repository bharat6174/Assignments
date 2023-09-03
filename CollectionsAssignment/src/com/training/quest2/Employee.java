package com.training.quest2;

public class Employee {
	String name;
	int employeeId;
	String city;

	public Employee(String name, int employeeId, String city) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Employee[name=" + name + ", employeeId=" + employeeId + ", city=" + city + "]";
	}

}
