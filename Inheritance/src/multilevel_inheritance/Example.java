package multilevel_inheritance;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RightAngleTriangle r1=new RightAngleTriangle(8.0 , 2);
		System.out.println(r1.area);
		System.out.println(r1.base);
		System.out.println(r1.height);
		
		r1.computeArea();
		r1.display();
		String s;
	}

}
