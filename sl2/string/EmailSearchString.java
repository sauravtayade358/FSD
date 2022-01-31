package com.sl.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmailSearchString {
	
	void searchemail() {
		String array[]= {"viratkohli18@gmail.com","msdhoni@yahoo.com","rgsharma56@hotmail.com","diegoforlan21@mail.com","leomessi10@gmail.com",     
                "antogriezmann7@yahoo.in","marcusrashford10@mail.org","kylinmbappe@hotmail.com","paulpogba@gmail.net","marcovanbasten9@yahoo.in","paulodybla22@hotmail.com","tobeymaguire3@mail.com","alexaputellas@gmail.com","mitthaliraj@yahoo.in", "smritimandhana18@gmail.com"		
                };

        Scanner sc= new Scanner(System.in);

        List<String> nameList = new ArrayList<>(Arrays.asList(array));

        System.out.println("Enter an email for searching::");
        String s=sc.next();
        System.out.println("Entered an email::"+s);

        
        System.out.println("Your Searched Mail Found::"+nameList.contains(s));	
	}

	public static void main(String[] args) {
		
		EmailSearchString obj=new EmailSearchString();
		obj.searchemail();
		
	}

}
