package com.oop.objectarray02;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {

		// Laptop�迭 10ĭ¥�� �ϳ� �����
		// ����ڿ��� �Է¹��� �귣��, ����, ������ �̿��ؼ� 0�� �ε����� ���� �߰��ϰ�
		// �ϰ� ���
		// ���α׷��� �����Ű�� ===laptop ��� ���α׷� ===
		// 1. ���
		// 2. ��ȸ(��ü)
		// 3. ����
		Scanner sc = new Scanner(System.in);
		Laptop[] lt = new Laptop[10];

		// ����ڰ� �Է��� ������ ���� �ε����� �ν��Ͻ� �ּҰ��� ��� ������
		// ���� �ε����� �����ϵ��� ����ÿ�.
		int count = 0;

		while (true) {
			System.out.println("=== laptop ��� ���α׷� ===");
			System.out.println("1. ���");
			System.out.println("2. ��ü��ȸ");
			System.out.println("3. ������ȸ");
			//��ȸ�� ��ǰ�� �ε��� ��ȣ�� �Է��ϼ���.
			//->����ڰ� �Է��� �ε����� �ش��ϴ� ��ǰ�� ������ ���
			System.out.println("4. ����");
			System.out.print(">> ");
			int num = Integer.parseInt(sc.nextLine());

			if (num == 1) {
				if (count < lt.length) {

					System.out.print("�귣�带 �Է��ϼ���. >> ");
					String brand = sc.nextLine();
					System.out.print("������ �Է��ϼ���. >> ");
					int price = Integer.parseInt(sc.nextLine());
					System.out.print("������ �Է��ϼ���. >> ");
					String color = sc.nextLine();

					lt[count++] = new Laptop(brand, price, color); //���� ������ �ϱ� 0���� �����ؼ� ������ ������ ++�̷����
				} else {
					System.out.println("laptop ����� �����մϴ�.");
					continue;
				}

			} else if (num == 2) { // ��ü ��ȸ
				for (int i = 0; i < lt.length; i++) {
					if (lt[i] != null) {
						System.out.println(lt[i].printAll());
					}
				}

			} else if(num == 3) { // ���� ��ȸ
				System.out.println("��ȸ�� ��ǰ�� �ε��� ��ȣ�� �Է��ϼ���.");
				System.out.print(">> ");
				int index = Integer.parseInt(sc.nextLine());
				
				if(index < 0 || index > lt.length-1) { //�迭�� ������� -1 ���� �� �ε��� ��ȣ
					System.out.println("�������� �ʴ� �ε��� ��ȣ�Դϴ�.");
					continue;
				}else {//null ���� �ȵ�� �ִٸ�
					if(lt[index] != null) {
						System.out.println(lt[index].printAll());	
					}else {
						System.out.println("��ϵ� ��Ʈ���� �����ϴ�.");
					}
				}
				
				
			}else if(num == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else {
				System.out.println("�������� �Է°��� �ƴմϴ�.");
			}

		}
	}

}
