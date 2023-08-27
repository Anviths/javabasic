package classcastexception;

public class Case3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cab c = new Sedan();
		if(c instanceof Mini) {
			Mini m =(Mini) c;
			System.out.println(m.price);
		}
		else {
			Sedan s = (Sedan) c;
			System.out.println( s.price );
					
		}
		System.out.println();
	}

}
