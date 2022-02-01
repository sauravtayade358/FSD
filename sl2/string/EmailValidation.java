package com.sl.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmailValidation {
	
	String array[]= {"viratkohli18@gmail.com","msdhoni@yahoo.com","rgsharma56@hotmail.com","diegoforlan21@mail.com","leomessi10@gmail.com",     
            "antogriezmann7@yahoo.in","marcusrashford10@mail.org","kylinmbappe@hotmail.com","paulpogba@gmail.net","marcovanbasten9@yahoo.in",
            "paulodybla22@hotmail.com","tobeymaguire3@mail.com","alexaputellas@gmail.com","mitthaliraj@yahoo.in", "smritimandhana18@gmail.com"		
            };
	
	List<String> nameList = new ArrayList<>(Arrays.asList(array));
	Scanner sc= new Scanner(System.in);
	String s;
	 
	//for enter an email
	public void enteremail()
	{
        System.out.println("Enter an email for searching::");
        s=sc.next();
        System.out.println("Entered an email::"+s);
	}
	
	//serach email and return index
	public void emailvalidation() {
		
		int ind = nameList.indexOf(s) ;
       
        if(nameList.contains(s)==true)
        {
        	System.out.println(" USER AUTHENTICATED :: "+s);
        	System.out.println("Your Entered email id :"+ind); 
        	
        }
        else
        	System.out.println("UNAUTHORISE ACESS::"+s);
        
         
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		EmailValidation obj=new EmailValidation();
		
		int n;
		 
        while(true){
        	System.out.println("MENU FOR Email Serach::");
        	System.out.println("\n 1.Email Enter for Authentication \n 2.User Authenticate \n 3.Exit ");
        	//choice for calculator
        	
        	System.out.println("Enter ur choice ::");
        	n=sc.nextInt();
        	if(n==1) {
        		obj.enteremail();
        	}
        	else if(n==2) {
        		obj.emailvalidation();
        	}
        	
        	else {
        		System.out.println("EXIT DONE::");
        		break;
        	}
        	
	}

}
}


/*output
 * 
 * 

 * 
 * 
 */

