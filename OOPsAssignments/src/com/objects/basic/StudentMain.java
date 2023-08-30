package com.objects.basic;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student("Anjani", "ECE");
		Student student2 = new Student("Bharat", "CSE");
		
		student1.printDetails();
		String grade1 = student1.getGrades(89,78,88,83,92);
		System.out.println(grade1);
		System.out.println();
		
		student2.printDetails();
		String grade2 = student2.getGrades(92,88,93,80,97);
		System.out.println(grade2);
	}

}
