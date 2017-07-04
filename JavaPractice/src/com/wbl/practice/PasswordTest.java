/*
A password is considered strong if below conditions are all met:
1. It has at least 6 characters and at most 20 characters.
2. It must contain at least one lowercase letter, at least one uppercase letter, and at least one digit.
3. It must NOT contain three repeating characters in a row ("...aaa..." is weak, but "...aa...a..." is strong,
 assuming other conditions are met).
Write a function strongPasswordChecker(s), that takes a string as input, and return the MINIMUM change required 
to make s a strong password. If string is already strong, return 0.
Insertion, deletion or replace of any one character are all considered as one change.


*/

package com.wbl.practice;

public class PasswordTest {

	
static PasswordTest pt ;

	
	public  String strongPasswordChecker(String pwd) {
		
	String res = "";
	
	if(pwd.length()< 6 || pwd.length() > 20)	{
		
		System.out.println("\n\nThe entered password is : " + pwd);
		
		System.out.println("\n\ninvalid length of password. the password length has be between 6 - 20" );
		  res =  "invalid length of password. the password length has be between 6 - 20" ;
		  
		return res;
	}
	int upperCount = 0;
	int lowerCount = 0;
	int numCount = 0;
	
	for(int i = 0 ; i < pwd.length(); i++) {
		
		if(Character.isUpperCase(pwd.charAt(i))) {
			
			upperCount ++;

		}	
		
		else if(Character.isLowerCase(pwd.charAt(i))) {
			
			lowerCount++;
			
		}
		
		else if(Character.isDigit(pwd.charAt(i))) {
			
			numCount++;
			
			
		}
		
	}
	
	System.out.println("upper count : " + upperCount);
	System.out.println("lower count : " + lowerCount);
	System.out.println("number count : " + numCount);
	
	
	
	if (upperCount == pwd.length() || lowerCount == pwd.length() || numCount == pwd.length()) {
		
		res = "invalid entry. Pasaword should have atleast 1 upperCase letter, atleast 1 lowercaser letter and atleaast 1 digit";
		
		
	}
	
	else if (upperCount >= 1 && lowerCount >= 1 && numCount == 0) {
		
		  res =  pt.insertMethod(pwd, "number");
		
	}
	
	else if (upperCount >= 1 && lowerCount == 0 && numCount >= 1) {
		
		res =   pt.insertMethod(pwd, "lower");

	}
	else if (upperCount == 0 && lowerCount >= 1 && numCount >= 1) {
		
		res =    pt.insertMethod(pwd, "upper");

	}
		
/*
    else if (upperCount == 0 && lowerCount >= 0 && numCount >= 1) {
    	
    	res = "invalid password. It should also have atleast one uppercase and atleast one lowercase ";
		
	//	res =    pt.insertMethod(pwd, "upper");

	}
	
 else if (upperCount == 0 && lowerCount >= 1 && numCount >= 0) {
    	
    	res = "invalid password. It should also have atleast one uppercase and atleast one digit ";
		
	//	res =    pt.insertMethod(pwd, "upper");

	}
 else if (upperCount == 1 && lowerCount >= 0 && numCount >= 0) {
 	
 	res = "invalid password. It should also have atleast one lowercase and atleast one digit ";
		
	//	res =    pt.insertMethod(pwd, "upper");

	}
	*/
	
	System.out.println("the changed result is : " +  res);
	
	return res;
 
	}
	
	public String insertMethod(String pwd, String type) {
		
		String change = "";
		
	if( type.equals("number")) {
	 
		  change = pwd.replace(pwd.charAt(pwd.length()-1), '9');
 		
	}
	
	else if( type.equals("upper")) {
		
		char p = pwd.charAt(0);
 		 
		change = pwd.replace(pwd.charAt(0),  Character.toUpperCase(pwd.charAt(0)) );
				
		
	} 
	
	else if( type.equals("lower")) {
		
		char p = pwd.charAt(0);
 		 
		change = pwd.replace(pwd.charAt(0),  Character.toLowerCase(pwd.charAt(0)) );
		
	} 
	
	return change;
	
	}
	
	
	
	
	
	
	public static void main(String[] args) {
 		
//		String password = "pals20aaa";
		
		String password = "palswewe";
		
//		String password = "ASDFCVG";
		
//		String password = "1234567";  
		
//		String password = "abcderrf"; 
		
//		String password = "PALS20AAA";
		
	
	  pt = new PasswordTest() ;
		
		String result = pt.strongPasswordChecker(password);
		
		
		System.out.println("final result : " + result);
		
 
	}

}
