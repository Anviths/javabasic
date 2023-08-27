package treeset;

public class ContactView {

	public static void main(String[] args) {

		PhoneBookControllerList bookControllerList = new PhoneBookControllerList();
		System.out.println("welcome to phone book");
		while (true) {
			System.out.println("1.Add contact");
			System.out.println("2.Remove contact");
			System.out.println("3.Edit contact");
			System.out.println("4.Search contact by name");
			System.out.println("5.Search contact by number");
			System.out.println("6.Display contact ");
			System.out.println("7.Exit");
			System.out.println("Enter the choice");
			int key=0;
			try {
			key = bookControllerList.read.nextInt();
			
			switch (key) {
			case 1:
				bookControllerList.addContact();
				break;
			case 2:
				bookControllerList.removeContact();
				break;
			case 3:
				bookControllerList.editContact();
				;
				break;
			case 4:
				System.out.println("enter the name");
				bookControllerList.display(bookControllerList.searchContactByName(bookControllerList.read.next()));
				break;
			case 5:
				System.out.println("enter the number");
				bookControllerList
						.display(bookControllerList.searchContactByNumber(bookControllerList.read.nextLong()));
				break;
			case 6:
				System.out.println("enter the number");
				bookControllerList.displayphoneBook();
				break;
			case 7:
				System.out.println("thankyou");
				System.exit(0);

			default:
				System.out.println("invalid choice");
				break;
			}
			}
			catch(Exception e) {
				System.out.println("input mismatch");
				 bookControllerList.read.nextLine();
			}
			

		}

	}
}
