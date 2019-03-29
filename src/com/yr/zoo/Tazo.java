package com.yr.zoo;

public class Tazo extends Birds{
	/*
	 public static void main(String[] args) {
	 
		Tazo tazo = new Tazo();
		tazo.setAge(2);
		System.out.println(tazo.getAge());		
	}
	*/
	private int egg;

	
	public Tazo() {
		super();	// super-부모클래스(생략되어있음)
					// 부모의 디폴트 생성자를 호출 - 부모의 객체를 만들기 위해
		}
	
	public Tazo(int egg) {
		this.egg = egg;	
		this.getAge();
		super.getAge(); //부모의 getAge();
	}
	
	public void fly() {
		
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
