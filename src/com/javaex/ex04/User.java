package com.javaex.ex04;

public class User {
	
	//필드
	protected String id;
	protected String password;
	protected String name;
	
	//생성자
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}

	//메소드 - gs
	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	//메소드 일반
	public void showInfo() {
		System.out.print("#아이디: " + id + " #패스워드: " + password + " #이름: " + name);
		
	}
	
	
	
	
	
	
}
