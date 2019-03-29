package com.yr.himart;

public class Handphone extends Product {
	private int inch;
	private String model;
	
	public Handphone() {
		this.inch = 10;
		this.model = "S10";
		this.setBrand("SAMSUNG");
		this.setColor("black");
		this.setPrice(100);
		this.setPoint(10);
	}
	
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
