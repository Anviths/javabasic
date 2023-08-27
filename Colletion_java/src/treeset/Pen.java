package treeset;

public class Pen implements Comparable<Pen>{

	double price;
	String color;
	
	public Pen(int price, String color) {
		super();
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "{" + price + ", "+ color+"}" ;
	}

	@Override
	public int hashCode() {
		return Double.valueOf(price).hashCode()+color.hashCode();
	}
	@Override
	public int compareTo(Pen o) {
		if(this.hashCode()>o.hashCode())
			return 1;
		if(this.hashCode()<o.hashCode())
			return -1;
		return 0;
		
	}
	
	
	
	

}
