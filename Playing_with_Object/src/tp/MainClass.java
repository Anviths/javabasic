package tp;

public class MainClass {
	public static void main(String[] args) {
		Truck t1=Truck.crearTruck(85.35, 8956.3);
		System.out.println(t1.bedLength+" "+t1.cargoCapacity);
		System.out.println(Truck.crearTruck(56, 74).cargoCapacity);
	}

}
