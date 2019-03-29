package com.yr.himart;

public class Customer {

	private int price;
	private int point;

	public Customer() {
		this.price=1000;
		this.point=0;
	}
	// buy 매개변수는 1개
	// 계산 후- 현재 잔액, 현재 포인트
	public void buy(Product p) {	// price , point만 필요
		this.price = this.price-p.getPrice();
		this.point = this.point+p.getPoint();
		System.out.println("잔액 : " + this.price);
		System.out.println("포인트 : " + this.point);
	}

	
	
	
}
