package com.org.c;

import java.util.Scanner;

public class vowel {
  public static void main(String[] args) {
	char a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a char for vowel;");
	a=sc.next().charAt(0);
	if(a== 'a'|| a== 'e'|| a == 'i' ||a == 'o' ||a== 'u'||a == 'A' ||a == 'E'|| a=='I' || a=='O'||a=='U'){
        System.out.println("Given character is an vowel");
     }else{
        System.out.println("Given character is a consonant");
     }
	
}
}
