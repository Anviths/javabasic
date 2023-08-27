package advantageofupcasting;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println( " +++++++Select A Cab+++++++++");
		System.out.println("press 1 for mini ");
		System.out.println("press 2 for sudan ");
		System.out.println("press 3 for lux ");
		System.out.println("Enter the choice ");
		Scanner s = new Scanner(System.in) ;
		int key = s.nextInt() ;
		Cab cab;
		switch (key) {
		case 1: {
			cab = new Mini();
			
			break;
		}
		case 2: {
			
			cab = new Sedan();
			break;
		}
		case 3: {
			cab = new Lux();
			break;
		}
		default:
			System.out.println( "invalid choice " ) ;
		}
	}

}
