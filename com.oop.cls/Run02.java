package com.oop.cls;

public class Run02 {
   public static void main(String[] args) {
	
	 Car avante = new Car(); //�ν��Ͻ��� ����鼭 ���ÿ� �����ڸ� ȣ���ϴ���
	 
	 avante.setBrand("Hyundai");
	 avante.setSpeed(50);
	 avante.setOil(100);
	 System.out.println(avante.getBrand() + " : " + avante.getSpeed() + " : " + avante.getOil());
	 
	 Car moring = new Car("Kia", 100, 50); //�����ε� �� ������ �̿�
	 // �̷��� ���ڰ��� �޴� �����ڰ� ���� -> ������ֱ� -> ���� �����
	 System.out.println(moring.getBrand() + " : " + moring.getSpeed() + " : " + moring.getOil());
	 
	 
	 
//	 avante.brand = "Hyundai"; //private �� �ٲ㼭 ������
//	 avante.setBrand("BMW"); // brand ��� �ϴ� �Ű������� ���
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
//	 avante.speedUp(); // ���� ��ġ�� ���� ������ ����ڰ� ��� �߻���ų�� ���� (�ӵ��� 1000�̷���)
//	 System.out.println("up �� speed : " + avante.speed);
//	 avante.speedUp();
//	 System.out.println("up �� speed : " + avante.speed);
//	 avante.speedUp();
//	 System.out.println("up �� speed : " + avante.speed);
//	 avante.speedDown();
//	 System.out.println("down �� speed : " + avante.speed);
//	 avante.powerOff();
			 
}
}
