package equalsmethodexample;

public class BookDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 =new Book(25);
		Book b2 =new Book(27);
		Book b3 =new Book(25);
		
		System.out.println(b1);
		System.out.println( b1.equals(b2));
	}

}
