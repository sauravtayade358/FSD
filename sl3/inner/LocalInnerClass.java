package com.sl.inner;

public class LocalInnerClass {
	
	public void check(int age)
	{
		if(age>18)
		{
			class Inner{
				
				void vali() {
					
					System.out.println("available for voting");
				}
			}
				Inner inner=new Inner();
				inner.vali();
			
		}
		else
		{
			System.out.println("NOt");
			
		}
		
	}

	public static void main(String[] args) {
		LocalInnerClass outer =new LocalInnerClass();
		outer.check(22);
		
	}

}
