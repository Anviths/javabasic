package methodoverriding;

public class Mini extends Cab{

	void printThanks() {
		super.printThanks();
		System.out.println(	" Mini");
	}
}
