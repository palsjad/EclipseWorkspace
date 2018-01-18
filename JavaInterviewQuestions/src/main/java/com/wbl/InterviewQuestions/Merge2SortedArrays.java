package com.wbl.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Merge2SortedArrays {


	public void mergeArray(int[]num1, int[]num2) {

		List<Integer> finalArr = new ArrayList<Integer>();

 
		Boolean num1EOF = false;
		Boolean num2EOF = false;
		int i,j;

 
//		for(i = 0, j = 0, s = 0; s < sz; s++  ) {
			
			for(i = 0, j = 0 ;(!num1EOF && !num2EOF) ;   ) {


		 	System.out.println("num1 : " + num1[i] + " i : " + i);

			System.out.println("num2 : " + num2[j] + " j : " + j);
 
			 
	//		if(!num1EOF && !num2EOF && (num1[i] < num2[j] )) {     
			
			if(num1[i] < num2[j] ) {     
					
				finalArr.add(num1[i]);
                i++;
				if(i > num1.length - 1) {
					num1EOF = true;
					break;
					
				}
	 
			}
			else {
				System.out.println("entered num2" );

				finalArr.add(num2[j]);
				
				j++;
				
				if(j > num2.length - 1) {
	 				num2EOF = true;					 
					break;
				}

		 
			}


		}

		while (j < num2.length) {

			finalArr.add(num2[j]);
			j++;
			
		}

		System.out.println("final i : " + i);
		while (i < num1.length) {

			finalArr.add(num1[i]);
			i++;
		}

		System.out.println("final arr : " + finalArr.toString());
		
	}
	
	

	public static void main(String[] args) {

		int[] arr1 = { 2,3,5,6,8,10,22,22};

		int[] arr2 = {1,4,5,7,9,11,15,17,19,22};

		Merge2SortedArrays msa = new Merge2SortedArrays();		
		msa.mergeArray(arr1, arr2); 
	}

}
