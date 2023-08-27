package classcastexception;

import java.util.Scanner;

public class OlaApp {


	public static void main(String[] args) {
		System.out.println("+++++ Welcome to Ola App ++++++++++");

		System.out.println("1. Mini");
		System.out.println("2. Sedan");
		System.out.println("Select the choice ");
		Scanner s = new Scanner(System.in);
		int choice =s.nextInt();
		Cab c = null;
		switch(choice) {
		case 1:{
			c=new Mini();

			break;
		}// end of case 1
		case 2:{
			c=new Sedan();

			break;
		}// end of case 2
		default : System.out.println("invalid choice");

		} // end of switch

		//display price per KM
		if(c!=null) {
		if(c instanceof Mini) {
			System.out.println("mini " +((Mini) c) .price +"per KM" );
		}
		else {
			System.out.println("Sedan "+((Sedan)c).price+"per KM");
		}
		}
		
	}//end of main
}// end of class
