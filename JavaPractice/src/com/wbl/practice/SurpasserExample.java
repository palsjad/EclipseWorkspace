package com.wbl.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SurpasserExample {
	

public static void main(String args[]) {

int[] arr = {3,4,1,6,38,5,7};
int  i,j;
int val;
int count = 0;

int[] finalArr = new int[7];

for ( i = 0; i < arr.length; i++) {
        j = i;  
for(val = arr[i] ; j < arr.length; j++) {
	if ( val < arr[j] ) {
    count++;
     
    }
	 

}
 finalArr[i] = count;
  count = 0;
}

System.out.println("The final array with the count is : " + Arrays.toString(finalArr));
	
 
}

}
