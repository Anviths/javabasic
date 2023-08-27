package methodoverriding;

public class Lux extends Cab{
	//override
	void printThanks() {
		super.printThanks();
		System.out.println(	"Lux");
	}
}
