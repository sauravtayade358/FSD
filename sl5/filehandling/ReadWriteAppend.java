package com.sl.filehandling;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class ReadWriteAppend {
     
	
	int n1, n2, n3;
    int n;
    Scanner s= new Scanner(System.in);
    
    public void calculator() throws IOException {
    	
    	 System.out.println("Enter no1 for calc::");
         n1=s.nextInt();
         
         System.out.println("Enter no2 for calc::");
         n2=s.nextInt();
         
         while(true){
         	System.out.println("MENU FOR CALCULATOR::");
         	System.out.println("\n1.ADDITION\n 2.SUBTRACTION\n 3.MULT\n 4.DIV\n 5.EXIT");
         	//choice for calculator
         	
         	System.out.println("Enter ur choice for calc::");
         	n=s.nextInt();
         	if(n==1) {
         		System.out.println("Add:: "+(n3=n1+n2));
         	}
         	else if(n==2) {
         		System.out.println("Sub :: "+(n3=n1-n2));
         	}
         	else if(n==3) {
         		System.out.println("Mul:: "+(n3=n1*n2));
         	}
         	else if(n==4) {
         		try 
        		{
        			
        			System.out.println("Result is "+( n3=n1/n2));
        		}
        		catch(ArithmeticException e)
        		{
        			System.out.println("Error "+e);
        		}
         		//System.out.println("Div:: "+(n3=n1/n2));
         	}
         	else {
         		System.out.println("EXIT DONE::");
         		break;
         	}

         	//creating file
    		File file=new File("C:\\Users\\HP\\Desktop\\s\\calcufile.txt");
    		
    		if(file.createNewFile())
    		{
    			System.out.println("File is created");
    		}
    		else
    		{
    			System.out.println("File is already Exist");
    		}
    		//write and append
    		FileWriter writer= new FileWriter(file, true);
    		System.out.println( " ");
    		writer.append("\nFirst NO ::"+n1 +  " \n No 2::"+n2 +  "\n Calculator Ans. ::"+n3 );
    		System.out.println( " ");
    		
    		writer.close();
    		
    		    }
         }
    //for read file
	public static void readFileFileReaderClass() throws IOException
	{
		
		FileReader reader= new FileReader("C:\\Users\\HP\\Desktop\\s\\calcufile.txt");
		int data;
		while((data=reader.read())!=-1)
		{
			System.out.print((char)data);
		}
	}

      public static void main(String[] args) throws IOException {
		ReadWriteAppend obj= new ReadWriteAppend();
		obj.calculator();
		readFileFileReaderClass();
		
	}
}
