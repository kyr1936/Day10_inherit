package com.yr.zoo;

public abstract class Birds extends Animal {
	private String wing;
	
	
	public abstract void fly();
	
	public Birds() {
	}

	public Birds(String wing) {
		this.wing=wing;
	}
	public String getWing() {
		return wing;
	}

	public void setWing(String wing) {
		this.wing = wing;
	}
	
	
}
