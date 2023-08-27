package exceptions;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in) ;
		
		double num1 = s.nextInt() ;
		double num2 = s.nextInt() ;
		double res = num1/num2 ;
		
		System.out.println( res );
		
	}

}
