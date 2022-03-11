package com.oop.objectarray01;

public class Run {
	public static void main(String[] args) {
		//��Ʈ��(Laptop)�� �迭 5ĭ¥��
		Laptop[] laptops = new Laptop[5];
		laptops[0] = new Laptop("LG", 200000, "white");
		//�ν��Ͻ� ����� ���ÿ� �ʱⰪ �����(heap������) �ν��Ͻ��� �ּҰ��� laptops[0]�� ��ڴ� ����ǹ�
	    //�ε��� ������ �ν��Ͻ��� �ּҰ��� ��������
		//laptops[0] �� ������ �����°� laptop�� �ν��Ͻ��� ������ ��
//		System.out.println("laptops[0] : " + laptops[0]);
//		System.out.println(laptops[0].getBrand()); // laptops.brand -> private�� �ٲ���־����
//		System.out.println(laptops[0].getPrice());
//		System.out.println(laptops[0].getColor());
//		System.out.println(laptops[0].printAll());
		
		laptops[1] = new Laptop("Apple", 1000000, "space grey");
		//System.out.println(laptops[1].printAll());
		
		laptops[2] = new Laptop("Samsung", 800000, "black");
		//System.out.println(laptops[2].printAll());
		laptops[3] = new Laptop("LG", 350000, "blue");
		laptops[4] = new Laptop("Dell", 500000, "white");
		
//		System.out.println("���� ��");
//		System.out.println(laptops[3]+ " : " + laptops[4]);
//		
//		laptops[3] = laptops[4];
//		
//		System.out.println("���� ��");
//		System.out.println(laptops[3] + " : " + laptops[4]);
		
		//int�� �迭 5ĭ¥��
//		int[] intArr = new int[5];
//		intArr[0] = 10;
		//System.out.println("intArr[0] : " + intArr[0]);
		
		System.out.println("���� �� : " + laptops[0].getPrice());
		
		laptops[0].setPrice(400000); //���ϴ� �����͸� �����ϴ� �� ����
		System.out.println("���� �� : " + laptops[0].getPrice());
		
		laptops[2].setBrand("Dell");
		laptops[2].setColor("blue");
		
		laptops[1] = null; // �����ϴ� ���
		
		for(int i = 0; i < laptops.length; i++) {
			if(laptops[i] != null) {
			System.out.println(laptops[i].printAll());
			}
		} // �ּҰ��� ����ֱ� �������� null �̶�� ���� ������� 
		// null �̶�� ���� . �� ���� -> null �� �ּҰ��� �ƴ϶� �ƹ��͵� �ƴѰ� 
		// nullPointerException ������ �� -> . ������ �ּҰ��� ã�ư��°ǵ� null�� �ּҰ��� �ƴϱ⶧����
		// -> ���� if �� �ɾ��ֱ�
	}

}
