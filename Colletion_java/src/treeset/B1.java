package treeset;

import java.util.ArrayList;
import java.util.Scanner;

public class B1 {

	public static void main(String[] args) {
    /*
     * create 5 book object
     * 
     */
		
		ArrayList<Book> lib=new ArrayList<>();
		lib.add(new Book(1,"Harry Potter",1500));
		lib.add(new Book(2,"Mission imposiible",3500));
		lib.add(new Book(3,"Avengers",500));
		lib.add(new Book(4,"KGF",4000));
		lib.add(new Book(5,"RRR",1500));
		lib.add(new Book(6,"think and grow",1500));
		lib.add(new Book(7,"Mahabharat",3500));
		lib.add(new Book(8,"ramayana",500));
		lib.add(new Book(9,"atomic habits",4000));
		lib.add(new Book(10,"ikagai",1500));
		lib.add(new Book(11,"titanic",1500));
		lib.add(new Book(12,"2 states",3500));
		lib.add(new Book(13,"sachin",500));
		lib.add(new Book(14,"wings of fire",4000));
		lib.add(new Book(15,"ramayan drashnam",1500));
		
		/*
		 * read user to search the book by title
		 */
		
		Scanner read=new Scanner(System.in);
		System.out.println("enter the title to search");
		String search=read.nextLine();
		boolean available=false;
		Book temp=null;
		//start
		long start=System.nanoTime();
				
		for(Book b:lib) {
			if(b.getBookTitle().equalsIgnoreCase(search)) {
				available=true;
				temp=b;
//				break;
			}
				
		}
		long stop=System.nanoTime();
		//end loop
		if(available) {
			System.out.println(temp.getBookTitle()+" is available");
		}
		else
			System.out.println("not available");
		
		System.out.println("time taken is "+(start-stop)+"ns");
	}

}
