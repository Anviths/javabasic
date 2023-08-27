package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Controller {

	public static  void addBook() {
		Book b=new Book();
		b.setName("a");
		b.setAuthor("bb");
	
	
		
	}
	
	public static void main(String[] args) {
		HashSet<Book> books=new HashSet<>();
		books.add(new Book("abc", "xyz"));
		Book b=new Book();
		b.setName("a");
		b.setAuthor("bb");
		books.add(b);
		System.out.println(books);
	
		
	}
}
