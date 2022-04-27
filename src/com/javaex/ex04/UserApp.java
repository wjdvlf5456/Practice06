package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User jws = new Customer("jws", "j1234", "정우성", 1000);
		
		User yjs = new Customer("yjs", "y2345", "이효리", 2000);
		
		User master = new Employee("master", "m7788", "운영자", 5000000);
		
		User[] user = new User[3];
		
		user[0] = jws;
		user[1] = yjs;
		user[2] = master;
		
		for (int i = 0; i < user.length; i++) {
			user[i].showInfo();
			
		}
		
		 
		
		
		
		
		

	}

}
