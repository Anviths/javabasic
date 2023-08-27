package video2;

class Vehicle{
	String model;
	int year;
	
	public Vehicle(String model,int year) {

		this.model=model;
		this.year=year;
	}
}
public class VehicleDriver {

	public static void display(Vehicle v) {
		System.out.println("the model of the Vehicle: "+ v.model);
		System.out.println("year of the Vehicle: " + v.year);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Vehicle v=new Vehicle("Tata",2019);
    
    display(v);
	}

}
