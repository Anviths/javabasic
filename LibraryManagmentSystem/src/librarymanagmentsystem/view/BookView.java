package librarymanagmentsystem.view;

import java.util.Scanner;

import librarymanagmentsystem.controller.BookController;

public class BookView {

	public static void main(String[] args) {

		System.out.println("welcome to library");
		BookController controller = new BookController();
		while (true) {
			System.out.println("1.Add book\n2.Search book\n3.borrow book\n4.return book\n5.remove book");

			System.out.println("6.sort\n7.exit");
			System.out.println("enter the choice");
			int choice = new Scanner(System.in).nextInt();
			switch (choice) {
			case 1:
				controller.addBook();
				break;
			case 2:
				controller.searchBook();
				break;
			case 3:
				controller.borrowBook();
				break;
			case 4:
				controller.returnBook();
				break;
			case 5:
				controller.removeBook();
				break;
			case 6:
				controller.sortBook();
				break;
			case 7:
				return;

			default:
				System.out.println("invalid choice");
				break;
			}
		}
	}
}
