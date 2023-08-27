package multilevel_inheritance;

public class Triangle extends Shape {

	double base;
	double height;

	Triangle( double base ,double height ){
		this.base=base;
		this.height=height;
	}
	
	//display properties of triangle
	
	void display() {
		System.out.println( "Base : " +this.base );
		System.out.println( "Height : " +this.height );
	}
}
