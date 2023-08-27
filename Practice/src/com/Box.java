package com;

public class Box {
	double length;
	double breadth;
	static int a=20;
	Box(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	double getArea()
	{
		
		System.out.println(a);
		
		return length*breadth;
	}

}


