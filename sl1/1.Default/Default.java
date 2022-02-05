class defaccessSpecifier
	
	{ 
	  void show() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
	} 

public class Default {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defaccessSpecifier object1 = new defaccessSpecifier(); 		  
        object1.show(); 

	}
}

