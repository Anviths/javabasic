package methodoverriding;

import java.util.Scanner;

public class OlaDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Welcome to OLA");
		System.out.println( "1.Press 1 for mini");
		System.out.println( "2.Press 2 for Sedan");
		System.out.println( "3.Press 3 for Luxury");
		System.out.println("Enter the choice");
		Ola ola =new Ola();
		Scanner s= new Scanner(System.in);
		int choice=s.nextInt();
		
		switch(choice) {
		case 1:{
			ola.bookCab(new Mini( ));
			break;
		}
		case 2:{
			ola.bookCab(new Sedan( ));
			break;
		}
		case 3:{
			ola.bookCab(new Lux( ));
			break;
		}
		default:
			System.out.println("invalid choice");
		}// end of switch
	}

}
