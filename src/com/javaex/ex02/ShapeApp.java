package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		
		// s1은 부모생성자 Shape(2)만 거치고 출력이 되므로 Shape(2)먄 나올것이다.
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		
		//t1은 먼저 부모의 기본생성자를 먼저 거치고 자식의 기본생성자를 거칠 것이다. 
		//그러므로 Shape(0), Triangle(0)
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		//t2는 Shape(2)를 거친 후 Triangle(4)를 거칠 것이다.
		
		//t2는 Shape(2)를 거친 후 Triangle(2)를 지나왔다.		
		
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		
		//t3는 Shape(2)를 거친 후 Triangle(4)를 거칠 것이다.
		
	}

}

