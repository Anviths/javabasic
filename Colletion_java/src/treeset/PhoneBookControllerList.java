package treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class PhoneBookControllerList {

	TreeSet<Contact> phoneBook = new TreeSet<>(new SortContactByNameAsending());
	Scanner read = new Scanner(System.in);

	/*
	 * add contact to our TreeSet collection
	 */
	public void addContact() throws Exception{
		if (phoneBook.add(createContact()))
			System.out.println("contact ADDED SUCESSFULLY");
		else
			System.out.println("contact already exist");
	}
	/**
	 * create the new contact
	 * @return contact
	 */

	public Contact createContact() throws Exception{
		System.out.println("enter the Name");
		String name = read.next();
		System.out.println("enter the contact number");
		long number = read.nextLong();
		return new Contact(name, number);
	}

	/**
	 * remove the contact that is present in the phone book
	 */
	public void removeContact() throws Exception{
		System.out.println("enter the name");
		Contact c = searchContactByName(read.next());
		if (phoneBook.remove(c))
			System.out.println("contact removed");
		else
			System.out.println("contact not found");
	}
	/**
	 * search the contact by using name
	 * @parameter name
	 * @return contact
	 */

	public Contact searchContactByName(String name) throws Exception{
		for (Contact contact : phoneBook) {
			if (contact.name.equalsIgnoreCase(name))
				return contact;
		}

		return null;
	}
	/**
	 * find the contact by number
	 * @parameter number
	 * @return Contact
	 */

	public Contact searchContactByNumber(long number) throws Exception{
		for (Contact contact : phoneBook) {
			if (contact.phoneNumber == number)

				return contact;
		}
		return null;
	}

	/*
	 * 
	 * edit the contact if it exist
	 */
	public void editContact() throws Exception {
		System.out.println("enter name to search");
		Contact c = searchContactByName(read.next());
		if (c != null) {
			System.out.println("enter the number to update");
			c.phoneNumber = read.nextLong();
			System.out.println("contact update");
		}
		else System.out.println("no contact found");
	}

	/**
	 * display the entire contact book
	 */
	public void displayphoneBook() {
		System.out.println(phoneBook);
	}

	/***
	 * display contact that is returned by search
	 * @parameter Contact
	 */
	public void display(Contact contact) {
		if (contact != null)
			System.out.println(contact);
		else
			System.out.println("no contact found");
	}
}
