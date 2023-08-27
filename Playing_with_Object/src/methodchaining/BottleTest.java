package methodchaining;

public class BottleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new Bottle().display();
		new Bottle().setColor("red").setCapacity(750).display();
		double a=new Bottle().setColor("red").setCapacity(1000).getCapacity();
		System.out.println(a);

	}

}
