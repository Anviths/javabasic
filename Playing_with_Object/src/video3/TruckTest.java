package video3;

public class TruckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Truck t1=Truck.createTruck();
		Truck t2=Truck.createTruck(2500);
		Truck t3=Truck.createTruck(5000, 8.7);
		System.out.println(t1);
		System.out.println(t2.cargoCapacity);
		System.out.println(t3.bedLength);
	}

}
