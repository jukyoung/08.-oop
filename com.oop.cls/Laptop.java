package com.oop.cls; //Laptop �̶�� �ϴ� Ŭ������ �����ִ� ��Ű����

public class Laptop {
	/* �߻�ȭ : ��Ʈ���� ������ �ִ� Ư��, ����� �߷����� �۾�
	 * 
	 * Ư�� : �귣��, ����, ����, ������
	 * ��� : ���� on/off 
	 * */
	// �������(����ʵ�) �� Ư���� �������� �ؼ� �ۼ�

	String brand;
	String color;
	int price;
	double size;
	
	// ��� -> �޼���(��� �޼���)
	public void powerOn(){//������ Ű�� ���µ� ��ȯ �ҰŴ� ���⶧���� ��ȯŸ���� void
		System.out.println("������ �������ϴ�."); //�����ϴ°Ŷ� �ȿ� ��¹� ���� ������ �ȳֱ�
	}
	
	public void powerOff(){
		System.out.println("������ �����մϴ�.");
	}
	
}
