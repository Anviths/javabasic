package methodchaining;

public class Bottle {
	// attribute of bottle
	private String color;
	private double capacity;

	//getter
	public String getColor() {
		return color;
	}
	public double getCapacity() {
		return capacity;
	}
	//setter
	public Bottle setColor( String color ) {
		this.color=color ;
		return this;

	}

	public Bottle setCapacity( double capacity ) {
		this.capacity = capacity ;
		return this;
	}
	//constructor
	Bottle(){

	}

	public void display( ) {
		System.out.println(" color " + color);
		System.out.println(" Capacity " + capacity);
		System.out.println("=====================");
	}
}
