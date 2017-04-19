package com.wbl.practice;

public class FirstDuplicateChar {

	public static void main(String[] args) {
		
  
//		String name = "pallavi";
//		String name = "Riva";		
//   	String name = "sachin";
		
 	String name = "aryan";
		
 
		
		char[] nmArr = name.toCharArray();
//		int j = 0; 
//		char ch = nmArr[0];
        char ch;
		int flag = 0;
	for(int j = 0; j <= name.length()-1; j++)	{
		
		 if (flag == 1){
			 break;
		 }
		 ch = nmArr[j];

		for (int i = j + 1 ; i <= name.length()-1; i++){
			
 			 if(ch == nmArr[i]){
 				 System.out.println("The first duplicate character in the string is : " + ch + " at the index of : " + i);
 				 flag = 1;
 				 break;
 			 }
 			 
 			 
			
		} // end of second for loop 
	 
	} // end of first for loop 
	
	 if (flag == 0) {
		 
		System.out.println("\n\nThere is no duplicate character in the string \n" );  
	 }
	
	}   // end of main 

}
