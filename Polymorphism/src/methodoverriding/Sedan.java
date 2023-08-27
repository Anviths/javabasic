package methodoverriding;

public class Sedan extends Cab{

	void printThanks() {
		super.printThanks();
		System.out.println(	"Sedan");
	}
}
