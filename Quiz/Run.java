package com.oop.jukebox;

import java.io.FileInputStream;
import java.util.Scanner;

import javazoom.jl.player.Player;

public class Run {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("☆☆ 쥬크 박스 ☆☆");
		System.out.println("플레이 하고 싶은 음악을 선택해 주세요.");
		System.out.println("1. Ruel - as long as you care");
		System.out.println("2. 아이유  - Blueming Love poem");
		System.out.println("3. H.O.T - 캔디");
		System.out.println("4. 프로그램 종료");
		System.out.print("음악 선택 >> ");
		int menu = Integer.parseInt(sc.nextLine());
		try {
			FileInputStream fis = null; // import 시켜줌
			if(menu == 1) {
				fis = new FileInputStream("C:\\Users\\User\\Desktop\\자바\\수업\\as long as you care [HSW0GI_BnB8].mp3");
			}else if(menu == 2) {
				fis = new FileInputStream("C:\\Users\\User\\Desktop\\자바\\수업\\아이유-03-Blueming-Love poem-192.mp3");
			}else if(menu == 3) {
				fis = new FileInputStream("C:\\Users\\User\\Desktop\\자바\\수업\\H.O.T.-10-캔디 (Candy)-SM Best Album 2-128.mp3");
			}else if(menu == 4) {
				System.out.println("쥬크박스를 종료합니다. GoodBye-☆★");
			}
			
			Player playMP3 = new Player(fis);
			playMP3.play(); // 재생하는 메서드
			
			fis.close();//하드디스크와 자바프로그램을 연결해주는 통로를 닫아줌
		}catch(Exception e) {
			e.printStackTrace(); // 어떤 에러가 발생했는지 보여주는 메서드 필수적으로 넣어야 함
			System.out.println("음악을 재생하는데 실패했습니다."); // if 문구에서 만약 오류발생하면 거기에 대한 대처가 필요하다.
		}
		
		
	}

}
