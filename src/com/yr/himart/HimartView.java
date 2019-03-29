package com.yr.himart;

public class HimartView extends Product {
	// 각 제품의 정보를 출력하는 메서드

	public void view(Product p) {
		System.out.println("Brand : " + p.getBrand());
		System.out.println("Color : " + p.getColor());
		System.out.println("Price : " + p.getPrice());
		System.out.println("Point : " + p.getPoint());

		if(p instanceof Tv) {// p는 Tv 클래스의 객체입니까?
			Tv t = (Tv)p;
			System.out.println(t.getInch());
		}
		else if (p instanceof Computer) {
			Computer c = (Computer)p;
		} else {
			Handphone h= (Handphone)p;
		}
	}
	public void view(Tv[] tvs) {
		for(int i=0; i < tvs.length; i++) {
			
			System.out.println("Brand : " + tvs[i].getBrand());
			System.out.println("Color : " + tvs[i].getColor());
			System.out.println("Price : " + tvs[i].getPrice());
			System.out.println("Point : " + tvs[i].getPoint());
			System.out.println("Inch : " + tvs[i].getInch());
		}

	}
}
