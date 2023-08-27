package tp;

public class Truck {
	double cargoCapacity;
	double bedLength;
	
	Truck(double cargoCapcity,double bedLength) {
		this.cargoCapacity=cargoCapcity;
		this.bedLength=bedLength;
	}
	
	public static Truck crearTruck(double cargoCapcity,double bedLength)
	{
		return new Truck(cargoCapcity,bedLength);
	}

}
