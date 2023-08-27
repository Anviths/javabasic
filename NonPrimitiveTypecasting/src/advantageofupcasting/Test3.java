package advantageofupcasting;

import java.util.Arrays;

public class Test3 {

	//design a method to accept Object & print it
	
	public static void displayReference(Cab o) {
		System.out.println( o );
	}
	public static void main(String[] args) {
		displayReference(new Mini() );
		displayReference(new Sedan() );
		displayReference(new Lux() );
		int[] a =new int[5];
	
		
	}
}

