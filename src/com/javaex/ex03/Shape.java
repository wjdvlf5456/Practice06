package com.javaex.ex03;

public class Shape {

	// 필드
	protected String fillColor;		//private 말고 protected를 사용해준다.
	protected String lineColor;

	// 생성자
	// 기본생성자를 만들어준다.
	public Shape () {
		
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	// 메소드 - gs

	// 메소드 - 일반

}
