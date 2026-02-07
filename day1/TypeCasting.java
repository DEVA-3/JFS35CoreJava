package com.version1;

public class TypeCasting {

	public static void main(String[] args) {
		
		int a = 10;
		
		double d = a; //Implicit converstion Small to Large Automatically by compiler
		
		System.out.println(d);
		
		double b = 5.343434343;
		
		short s = (short)b;//Epxlicit conversion Large to Small Type Casting Data Loss
		
		System.out.println(s);
		

	}

}
