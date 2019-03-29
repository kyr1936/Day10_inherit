package com.yr.zoo;

public class Lion extends Animal {		//Animal 에서 상속받음
	
	public Lion() {
		super();
	}
	
	//Lion만 가지고 있는 요소
	private int tooth;
	
	public int getTooth() {
		return tooth;
	}

	public void setTooth(int tooth) {
		this.tooth = tooth;
	}
	/*
	public void eat (Tazo tazo) {	// 오버로딩
		
	}
	*/
	public void eat () {	// 오버라이딩
//		super.eat(); 	// 부모의 eat()를 출력하자
		System.out.println("찹찹찹");
	}
	
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.eat();
	//	Animal animal = new Animal();		// 구체적이지 않은 객체는 생성하지x - abstract로 강제시킴
		
	}
	
	
}
