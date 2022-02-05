package com.sl.filehandling;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ReadWriteUpdateFile {
	public static void writeToFile(Exception ex) throws IOException {
	      //Retrieving the log file
	      Path logFile = Paths.get("C:\\Users\\HP\\Desktop\\s\\ExceptionLog.txt");
	      //Preparing the data to be logged
	      byte bytes[] = ("\r\n"+LocalDateTime.now()+": "+ ex.toString()).getBytes();
	      //Appending the exception to your file
	      
	      Files.write(logFile, bytes, StandardOpenOption.APPEND);
	      System.out.println("Exception logged to your file");
	   }
	public static void main(String[] args) throws IOException {
		 int n1, n2,n3;
	        int n;
		Scanner s = new Scanner(System.in);
		
        
        try 
        {System.out.println("Enter no1 for calc::");
        n1=s.nextInt();
        
        System.out.println("Enter no2 for calc::");
        n2=s.nextInt();
            
            int result = (n1/(n2));
            System.out.println("Result of "+n1 +"/"+ n2+": "+result);
           
         }
        catch(ArithmeticException ex) {
             System.out.println("Warning: You cannot divide an number with 0");
             writeToFile(ex);
          }
        catch(InputMismatchException ex) {
             System.out.println("Warning: You have entered invalid input");
          
				writeToFile(ex);
        }
		
	}
}