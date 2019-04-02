package com.yr.zoo;

public abstract class Animal {	// extends Object 
	
	//	Animal animal = new Animal(); 생성하지 못하게

	// 모든 동물의 공통적인 요소
	
	private String color;
	private double ki;
	private double muge;
	private int age;



	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getKi() {
		return ki;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}

	public double getMuge() {
		return muge;
	}

	public void setMuge(double muge) {
		this.muge = muge;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public abstract void eat();		// 오버라이딩을 위해 (무조건 출력 필요)





}
