package com.javaex.ex02;

public class Triangle extends Shape{
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Triangle() {
		System.out.println("생성자 Trigangle(0) 실행");
		
	}
	
	public Triangle(int width, int height) {
		super("검정", "검정");
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(2) 실행");
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(4) 실행");
		
	}
	
	
	//메소드 - gs 
	
	//메소드 - 일반
	
}


