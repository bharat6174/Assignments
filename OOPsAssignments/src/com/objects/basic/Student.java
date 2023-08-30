package com.objects.basic;

public class Student {
	String name;
	String department;

	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	void printDetails() {
		System.out.println("Name of the student is: " + name + ".");
		System.out.println("Department of the student is: " + department + ".");
	}

	String getGrades(int... marks) {
		int total = 0;
		for (int mark : marks) {
			total = total + mark;
		}

		String sum = "" + total;

		int avg = total / marks.length;
		String average = "" + avg;

		String grade;
		if (avg < 100 & avg >= 90) {
			grade = "A";
		} else if (avg < 90 & avg >= 80) {
			grade = "B";
		} else if (avg < 80 & avg >= 70) {
			grade = "C";
		} else if (avg < 70 & avg >= 60) {
			grade = "D";
		} else if (avg < 59 & avg >= 50) {
			grade = "E";
		} else {
			grade = "Fail";
		}
		return ("Total: " + sum + "\nAverage: " + average
				+ "\nGrade: " + grade);
	}

}
