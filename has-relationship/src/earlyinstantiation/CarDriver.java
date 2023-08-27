package earlyinstantiation;

public class CarDriver {

	public static void main(String[] args) {

		Car c=new Car( ) ;

		System.out.println( "no of tyre "+ c.getTyre().length ) ;
		
		for( int i = 0 ; i < c.getTyre().length ; i++ )
		{
			System.out.println( c.getTyre()[i].getBrand() ) ;
		}
	}
}
