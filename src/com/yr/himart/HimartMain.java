package com.yr.himart;

public class HimartMain {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Tv tv = new Tv();
		Handphone handphone = new Handphone();

		Product[] products = new Product[3];
		products[0]=tv;
		products[1]=handphone;
		products[2]=computer;
		
		
		HimartView hv = new HimartView();
		
		
		hv.view(tv);
		hv.view(computer);
		hv.view(handphone);

//		Tv [] tvs = new Tv[3];
//		for(int i=0; i < tvs.length; i++) {
//			tvs[i] = new Tv();
//		}
//		
//		hv.view(tvs);
//		
//		Computer [] coms = new Computer[3];
//		for(int i=0; i < tvs.length; i++) {
//			coms[i] = new Computer();
//		}
//		hv.view(coms);
//		Handphone[] phones = new Handphone[3];
//		for(int i=0; i < phones.length; i++) {
//			phones[i] = new Handphone();
//		}
//		hv.view(phones);
	
		Customer c = new Customer();
		c.buy(tv);
		c.buy(computer);
		
		Product p = tv;		// 상속관계에서만 가능  // 주소를 따라감
		
		
//		p = computer;
//		p = handphone;
		System.out.println(p.getBrand());
		System.out.println(p.getPrice());
//		System.out.println(p.getInch());  --> 접근  불가능. 만들어져있지만 접근이 불가
		
		((Tv)p).getInch();   // 형변환
		System.out.println(((Tv)p).getInch());
		
		p = new Product();
		System.out.println(((Tv)p).getInch());
		
		
	}

}
