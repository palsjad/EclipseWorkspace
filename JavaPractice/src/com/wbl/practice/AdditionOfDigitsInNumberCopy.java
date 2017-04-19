package com.wbl.practice;

public class AdditionOfDigitsInNumberCopy {
	
	public static void main (String args[] ) {
	int num = 345;
	
	String val = String.valueOf(num);
	
	int r = val.lastIndexOf(val);
	
	System.out.println(r);

	
	char[] c = val.toCharArray();
	
	String[] s = val.split("");
	
    int v = val.indexOf(3);
	
	System.out.println(v);
}
}