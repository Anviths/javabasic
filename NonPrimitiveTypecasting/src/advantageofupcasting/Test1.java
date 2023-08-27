package advantageofupcasting;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cab c2= new Lux();
		Cab c1= new Mini() ;
		Cab c3 = new Sedan() ;
		System.out.println( c1 );
		System.out.println( c2 );
		System.out.println( c3 );
	}

}
