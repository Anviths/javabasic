package inhertance1;

class A{
	int age;
}
//sub class
class B extends A{
	
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       B obj2=new B();
       //access or use super class variable age with the help of object
       System.out.println(obj2.age);
	}

}
