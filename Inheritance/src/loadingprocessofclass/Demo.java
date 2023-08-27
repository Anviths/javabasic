package loadingprocessofclass;

class Parent1{
	static int a=10;
	static int b;
	static{
		a=20;
		b=30;
       System.out.println("parent class loded");
	}
	public static void parentMethod() {
		System.out.println("parent method");
	}
}
class Child1 extends Parent1{
	
	static int c;
	static int d=5;
	static {
	a=50;
	b=77;
	c=34;
	d=29;
	System.out.println("child class loaded");
	}
	static void childMethod() {
		System.out.println("child method");
	}
}
public class Demo {

	
	public static void main(String[] args) {
		System.out.println(Child1.a);
		System.out.println(Child1.b);
	}
}
