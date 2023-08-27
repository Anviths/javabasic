package classcastexception;

public class Case1 {

	public static void main(String[] args) {
		
		Cab c= new Mini();
		Mini m=(Mini)c;
		System.out.println(m.price);
	}
}
