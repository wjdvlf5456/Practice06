package com.javaex.ex04;

public class Employee extends User {
	
	//필드
	private int salary;

	//생성자
	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}

	//메소드 - gs
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	//메소드 일반
	public void showInfo() {
		super.showInfo();
		System.out.println("#월급: " + salary);
		System.out.println(name + "의 월급은 " +salary+ "원 입니다.");
		
	}
	
	

	
}
