package com;

public class EmployeeDriver {

	public static void main(String[] args) {

		// Creating the object for the given class
		Employee e1=new Employee("ab", 1, 9857423131l);
		
		//copying refernce to five object
		Employee e2=e1;
		Employee e3=e1;
		Employee e4=e2;
		Employee e5=e3;
		
		//intialize the variable with the help of first refernce variable
		e1.name="bcvf";
		e1.id=20;
		e1.phone=8523697412l;
		
		//printing variable with help of third refence variable
		
		System.out.println(e3.name);
		System.out.println(e3.id);
		System.out.println(e3.phone);
		
		//update the varible with the help[ of fourth reference variable 
		e4.name="tom";
		e4.id=90;
		e4.phone=8523098412l;
		
		//display the variable in the object by the fifth refernce varaible
		System.out.println("=====================");
		System.out.println(e5.name);
		System.out.println(e5.id);
		System.out.println(e5.phone);
		
		

	}

}
