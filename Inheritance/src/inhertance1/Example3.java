package inhertance1;

class SuperClass{
	//static variable 
	static int i ;
	 // static method
	public static void test() {
		System.out.println( "From SuperClass test() ");
	}
}
class SubClass extends SuperClass{
	
}
public class Example3 {

	public static void main(String[] args) {
		 //use static variable and method with the help of class name
		System.out.println(SubClass.i);
	    System.out.println();
	    SubClass.test();
	}
	
}
