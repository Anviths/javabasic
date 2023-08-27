package edu.ty.iteam.controller;

import java.util.Scanner;

import edu.ty.iteam.model.Item;

public class ItemView {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ItemController controller = new ItemController();
		while (true) {
			System.out.println("1.add item to cart");
			System.out.println("2.remove item from cart");
			System.out.println("3.find item");
			System.out.println("4.display Cart");
			System.out.println("5.total price");
			System.out.println("6.Exit");
			System.out.println("enter the choice");
			int key = scanner.nextInt();
			switch (key) {
			case 1:
				controller.addItem(createItem());
				break;
			case 2:
				controller.removeItem(createItem());
				break;
			case 3:
				controller.findItem(createItem());
				break;
			case 4:
				controller.displayItems();
				break;
			case 5:
				controller.totalPrice();
				break;
			case 6:
				System.exit(0);

			default:
				System.out.println("invalid choice");
				break;
			}
		}
	}

	private static Item createItem() {
		Item item = new Item();
		System.out.println("enter the item id");
		item.setItem_id(scanner.nextInt());
		System.out.println("enter the item name");
		scanner.nextLine();
		item.setItem_name(scanner.nextLine());
		System.out.println("enter the item price");
		item.setItem_price(scanner.nextDouble());

		return item;
	}

}
