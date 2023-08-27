package loadingprocessofclass;

public class Case1 {

	public static void main(String[] args) {
		//call member of Parent class
		Parent.nurture();//Parent class is loaded into the environment
		System.out.println("hello..!!");
		System.out.println("hi..!");
		//call member of child
		Child.respect(); //child class should be loaded
	}
}
