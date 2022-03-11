package com.oop.objectarray02;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {

		// Laptop배열 10칸짜리 하나 만들고
		// 사용자에게 입력받은 브랜드, 가격, 색상을 이용해서 0번 인덱스에 값을 추가하고
		// 일괄 출력
		// 프로그램을 실행시키면 ===laptop 등록 프로그램 ===
		// 1. 등록
		// 2. 조회(전체)
		// 3. 종료
		Scanner sc = new Scanner(System.in);
		Laptop[] lt = new Laptop[10];

		// 사용자가 입력할 때마다 현재 인덱스에 인스턴스 주소값이 담겨 있으면
		// 다음 인덱스에 저장하도록 만드시오.
		int count = 0;

		while (true) {
			System.out.println("=== laptop 등록 프로그램 ===");
			System.out.println("1. 등록");
			System.out.println("2. 전체조회");
			System.out.println("3. 개별조회");
			//조회할 제품의 인덱스 번호를 입력하세요.
			//->사용자가 입력한 인덱스에 해당하는 제품의 정보만 출력
			System.out.println("4. 종료");
			System.out.print(">> ");
			int num = Integer.parseInt(sc.nextLine());

			if (num == 1) {
				if (count < lt.length) {

					System.out.print("브랜드를 입력하세요. >> ");
					String brand = sc.nextLine();
					System.out.print("가격을 입력하세요. >> ");
					int price = Integer.parseInt(sc.nextLine());
					System.out.print("색상을 입력하세요. >> ");
					String color = sc.nextLine();

					lt[count++] = new Laptop(brand, price, color); //후위 연산자 니까 0으로 시작해서 데이터 담기고나서 ++이루어짐
				} else {
					System.out.println("laptop 등록을 종료합니다.");
					continue;
				}

			} else if (num == 2) { // 전체 조회
				for (int i = 0; i < lt.length; i++) {
					if (lt[i] != null) {
						System.out.println(lt[i].printAll());
					}
				}

			} else if(num == 3) { // 개별 조회
				System.out.println("조회할 제품의 인덱스 번호를 입력하세요.");
				System.out.print(">> ");
				int index = Integer.parseInt(sc.nextLine());
				
				if(index < 0 || index > lt.length-1) { //배열의 사이즈에서 -1 가장 끝 인덱스 번호
					System.out.println("존재하지 않는 인덱스 번호입니다.");
					continue;
				}else {//null 값이 안들어 있다면
					if(lt[index] != null) {
						System.out.println(lt[index].printAll());	
					}else {
						System.out.println("등록된 노트북이 없습니다.");
					}
				}
				
				
			}else if(num == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("정상적인 입력값이 아닙니다.");
			}

		}
	}

}
