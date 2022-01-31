package com.sl.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		String str= new String("Hello world");
		//string to stringbuffer +
		StringBuilder s1= new StringBuilder(str);
		
		System.out.println("Size"+s1.length());
		
		s1.append("for ");
		System.out.println(s1);
		s1.insert(10, " ");
		System.out.println(s1);
		
		s1.replace(11, 16, "Object");
		System.out.println(s1);
		
		s1.reverse();
		System.out.println(s1);

	}

}
