package librarymanagmentsystem.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import librarymanagmentsystem.model.Book;
import librarymanagmentsystem.sorting.SortBookByAuthorAsending;
import librarymanagmentsystem.sorting.SortBookByAuthorDesending;
import librarymanagmentsystem.sorting.SortBookByIdAsending;
import librarymanagmentsystem.sorting.SortBookByIdDesending;
import librarymanagmentsystem.sorting.SortBookByTitleAsending;
import librarymanagmentsystem.sorting.SortBookByTitleDesending;

public class BookController {

	private Scanner read = new Scanner(System.in);
	ArrayList<Book> books = new ArrayList<Book>();

	public void addBook() {
		System.out.println("Enter the title");
		String title = read.next();
		System.out.println("Enter the author");
		String author = read.next();
		System.out.println("Enter the id");
		String id = read.next();
		Book book = new Book(title, author, id, true);
		books.add(book);
		System.out.println("Book add sucessfully to the Library....");

	}

	public void searchBook() {
		System.out.println("enter the title or id or author to search the book");
		String choice = read.next();
		boolean found = false;

		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(choice) || book.getAuthor().equalsIgnoreCase(choice)
					|| book.getId().equalsIgnoreCase(choice)) {
				System.out.println(book);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("book not found");
		}
	}

	public void borrowBook() {
		System.out.println("enter the title or id or author to borrow the book");
		String choice = read.next();
		boolean found = false;

		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(choice) || book.getAuthor().equalsIgnoreCase(choice)
					|| book.getId().equalsIgnoreCase(choice) && book.isAvailable()) {
				book.setAvailable(false);
				System.out.println("book borrowed ..!");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("book not found");

		}
	}

	public void returnBook() {
		System.out.println("enter the return book Id");
		String choice = read.next();
		boolean found = false;

		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(choice) || book.getAuthor().equalsIgnoreCase(choice)
					|| book.getId().equalsIgnoreCase(choice) && (!book.isAvailable())) {
				book.setAvailable(true);
				System.out.println("book returned ..!");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("wrong book");
		}
	}

	public void removeBook() {
		System.out.println("enter the book id to remove");
		String choice = read.next();
		Book b = null;
		for (Book book : books) {
			if (book.getId().equalsIgnoreCase(choice)) {
				b = book;
				break;
			}
		}
		if (b != null) {
			books.remove(b);
			System.out.println("book removed");
		}
		else {
			System.out.println("data mismatch");
		}
		
	}
	public void sortBook() {
		System.out.println("1.sort by id asending");
		System.out.println("2.sort by id desending");
		System.out.println("3.sort by author asending");
		System.out.println("4.sort by author desending");
		System.out.println("5.sort by title asending");
		System.out.println("6.sort by title desending");
		System.out.println("Enter choice");
		int choice=read.nextInt();
		Comparator<Book> sort=null;
		switch (choice) {
		case 1:
			sort=new SortBookByIdAsending();
			break;
		case 2:
			sort=new SortBookByIdDesending();
			break;
		case 3:
			sort=new SortBookByAuthorAsending();
			break;
		case 4:
			sort=new SortBookByAuthorDesending();
			break;
		case 5:
			sort=new SortBookByTitleAsending();
			break;
		case 6:
			sort=new SortBookByTitleDesending();
			break;

		default:
			System.out.println("invalid choice");
			break;
		}
		if(sort!=null) {
			Collections.sort(books,sort);
		}
	}
}
