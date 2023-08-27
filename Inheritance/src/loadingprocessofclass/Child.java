package loadingprocessofclass;

public class Child extends Parent{

	static {
		System.out.println( "Child loaded ");
	}
	static void respect() {
		System.out.println( "repect Parents");
	}
}
