package methodchaining;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = new Car().setFuelType(" diesel ").setNumSeats( 6 ).display().getnumSeats();
           String type = new Car().setFuelType( "petrol" ).setNumSeats( 4 ).getfuelType() ;
		System.out.println(n);
		System.out.println(type);
	}

}
