/*
  
Given array of Strings and comma separated string, return true if all array of strings and comma separated strings are same , 
else return false
eg:
input: {"test1","test2","test3"} , "test1,test2,test3"
output: true

input: {"test123","test2","test3"} , "test1,test2,test3"
output: false


*/

package com.wbl.JavaProblem;

public class CompareStringToArray {

	public static void main(String[] args) {
 
		
		String[] arr = {"test1","test2","test3"};
		String arr1 = "test1,test2,test3";
		
		String newStr = compareString(arr, arr1);
		
		
		if(newStr.equals(arr1)) {
			
			System.out.println ("true");
		}
			
			else {
				
				System.out.println ("false");

			}
		}
	 
	
	

	
	public static String compareString(String[] strArr, String str) {
		
		String temp = "";
		
		
		for(int i = 0; i < strArr.length; i++){
			
			temp = temp + strArr[i]  ;
			
			if(i != strArr.length-1) {
				
				temp = temp + ",";
			}
			 
			
		}
		
		System.out.println(temp);
		
		
		return temp;
		
	}
}
