package com.wbl.JavaProblem;

import java.util.Arrays;

public class FirstOccurenceOfDuplicateNumInArray {


	public static void main(String[] args) {

		//	int[] a = {5,9,11,2,4,5,2,5};

		//	int[] a = {5,9,11,2,4,3,1,0};

		int[] a = {8, 4, 6, -4, -6, 4, 6, 9, 5, 8};


		System.out.println("The number for which the second occurrence has a smaller index is : " + firstDuplicate(a));

	}



	public static int firstDuplicate(int[] a) 
	{
		System.out.println("enter the method");

		int[] tempArr = new int[a.length];
		
		System.out.println("temp array length is : " + tempArr.length);


		for( int i = 0; i < a.length; i++) {
			tempArr[i] = 0;
		}
		

		int temp =0 ;

		int returnNum = 0, returnIndex = a.length+1;
		
 

		for (int i = 0; i < a.length;i++ ) {    //{2,5,9,11,2,4,5,2,5}

	 		if ( a[i] < 0)  
				
	 			temp = Math.abs(a[i]);
			  
		 
			 	else temp = a[i];
			 
			 
	    	System.out.println("temp  value is : " + temp);

			System.out.println("i value is : " + i);
			


			for(int j = i ; j < a.length; j++) {
				
				System.out.println("j  value is : " + j);
			 	System.out.println("tempArr value is : " + tempArr[j]);

				if(j != i && Math.abs(a[j]) == temp && tempArr[j] == 0) {

					if(j < returnIndex ) {

						returnNum = temp;  // 2

						returnIndex = j;	// 4	
						
		
						tempArr[j] = 1;

						j = a.length;
						
						System.out.println("j value is : " + j);

					}  // end of second if 


				}  // end of first if 



			} // end of second for loop



		}  // end of first for loop 


		System.out.println("The temp arr values are : " + Arrays.toString(tempArr));

		if (returnIndex == a.length+1) {
			return -1 ;

		}


		return returnNum;


	}


}


