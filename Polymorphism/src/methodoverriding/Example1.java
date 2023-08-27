package methodoverriding;

public class Example1 {

	public static void main(String[] args) {
		
		Fruit f;
		f=new Fruit();
		f.demo();
		
		f=new Apple();
		f.demo();
		
	}
}
