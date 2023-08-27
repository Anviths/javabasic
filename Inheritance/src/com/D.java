package com;

class C{
	static int i=98;
	
}

public class D extends C{
  
 static int j;
 public static void main(String[] args) {
	System.out.println(i);// inherited class
	System.out.println(j);// declared class
}
}
