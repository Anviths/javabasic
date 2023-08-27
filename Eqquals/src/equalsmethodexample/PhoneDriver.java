package equalsmethodexample;

public class PhoneDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone[] p= new Phone[5];
		 p[0]=new Phone(16, 64,"samsung");
		p[1]= new Phone( 8, 128,"Vivo");
		p[2] = new Phone( 4,64,"oppo");
		p[3] = new Phone (8,256,"Moto");
		p[4] = new Phone (8,256,"Moto");
		
		
		System.out.println(p[0].equals(p[1]) );
		System.out.println(p[3].equals(p[4]) );
	}

}
