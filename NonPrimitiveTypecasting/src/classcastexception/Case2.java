package classcastexception;

public class Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cab c= new Mini();
		System.out.println(((Sedan)c).price);
		
	}

}
