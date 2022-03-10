package com.oop.cls;

public class Run {
    public static void main(String[] args) { //실행클래스 laptop 클래스 실체화 하기
	  
    	// 사용자가 정의해 만들어진 클래스는 모두 참조 자료형
    	Laptop laptop = new Laptop(); // new -> heap 영역안에 저장공간을 만든다.
    	// laptop 이라고 가진 변수를 laptop 이라는 자료형을 가진 데이터가 저장된다 (Stack 영역)
    	// heap 영역에다가 laptop 형 데이터를 저장할 수 있는 공간을 만듬
    	// = -> 주소값을 담아주는 역할
    	// 인스턴스 : heap 영역에다가 laptop 형 데이터를 저장할 수 있는 공간을 만드는 것을 인스턴스화 한다 라고 표현
    	// new Laptop -> laptop 인스턴스화 라고 함
    	
//    	System.out.println(laptop); // -> 주소값이 나옴
//    	System.out.println(laptop.brand);
//	    System.out.println(laptop.price);
    	
	    laptop.brand = "LG";
    	laptop.color = "white";
    	laptop.price = 500000;
    	laptop.size = 16.5;
	    System.out.println(laptop.brand);
	    System.out.println(laptop.color);
	    System.out.println(laptop.price);
	    System.out.println(laptop.size);
	    
	    laptop.powerOn();
	    laptop.powerOff();
	    
//	    laptop.brand = "Apple"; 
//	    laptop.color = "Space grey";
//	    laptop.price = 1000000;
//	    laptop.size = 13.0;
//	    
//	    System.out.println(laptop.brand);
//	    System.out.println(laptop.color);
//	    System.out.println(laptop.price);
//	    System.out.println(laptop.size);
	    
	    //apple 노트북 새로 만든걸까? -> 아니요 덮어씌운것 LG 노트북이 날라간것
	    // 덮어 씌우는 것이 아니라 추가 하고 싶음 -> 인스턴스 하나 생성 하기
	    
	    Laptop laptop2 = new Laptop();
	    laptop2.brand = "Apple";
	    laptop2.color = "Sapce grey";
	    laptop2.price = 1000000;
	    laptop2.size = 13.0;
	    
	    System.out.println(laptop2.brand);
	    System.out.println(laptop2.color);
	    System.out.println(laptop2.price);
	    System.out.println(laptop2.size);
	    
	    
	    Laptop2 lt = new Laptop2("LG", "Blue", 850000, 14.5);
	    System.out.println(lt.setBrand() + " : " + lt.setColor() + " : " + lt.setPrice() + " : " +lt.setSize() );
	    
	    
	    
}
}
