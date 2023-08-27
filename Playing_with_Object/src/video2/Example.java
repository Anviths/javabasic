package video2;

public class Example {
	static void displayReference(Bottle b1) {
		System.out.println(b1);
	}
	static void displayReference(Box b1) {
		System.out.println(b1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bottle b1=new Bottle();
		Box b11=new Box();
		displayReference(b1);
		Box b2=new Box();
		displayReference(b2);
		
	}

}
