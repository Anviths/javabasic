package com;

public class Engine {

	private double hp;

	//getter
	public double getHp() {
		return hp;

	}
	public void setHp(double hp) {
		this.hp=hp;
	}
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	Engine(double hp){
		setHp(hp);
	}
}
