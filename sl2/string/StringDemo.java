package com.sl.string;

public class StringDemo {

	public static void main(String[] args) {
		String s1=new String("Hello World");
		
		char c=s1.charAt(2);
		System.out.println("Char at 2"+c);
		System.out.println("Length"+s1.length());
        System.out.println("upper case"+s1.toUpperCase());
        System.out.println("upper case"+s1.toLowerCase());
	    System.out.println("Check String cintains"+s1.contains("Hello"));
        
	    System.out.println("Sub String::"+s1.substring(1, 8));
	    s1.concat("hello");
	    
	    String result []=s1.split("");
	    
	    for(String s:result)
	    {
	    	System.out.println(s);
	    }
	
	    String s2="Hello world";
	    if(s1.equalsIgnoreCase(s2))
	    	System.out.println("Same");
	    else
	    	System.out.println("NOt valid");
	  
	    System.out.println(s1.compareTo(s2));
	
	        
	    
	    
	}
	
	

}
