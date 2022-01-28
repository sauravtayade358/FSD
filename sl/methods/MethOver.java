package com.sl.methods;

public class MethOver {

	int add(int a,int b) {
		return a+b;
		}

	float add(float a,float b) {
		return a+b;
		}

	double add(double  a,double b) {
		return a+b;
		}
	
	
	public static void main(String[] args) {
		MethOver obj=new MethOver();
		System.out.println("ADD 2 INT::"+obj.add(5,7));
		System.out.println("ADD 2 FLOAT::"+obj.add(6.0f,7.0f));
		System.out.println("ADD 2 DOUBLE::"+obj.add(5.55,7.99));
		
	}
}
