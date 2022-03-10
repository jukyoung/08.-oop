package com.oop.cls;

public class Run02 {
   public static void main(String[] args) {
	
	 Car avante = new Car(); //인스턴스를 만들면서 동시에 생성자를 호출하는일
	 
	 avante.setBrand("Hyundai");
	 avante.setSpeed(50);
	 avante.setOil(100);
	 System.out.println(avante.getBrand() + " : " + avante.getSpeed() + " : " + avante.getOil());
	 
	 Car moring = new Car("Kia", 100, 50); //오버로딩 된 생성자 이용
	 // 이러한 인자값을 받는 생성자가 없다 -> 만들어주기 -> 에러 사라짐
	 System.out.println(moring.getBrand() + " : " + moring.getSpeed() + " : " + moring.getOil());
	 
	 
	 
//	 avante.brand = "Hyundai"; //private 로 바꿔서 오류남
//	 avante.setBrand("BMW"); // brand 라고 하는 매개변수에 담김
//	 System.out.println(avante.getBrand());
//	 avante.speed = 0;
//	 avante.setSpeed(120);
//	 System.out.println(avante.getSpeed());
//	 avante.setOil(50);
//	 System.out.println(avante.getOil());
//	 avante.oil = 10;
//	 
//	 System.out.println(avante.brand);
//	 System.out.println(avante.speed);
//	 System.out.println(avante.oil);
//	 
//	 avante.powerOn();
//	 avante.speedUp(); // 제한 장치를 걸지 않으면 사용자가 사고를 발생시킬수 있음 (속도가 1000이런것)
//	 System.out.println("up 후 speed : " + avante.speed);
//	 avante.speedUp();
//	 System.out.println("up 후 speed : " + avante.speed);
//	 avante.speedUp();
//	 System.out.println("up 후 speed : " + avante.speed);
//	 avante.speedDown();
//	 System.out.println("down 후 speed : " + avante.speed);
//	 avante.powerOff();
			 
}
}
