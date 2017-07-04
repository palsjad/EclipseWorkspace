/*

write a program to merge and sort 2 arrays without duplicates
eg : arr1={2,5,1,10}  arr2={4,3,5,10}
o/p: {1,2,3,4,5,10}

 */

package com.wbl.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoArrays {
	
	
	
	public static void main(String args[] ) {
		
		MergeTwoArrays mta = new MergeTwoArrays();
		
		mta.mergeMethod();
		
		
		
		
	}
	
	public static List<Integer> checkForDuplicates(List<Integer> res, int num) {
		
		int flag = 0;
		
        for (int i = 0 ; i < res.size(); i++) {
        	
        	
        	if(res.isEmpty()) {
    			
        		System.out.println("The array listis empty\n");
        		
    			break;
    		}
        	
        	
        	

            if (res.get(i).equals(num)){
        		 
         		System.out.println("The array list already has the number : " + num);
         		
                flag = 1;
                
        		break; 
        	 }
        	
         	else if (! res.get(i).equals(num)){
        	
         		flag = 0;
         	
        }
 		
	}
        
        if (flag == 0) {
        	
        	res.add(num);
        	
        	System.out.println("The number is added to the list\n");
        }
        
        return res;
	
	}	
	
	 
	public void mergeMethod() {
		
		int[] arr1 = {2,5,1,2,10} ;
		int[] arr2 = {4,3,5,10};
		
		 
		
        List<Integer> result = new ArrayList<Integer>();
        
        
        for (int i = 0 ; i < arr1.length; i++) {
        	
        	result =   checkForDuplicates(result,arr1[i]);
        	
        }
        
        for (int i = 0 ; i < arr2.length; i++) {

        	result =   checkForDuplicates(result,arr2[i]);

         	
        }
        
         	
        	System.out.println("\n\nthe result without duplicates is : " + result.toString());
      
	//	result = sortList(result);
		
		Collections.sort(result);
		
		System.out.println("\n\nthe final sorted result is : " + result.toString());
		
	}

}
