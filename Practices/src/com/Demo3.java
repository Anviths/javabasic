package com;

class X{
	
}
class Y extends X{
	
}
class Z extends X{
	
}
class V extends Z{
	
}
class W{
	
}
class F extends W{
	
}

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X x =new V();
		System.out.println( x instanceof Object);
		System.out.println( x instanceof X);
		System.out.println( x instanceof Y);
		System.out.println( x instanceof Z);
		System.out.println( x instanceof V);
	
	}

}
