package edu.ty.iteam.model;

import java.util.Objects;

public class Item {

	private int item_id;
	private String item_name;
	private double item_price;

	public Item() {

	}

	public Item(int item_id, String item_name, double item_price) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_price = item_price;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public double getItem_price() {
		return item_price;
	}

	public void setItem_price(double item_price) {
		this.item_price = item_price;
	}

	@Override
	public String toString() {
		return "{ item_id=" + item_id + ", item_name=" + item_name + ", item_price=" + item_price + "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(item_id,item_name);
	}

	@Override
	public boolean equals(Object obj) {
		return this.item_id==((Item)obj).item_id && this.item_name.equals(((Item)obj).item_name);
		
	}
	
	

}
