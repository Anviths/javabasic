package com;

public class Student extends Person{

	public void displayStudentData() {
		// name of the student
		//age of the student
		System.out.println( "planet name : "+planetName);
		System.out.println(name);
		System.out.println(age);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student( );
		s1.displayStudentData();
		
	}

}
