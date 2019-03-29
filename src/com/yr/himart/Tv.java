package com.yr.himart;

public class Tv extends Product {
	private int inch;

	public Tv() {
		this.inch=65;
		this.setBrand("LG");
		this.setColor("black");
		this.setPrice(400);
		this.setPoint(40);
	}
	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		
		System.out.println(tv.inch);
	}
	
}
