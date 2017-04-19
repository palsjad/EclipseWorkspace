package com.wbl.practice;

 
import java.util.Arrays;

 

public class PermutationCopy {
	


		public static void main(String[] args) {
			
			
			String str = "pals";
			
			char[] ch = str.toCharArray();
			char[] temp = new char[ch.length];
			char[] temp1 = new char[ch.length];
			
			char value = ' ';
			int j = 0;
			int num = 0;
			char res1 = 0;
			char res2 = 0;
			
			System.out.println(Arrays.toString(ch));
		 
		 	
	for(int i = 0 ; i < ch.length; i++) {
				
				num = i;    

		 		for(j=i, i = 0; i < ch.length-2; i++, j++) {
						 			 
					 temp[j] = ch[i];
	 				
				}
				  
		 		  res1 = ch[i];
		 		  res2 = ch[i+1];
		 		  temp[j] = res2;
		 		  temp[j+1] = res1;
		 		  
		 	System.out.println(Arrays.toString(temp));
		   
		 	break;
		 	 
		    
			}
			
		}       
		 

 
 

 

}
