package com.yr.himart;

public class Computer extends Product {
	private int capacity;
	private String cpu;
	
	public Computer() {
		this.capacity = 256;
		this.cpu = "i7";
		this.setBrand("Apple");
		this.setColor("silver");
		this.setPrice(200);
		this.setPoint(20);
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
}
