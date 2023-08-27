package video3;

public class Truck {

	double cargoCapacity;
	double bedLength;
	
	Truck(){
		
	}
	Truck(double cargoCapacity){
		this.cargoCapacity=cargoCapacity;
	}
	
	Truck(double cargoCapacity,double bedLength){
		this(cargoCapacity);
		this.bedLength=bedLength;
	}
	
	public static Truck createTruck() {
		return new Truck();
	}
	public static Truck createTruck(double cargoCapacity) {
		return new Truck(cargoCapacity);
	}
	public static Truck createTruck(double cargoCapacity,double bedLength) {
		return new Truck(cargoCapacity, bedLength);
	}
}
