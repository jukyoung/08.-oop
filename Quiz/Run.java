package com.oop.jukebox;

import java.io.FileInputStream;
import java.util.Scanner;

import javazoom.jl.player.Player;

public class Run {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�١� ��ũ �ڽ� �١�");
		System.out.println("�÷��� �ϰ� ���� ������ ������ �ּ���.");
		System.out.println("1. Ruel - as long as you care");
		System.out.println("2. ������  - Blueming Love poem");
		System.out.println("3. H.O.T - ĵ��");
		System.out.println("4. ���α׷� ����");
		System.out.print("���� ���� >> ");
		int menu = Integer.parseInt(sc.nextLine());
		try {
			FileInputStream fis = null; // import ������
			if(menu == 1) {
				fis = new FileInputStream("C:\\Users\\User\\Desktop\\�ڹ�\\����\\as long as you care [HSW0GI_BnB8].mp3");
			}else if(menu == 2) {
				fis = new FileInputStream("C:\\Users\\User\\Desktop\\�ڹ�\\����\\������-03-Blueming-Love poem-192.mp3");
			}else if(menu == 3) {
				fis = new FileInputStream("C:\\Users\\User\\Desktop\\�ڹ�\\����\\H.O.T.-10-ĵ�� (Candy)-SM Best Album 2-128.mp3");
			}else if(menu == 4) {
				System.out.println("��ũ�ڽ��� �����մϴ�. GoodBye-�١�");
			}
			
			Player playMP3 = new Player(fis);
			playMP3.play(); // ����ϴ� �޼���
			
			fis.close();//�ϵ��ũ�� �ڹ����α׷��� �������ִ� ��θ� �ݾ���
		}catch(Exception e) {
			e.printStackTrace(); // � ������ �߻��ߴ��� �����ִ� �޼��� �ʼ������� �־�� ��
			System.out.println("������ ����ϴµ� �����߽��ϴ�."); // if �������� ���� �����߻��ϸ� �ű⿡ ���� ��ó�� �ʿ��ϴ�.
		}
		
		
	}

}
