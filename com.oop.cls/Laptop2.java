package com.oop.cls;

public class Laptop2 {
	
	private String brand;
	private String color;
	private int price;
	private double size;
	//�⺻������
	//4���� ����ʵ带 �Ű������� �޴� ������
	public Laptop2() {}
	public Laptop2(String brand, String color, int price, double size) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.size = size;
	}
	public String setBrand() {
		return this.brand;
	}
	public void getBrand(String brand) {
		this.brand = brand;
	}
	
	public String setColor() {
		return this.color;
	}
	public void getColok(String color) {
		this.color = color;
	}
	public int setPrice() {
		return this.price;
	}
	public void getPrice(int price) {
		this.price = price;
	}
	public double setSize() {
		return this.size;
	}
	public void getSize(double size) {
		this.size = size;
	}

}
