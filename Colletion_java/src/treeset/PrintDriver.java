package treeset;

public class PrintDriver {

	public static void main(String[] args) {
		Print<String> p1=new Print<>();//allows String 
		p1.print("hello");
		
		Print<Integer> p2=new Print<>();
		p2.print(10);
		
		Print<Double> p3=new Print<>();
		p3.print(10.25);
		Print<Pen> p4=new Print<>();
		p4.print(new Pen(10,"blue"));
	}
}
