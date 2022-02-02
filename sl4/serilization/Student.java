package com.sl.serilization;

import java.io.Serializable;

public class Student implements Serializable{
    
	private int id;
	private String name;
	private transient String email;//dont serialize this value
	private String password;
	
	public Student(int id,String name, String email, String password)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.password=password;
	}
	
	public void display() {
		
		System.out.println(id+ " "+name+" "+email+" ");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1, "Test", "Test@email.com", "Test123");
        s1.display();
	}

}
