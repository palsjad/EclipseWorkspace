package com.wbl.assignments.Arrays;


//  Merge 2 given arrays

public class MergeArrays {

	public static void main(String[] args) {
 
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {0,6,7,8};
   
		int[]  mergedArray = new int[10];

		System.out.println("\n\nThe first array is -  {1,2,3,4,5} \n");
		System.out.println("The first array is -  {0,6,7,8} \n\n");

		int i , j = 0; 
		
		for (i = 0; i <= arr1.length-1; i++, j++) {
			
			mergedArray[j] = arr1[i];
		}
		
for (i = 0; i <= arr2.length-1; i++, j++) {
			
			mergedArray[j] = arr2[i];
		}

System.out.print("The Unsorted merged array is :  " );

for(j = 0; j <= mergedArray.length-1; j++) {
	System.out.print(mergedArray[j] + "  "   );
}


		
	}

}
