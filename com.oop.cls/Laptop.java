package com.oop.cls; //Laptop 이라고 하는 클래스가 속해있는 패키지명

public class Laptop {
	/* 추상화 : 노트북이 가지고 있는 특성, 기능을 추려내는 작업
	 * 
	 * 특성 : 브랜드, 색상, 가격, 사이즈
	 * 기능 : 전원 on/off 
	 * */
	// 멤버변수(멤버필드) 를 특성을 기준으로 해서 작성

	String brand;
	String color;
	int price;
	double size;
	
	// 기능 -> 메서드(멤버 메서드)
	public void powerOn(){//전원을 키고 끄는데 반환 할거는 없기때문에 반환타입은 void
		System.out.println("전원이 켜졌습니다."); //연습하는거라 안에 출력문 넣음 원래는 안넣기
	}
	
	public void powerOff(){
		System.out.println("전원을 종료합니다.");
	}
	
}
