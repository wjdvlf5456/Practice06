package com.javaex.ex02;

public class Shape {
	
	//필드
	private String fillColor;
	private String lineColor;
	
	
	//생성자	
	//생성자는 부모생성자를 먼저 거친 후 자식생성자로 가기 때문 Shape에 있는 생성자가 먼저 출력이 된다.
	public Shape() {
		System.out.println("생성자 Shaoe(0) 실행");
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("생성자 Shape(2) 실행");
		
	}
	
	//메소드 - gs
	
	//메소드 - 일반

}


