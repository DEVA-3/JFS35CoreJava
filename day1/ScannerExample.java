package com.version1;

import java.util.Scanner;

public class ScannerExample{
	public static void main(String[] args) {
		
	
	Scanner obj = new Scanner(System.in);
	
	System.out.println("Enter Byte Value:");
	byte a = obj.nextByte();
	
	System.out.println("Enter Short  Value:");
	short b = obj.nextShort();
	
	System.out.println("Enter Int Value:");
	int c = obj.nextInt();
	
	System.out.println("Enter Long Value:");
	long d = obj.nextLong();
	
	System.out.println("Enter Float Value:");
	float f = obj.nextFloat();
	
	System.out.println("Enter Double Value:");
	double e = obj.nextDouble();
	
	System.out.println("Enter Boolean Value:");
	boolean m = obj.nextBoolean();
	
	System.out.println("Enter String Value:");
	String h = obj.next();
	
	System.out.println(a+" "+b+" "+c+" "+d+" "+f+" "+e+" "+m+" "+h+" ");
	
	
	
	
	}
}
