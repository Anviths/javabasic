package exceptions;

import java.util.Scanner;

public class SpeedCalculaor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("main start");
		System.out.println("enter the distance");
		int distance=s.nextInt() ;
		System.out.println("enter the time in hours");
		int hours=s.nextInt();
		try {
		int speed=Calculator.div(distance, hours) ;
		System.out.println(speed);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("main end");
	}

}
