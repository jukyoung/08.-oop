package com.oop.objectarray01;

public class Run {
	public static void main(String[] args) {
		//노트북(Laptop)형 배열 5칸짜리
		Laptop[] laptops = new Laptop[5];
		laptops[0] = new Laptop("LG", 200000, "white");
		//인스턴스 만듬과 동시에 초기값 잡아줌(heap영역에) 인스턴스의 주소값을 laptops[0]에 담겠다 라는의미
	    //인덱스 공간에 인스턴스의 주소값을 저장해줌
		//laptops[0] 을 했을때 만나는건 laptop형 인스턴스를 만나게 됨
//		System.out.println("laptops[0] : " + laptops[0]);
//		System.out.println(laptops[0].getBrand()); // laptops.brand -> private로 바뀌어있어서오류
//		System.out.println(laptops[0].getPrice());
//		System.out.println(laptops[0].getColor());
//		System.out.println(laptops[0].printAll());
		
		laptops[1] = new Laptop("Apple", 1000000, "space grey");
		//System.out.println(laptops[1].printAll());
		
		laptops[2] = new Laptop("Samsung", 800000, "black");
		//System.out.println(laptops[2].printAll());
		laptops[3] = new Laptop("LG", 350000, "blue");
		laptops[4] = new Laptop("Dell", 500000, "white");
		
//		System.out.println("수정 전");
//		System.out.println(laptops[3]+ " : " + laptops[4]);
//		
//		laptops[3] = laptops[4];
//		
//		System.out.println("수정 후");
//		System.out.println(laptops[3] + " : " + laptops[4]);
		
		//int형 배열 5칸짜리
//		int[] intArr = new int[5];
//		intArr[0] = 10;
		//System.out.println("intArr[0] : " + intArr[0]);
		
		System.out.println("수정 전 : " + laptops[0].getPrice());
		
		laptops[0].setPrice(400000); //원하는 데이터만 수정하는 것 가능
		System.out.println("수정 후 : " + laptops[0].getPrice());
		
		laptops[2].setBrand("Dell");
		laptops[2].setColor("blue");
		
		laptops[1] = null; // 삭제하는 방법
		
		for(int i = 0; i < laptops.length; i++) {
			if(laptops[i] != null) {
			System.out.println(laptops[i].printAll());
			}
		} // 주소값을 담아주기 전까지는 null 이라는 값이 들어있음 
		// null 이라는 값에 . 을 찍음 -> null 은 주소값이 아니라 아무것도 아닌값 
		// nullPointerException 에러가 남 -> . 찍으면 주소값을 찾아가는건데 null은 주소값이 아니기때문에
		// -> 따라서 if 문 걸어주기
	}

}
