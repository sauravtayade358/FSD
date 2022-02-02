package com.sl.regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
	public static void main(String[] args) {
		String regex="^(?=.*[A-Z]).{8,}";
		String input="Pass@12345";
		
		Pattern pattern=Pattern.compile(regex);
        Matcher match=pattern.matcher(input);
       
       if(match.matches())
       {
    	   System.out.println("Valid Password");
       }
       else
       {
    	   System.out.println("NOT VALID");
       }
		
		
	}
}
