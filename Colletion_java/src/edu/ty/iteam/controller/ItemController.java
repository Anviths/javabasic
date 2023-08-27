package edu.ty.iteam.controller;

import java.util.HashSet;

import edu.ty.iteam.model.Item;

public class ItemController {

	private HashSet<Item> cart=new HashSet<Item>();
	
	public void addItem(Item item) {
		cart.add(item);
	}
	public void findItem(Item item) {
		
		if(cart.contains(item)) {
			System.out.println("item present");
			System.out.println(item);
		}
		else {
			System.out.println("item not present");
		}
	}
	
	public void removeItem(Item item) {
		if(cart.contains(item)) {
			System.out.println("item removed");
			cart.remove(item);
		}
		else {
			System.out.println("item not found");
		}
	}
	
	public void displayItems() {
		System.out.println(cart);
	}
	public void totalPrice() {
		int total=0;
		for (Item item : cart) {
			total+=item.getItem_price();
		}
		System.out.println("total price of your item Rs"+total);
	}
}
