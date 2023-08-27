package video2;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1=new Circle(2.9);
		Circle c2=new Circle(9);
		System.out.println(c1.getRadius());
		System.out.println(c2.getRadius());
		System.out.println(Circles.computeArea(c1));
		System.out.println(Circles.computeArea(c2));
		System.out.println(Circles.computeCircumference(c1));
		System.out.println(Circles.computeDiameter(c1));

		Circles.computeDiameter(c1);
		System.out.println();
	}

}
