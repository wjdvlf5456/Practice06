package com.javaex.ex06;

public class MyBase extends Base {

	// 코드작성
	// 낮,밤,오후가 순서대로 오니 그에 맞게 작성한다.
	public void service(String state) {
		if (state.equals("오후")) {
			afternoon();
		} else if (state.equals("낮")) {
			day();
		} else {
			night();

		}

	}
	public void day() {
		System.out.println("낮에는 열심히 수업듣자");
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");

	}

}
