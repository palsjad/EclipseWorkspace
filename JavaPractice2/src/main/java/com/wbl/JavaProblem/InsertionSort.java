package com.wbl.JavaProblem;

public class InsertionSort {

	public static void main(String[] args) {
 
		
		int[] arrNum = {12, 11, 13, 5, 6};
		
//		5, 12 ,13,11,6
		
		int val = 0;

		for(int i = 0; i < arrNum.length; i++) {
			
			val = arrNum[i];
			
			if(val < arrNum[i+1]) {
		
        insertionSort(arrNum, i);
        
			}
		}
		
	}
	
	
	public static void insertionSort(int[] arr, int i) {
		
		int temp = 0;
		
		
		for(int j = 0; j < i ; j++ ) {
			
			if( arr[i] < arr[j]) {
				
				temp = arr[j];
				
				
			}
			
			
		}
		
		
		
		
	}

}
