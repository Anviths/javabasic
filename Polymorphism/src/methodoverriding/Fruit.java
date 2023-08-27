package methodoverriding;

public class Fruit {

	void demo() {
		System.out.println( "friut");
	}
}

class Apple extends Fruit{
	
	void demo() {
		System.out.println(" apple");
	}
}