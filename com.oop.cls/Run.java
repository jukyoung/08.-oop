package com.oop.cls;

public class Run {
    public static void main(String[] args) { //����Ŭ���� laptop Ŭ���� ��üȭ �ϱ�
	  
    	// ����ڰ� ������ ������� Ŭ������ ��� ���� �ڷ���
    	Laptop laptop = new Laptop(); // new -> heap �����ȿ� ��������� �����.
    	// laptop �̶�� ���� ������ laptop �̶�� �ڷ����� ���� �����Ͱ� ����ȴ� (Stack ����)
    	// heap �������ٰ� laptop �� �����͸� ������ �� �ִ� ������ ����
    	// = -> �ּҰ��� ����ִ� ����
    	// �ν��Ͻ� : heap �������ٰ� laptop �� �����͸� ������ �� �ִ� ������ ����� ���� �ν��Ͻ�ȭ �Ѵ� ��� ǥ��
    	// new Laptop -> laptop �ν��Ͻ�ȭ ��� ��
    	
//    	System.out.println(laptop); // -> �ּҰ��� ����
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
	    
	    //apple ��Ʈ�� ���� ����ɱ�? -> �ƴϿ� ������ LG ��Ʈ���� ���󰣰�
	    // ���� ����� ���� �ƴ϶� �߰� �ϰ� ���� -> �ν��Ͻ� �ϳ� ���� �ϱ�
	    
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
