package objectloadingwith_inhertance;

class Parent3{
	int a=10;
	int b;
	{
		a=20;
		b=30;
		System.out.println("parent object is loaded");
		System.out.println("a ="+a);
		System.out.println("b =" + b);
	}
}
class Child3 extends Parent3 {

	int c;
	int d=5;
	 {
		a=50;
		b=77;
		c=34;
		d=29;
		System.out.println("child class is sucessfully loaded ");
		System.out.println("a ="+a);
		System.out.println("b =" + b);
		System.out.println("c ="+c);
		System.out.println("d =" + d);
	}
}
