package video2;
//utility of class
public class Circles {
     
	//method to find diameter
	public static double computeDiameter(Circle c) {
		return 2*c.getRadius();
	}
	//method to find area
	public static double computeArea(Circle c) {
		return (22.0/7.0)*c.getRadius()*c.getRadius();
	}
	//method to find circumference 
 	public static double computeCircumference(Circle c) {
		return 2*(22/7)*c.getRadius();
	}
}
