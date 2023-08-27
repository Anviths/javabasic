package methodoverriding;

public class Ola {

	private Cab cab;
	//getter
	Cab getCab() {
		return cab;

	}
	// helper for instantiation
	void bookCab(Cab cab) {
		//copy from local variable to reference variable

		this.cab=cab;

		//thanks message
		cab.printThanks();

	}
}
