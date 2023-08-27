package equalsmethodexample;

public class Book {

	double price;
	public Book(double price) {
		// TODO Auto-generated constructor stub
		this.price = price ;

	}

	@Override
	public String toString() {
		return ""+price ;
	}

	@Override
	public boolean equals(Object obj) {
		Book b= (Book) obj;
		return this.price==b.price;
	}

}
