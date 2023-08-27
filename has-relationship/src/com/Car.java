package com;

public class Car {

	private String model;
	private Engine e =new Engine(1200);
	//get model
	public String getModel() {
		return model;

	}
	//set model
	public void setModel(String model) {
		this.model=model;

	}
	//get engine
	public Engine getEngine() {
		return e;
	}
	//constructor
	public Car() {
		// TODO Auto-generated constructor stub
	}
	//constructor with parameter
	Car(String model){
		setModel(model);
	}
}
