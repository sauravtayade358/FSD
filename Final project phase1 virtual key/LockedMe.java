package com.sl.filehandling;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LockedMe  {
	//fixed location
    final  String FOLDER="C:\\Users\\HP\\Desktop\\s\\";
	Scanner sc= new Scanner(System.in); 
	 public void Create() throws IOException {
		    
		 
		 //creating a new file
		 System.out.println("Enter a name file for created::");
		 String f=sc.nextLine();
		 File file=new File(FOLDER+f+".txt");
 		if(file.createNewFile())
 		{
 			System.out.println("File is created");
 		}
 		else
 		{
 			System.out.println("File is already Exist");
 		}
 		
 		
 		
 		//writing data into file
 		System.out.println("Enter a Data in a File::");
 		FileWriter writer= new FileWriter(file, true);
 		String input = sc.nextLine();
 		writer.write(input);
		writer.close();
 		
		
		//reading data
		System.out.println("User Enterd Details::");

		FileReader reader= new FileReader(FOLDER+f+".txt");
		int data;
		while((data=reader.read())!=-1)
		{
			System.out.print((char)data);
		}
 		
    }
	 
	 //Delete a file 
	 public void Delete() {
			try {
				 System.out.println("Enter a name file Delete::");
				 String f2=sc.nextLine();
				Path path= Paths.get(FOLDER+f2+".txt");
				if(Files.deleteIfExists(path))
					System.out.println("File deleted");
				else
					System.out.println("file not deleted");
				
			} catch (NoSuchFileException e) {
				System.out.println("No such file exist");
			}
			catch(DirectoryNotEmptyException e)
			{
				System.out.println("Directory is not empty");
			}
			catch(IOException e)
			{
				System.out.println("Invalid Permission");
			}
	 }
	 
	 //retrive files
	 public void getfile() {
		 
		 File directoryPath = new File("C:\\Users\\HP\\Desktop\\s\\");
	      //List of all files and directories
	      String contents[] = directoryPath.list();
	      System.out.println("List of files and directories in the specified directory:");
	      for(int i=0; i<contents.length; i++) {
	         System.out.println(contents[i]);
	      }
	      
	      
	  
	      System.out.println(Arrays.toString(contents));  
			
		 
	 }
	 
	 public void searchfile(){
		 String s;
		 //File file=new File(FOLDER+f+".txt");
		 File directoryPath = new File("C:\\Users\\HP\\Desktop\\s\\");
		 
	      //List of all files and directories
	      String contents[] = directoryPath.list();
	      System.out.println("enter search file");
	  	  List<String> nameList = new ArrayList<>(Arrays.asList(contents));
	        s=sc.next();
	       
	        int ind = nameList.indexOf(s) ;
	        
	        if(nameList.contains(s)==true)
	        {
	        	System.out.println(" File Found :: "+s);
	        	System.out.println("Your Entered File id :"+ind); 
	        	
	        }
	        else
	        	System.out.println("File not found::"+s);		 
			 
	 }
	 public static void closeApp() {
	        System.out.println("Closing your application... \nThank you!");
	        
	            }
	 
	 public static void main(String[] args)throws  IOException{
		 int n,num;
		 String s;
		 Scanner sc= new Scanner(System.in);
		 LockedMe obj=new LockedMe();
		 
		 while(true){
			 
			    System.out.println("\n\n******* WELCOME TO LOCKEDME.COM ******\n");
	        	System.out.println(" **MENU FOR FILE BUSINESS OPER. INFORMATION::**\n");
	        	System.out.println("\n1.RETRIVE FILES    \n2.USER DETAILS FOR FILE  \n   1.Create\n   2.Search\n   3.Delete  \n3.EXIT ");
	        	
	        	
	        	System.out.println("Enter ur choice ::");
	        	n=sc.nextInt();
	        	
	        	switch(n)
	        	{  
	        	  
	        	  case 1: 
	        		  System.out.println("File LIST::");
	        		  obj.getfile();
	        		  
	        	    break;
	   
	        	  // code to be executed if n = 2;
	        	  case 2:
	        		  //for menu within menu
	        		  while(true) {
	        		  System.out.println(" \n 1.CREATE \n 2.SEARCH \n 3.DELETE  \n 4.Back to  Main Menu");
	        		  System.out.println("Enter ur choice ::");
	  	        	
	  	        	  num=sc.nextInt();
	        	  
	        	  switch(num) 
	        	  {    
	        	    
	        	    case 1: 
	        	    	 obj.Create();
	        	      break;
	        	      
	        	   
	        	    case 2: 
	        	    	
	        	    	obj.searchfile();
	        	    	break;
	        	      
	        	   
	        	    case 3: 
	        	       obj.Delete();
	        	       break;
	        	    
	        	    case 4:
	        	    	System.out.println("Back In Main MENU");
	        	    	break;
	        	      // doesn't match any cases
	        	      default:   System.out.println("You have made an invalid choice!");
	        	  }
	        	   if(num==4)
	        		 break;
	        		  }
	        	  break;
	  	       
	        	 
	 
	  	 
	        	  // code to be executed if n = 3;
	        	  case 3: 
	        		
	        		  closeApp();
	        		  System.out.println("Exit");
	        		  System.exit(0);
	        	      break;
	        	  
	        	  default:  System.out.println("You have made an invalid choice!");
	        	}	

	    		
		 }
		 
		}	 
		 
	}
	 /******** WELCOME TO LOCKEDME.COM ******

 **MENU FOR FILE BUSINESS OPER. INFORMATION::**


1.RETRIVE FILES    
2.USER DETAILS FOR FILE  
   1.Create
   2.Search
   3.Delete  
3.EXIT 
Enter ur choice ::
1
File LIST::
List of files and directories in the specified directory:
 am back.txt
.txt
aa.txt
ab.txt
abc.txt
abcd.txt
abcde.txt
abcdefg.txt
abcdew.txt
aq.txt
aqq.txt
bg.txt
calcfile.txt
calcufile.txt
calcufile3.txt
cv.txt
ExceptionLog.txt
grt.txt
h.txt
jk.txt
kk.txt
kkr.txt
kl.txt
sd.txt
Simple.class
Simple.java
srt1.txt
textfile.txt
textfile2.txt
textfile3.txt
textfile4.txt
[ am back.txt, .txt, aa.txt, ab.txt, abc.txt, abcd.txt, abcde.txt, abcdefg.txt, abcdew.txt, aq.txt, aqq.txt, bg.txt, calcfile.txt, calcufile.txt, calcufile3.txt, cv.txt, ExceptionLog.txt, grt.txt, h.txt, jk.txt, kk.txt, kkr.txt, kl.txt, sd.txt, Simple.class, Simple.java, srt1.txt, textfile.txt, textfile2.txt, textfile3.txt, textfile4.txt]


******* WELCOME TO LOCKEDME.COM ******

 **MENU FOR FILE BUSINESS OPER. INFORMATION::**


1.RETRIVE FILES    
2.USER DETAILS FOR FILE  
   1.Create
   2.Search
   3.Delete  
3.EXIT 
Enter ur choice ::
2
 
 1.CREATE 
 2.SEARCH 
 3.DELETE  
 4.Back to  Main Menu
Enter ur choice ::
1
Enter a name file for created::
rnt
File is created
Enter a Data in a File::
welcome back 
User Enterd Details::
welcome back  
 1.CREATE 
 2.SEARCH 
 3.DELETE  
 4.Back to  Main Menu
Enter ur choice ::
1
Enter a name file for created::
rnt
File is already Exist
Enter a Data in a File::
 again
User Enterd Details::
welcome back  again 
 1.CREATE 
 2.SEARCH 
 3.DELETE  
 4.Back to  Main Menu
Enter ur choice ::
2
enter search file
rnt.txt
 File Found :: rnt.txt
Your Entered File id :23
 
 1.CREATE 
 2.SEARCH 
 3.DELETE  
 4.Back to  Main Menu
Enter ur choice ::
2
enter search file
www.txt
File not found::www.txt
 
 		
1.CREATE 
 2.SEARCH 
 3.DELETE  
 4.Back to  Main Menu
Enter ur choice ::
3
Enter a name file Delete::
a
file not deleted
 
 1.CREATE 
 2.SEARCH 
 3.DELETE  
 4.Back to  Main Menu
Enter ur choice ::
3
Enter a name file Delete::
abc.txt
file not deleted
 
 1.CREATE 
 2.SEARCH 
 3.DELETE  
 4.Back to  Main Menu
Enter ur choice ::
3
Enter a name file Delete::
aq
File deleted
 
 1.CREATE 
 2.SEARCH 
 3.DELETE  
 4.Back to  Main Menu
Enter ur choice ::
3
Enter a name file Delete::
aa
File deleted
 
 1.CREATE 
 2.SEARCH 
 3.DELETE  
 4.Back to  Main Menu
Enter ur choice ::
4
Back In Main MENU


******* WELCOME TO LOCKEDME.COM ******

 **MENU FOR FILE BUSINESS OPER. INFORMATION::**


1.RETRIVE FILES    
2.USER DETAILS FOR FILE  
   1.Create
   2.Search
   3.Delete  
3.EXIT 
Enter ur choice ::
******* WELCOME TO LOCKEDME.COM ******

 **MENU FOR FILE BUSINESS OPER. INFORMATION::**


1.RETRIVE FILES    
2.USER DETAILS FOR FILE  
   1.Create
   2.Search
   3.Delete  
3.EXIT 
Enter ur choice ::
3
Closing your application... 
Thank you!
	  * 
	  */

