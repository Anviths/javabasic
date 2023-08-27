package com;

public class EmployeeDriver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an object for the given class
		Employee1 e1=new Employee1();
		
		//copy reference of same object to 5 reference
		Employee1 e2=e1;
		Employee1 e3=e1;
		Employee1 e4=e1;
		Employee1 e5=e1;
		
		//Initialize the variable with help of first reference variable
		e1.color="blue";
		e1.lifeSpan=48;
		
		//print using third reference 
		System.out.println(e3.color);
		System.out.println(e3.lifeSpan);
		
		//update with fourth reference
		e4.color="black";
		e4.lifeSpan=78;
		//Display the variable in the 5 reference
		System.out.println("===========================");
		System.out.println(e5.color);
		System.out.println(e5.lifeSpan);
		
	}

}
