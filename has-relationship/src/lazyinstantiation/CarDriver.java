package lazyinstantiation;

public class CarDriver {

	public static void main(String[] args) {

		Car c=new Car( ) ;
		System.out.println( c.getTyre());
		
		c.addTyre(new Tyre( "apollo "));
		c.addTyre(new Tyre( "mrf "));
		c.addTyre(new Tyre( "apollo "));
		c.addTyre(new Tyre( "mrf "));
		c.addTyre(new Tyre( "apollo "));

		for( int i = 0 ; i < c.getTyre().length ; i++ ) {
			System.out.println( c.getTyre()[i].getBrand() ) ;
		}
	}
}
