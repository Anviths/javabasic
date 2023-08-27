package methodchaining;

public class Car {

	//attributes of Car
	int numSeats;
	String fuelType;

	//getter
	public int getnumSeats() {
		return numSeats;
	}
	public String getfuelType() {
		return fuelType;
	}
	//setter

	public Car setNumSeats( int numSeats ) {
		this.numSeats=numSeats;
		return this ;

	}
	public Car setFuelType( String fuelType ) {
		this.fuelType = fuelType ;
		return this ;

	}
	public Car display()
	{
		System.out.println(" no of seats available in Car " + numSeats) ;
		System.out.println( " fuel type of car " + fuelType ) ;
		return this ;
	}
}
