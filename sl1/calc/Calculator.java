package calc;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n1, n2;
        int n;
        Scanner s= new Scanner(System.in);
        //user input no
        System.out.println("Enter no1 for calc::");
        n1=s.nextInt();
        
        System.out.println("Enter no2 for calc::");
        n2=s.nextInt();
        
        
        
        while(true){
        	System.out.println("MENU FOR CALCULATOR::");
        	System.out.println("1.ADDITION\n 2.SUBTRACTION\n 3.MULT\n 4.DIV\n 5.EXIT");
        	//choice for calculator
        	
        	System.out.println("Enter ur choice for calc::");
        	n=s.nextInt();
        	if(n==1) {
        		System.out.println("Add:: "+(n1+n2));
        	}
        	else if(n==2) {
        		System.out.println("Sub :: "+(n1-n2));
        	}
        	else if(n==3) {
        		System.out.println("Mul:: "+(n1*n2));
        	}
        	else if(n==4) {
        		System.out.println("Div:: "+(n1/n2));
        	}
        	else {
        		System.out.println("EXIT DONE::");
        		break;
        	}
        	
        
        	
        }
        		
	}

}

/*
 OUTPUT

Enter no1 for calc::
20
Enter no2 for calc::
10
MENU FOR CALCULATOR::
1.ADDITION
 2.SUBTRACTION
 3.MULT
 4.DIV
 5.EXIT
Enter ur choice for calc::
1
Add:: 30
MENU FOR CALCULATOR::
1.ADDITION
 2.SUBTRACTION
 3.MULT
 4.DIV
 5.EXIT
Enter ur choice for calc::
2
Sub :: 10
MENU FOR CALCULATOR::
1.ADDITION
 2.SUBTRACTION
 3.MULT
 4.DIV
 5.EXIT
Enter ur choice for calc::
3
Mul:: 200
MENU FOR CALCULATOR::
1.ADDITION
 2.SUBTRACTION
 3.MULT
 4.DIV
 5.EXIT
Enter ur choice for calc::
4
Div:: 2
MENU FOR CALCULATOR::
1.ADDITION
 2.SUBTRACTION
 3.MULT
 4.DIV
 5.EXIT
Enter ur choice for calc::
5
EXIT DONE:

 */
