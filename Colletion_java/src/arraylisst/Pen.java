package arraylisst;

public class Pen implements Comparable<Pen> {

	int price;
	String color;
	
	public Pen(int price, String color) {
		super();
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() {
		return  price + "," + color ;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Pen p=(Pen) obj;
		return this.price==p.price && p.color.equals(this.color);
	}
	@Override
	public int compareTo(Pen o) {
		
			return this.price-o.price;
		
	}
	
	
}
