package com;

class Pen{
	static int a=10;
	int b=20;
	Pen(){
		System.out.println("writing");
		
	}
	public static void demo() {
		System.out.println(a);
		 int x=10;
		System.out.println("from demo");
		
	}
	 void demo1() {
		 System.out.println(a);
		 System.out.println(b);
		System.out.println("non satic deno");
	}
}
public class Demo1 {
 
	public static void main(String[] args) {
		Pen p=new Pen();
		
		Pen.demo();
		p.demo1();
	}
}
