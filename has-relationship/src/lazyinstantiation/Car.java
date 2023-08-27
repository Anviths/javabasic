package lazyinstantiation;

public class Car {

	private Tyre[] tyre = new Tyre[4];
	
	int i=0;
	public void addTyre(Tyre t) {
		if(i<tyre.length) {
			tyre[i++]=t;
		}
		else {
			System.out.println("Car can have only four tyres");	
		}
	}
	
	public Tyre[] getTyre( ) {
		return tyre;
	}
}
