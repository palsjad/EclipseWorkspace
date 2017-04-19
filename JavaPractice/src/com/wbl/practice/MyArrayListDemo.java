package com.wbl.practice;

public class MyArrayListDemo {

	Integer num = 0;
	Object obj = null;
//	Object[] myArray;
	public static Integer[] myArray = new Integer[10];
	public int count = 0;
	
	public void add(Integer x){
		
	myArray[count]	= x;
 
	count++;	
	
	}
	
	public int size(){
		
	return count;	
		
	}
	
	public Integer get(int y) {
 	 	return   myArray[y];
	}
	
	public Integer[] remove(MyArrayListDemo mal,Integer[] myArr, int x) {
		System.out.println("  The element to be removed is at index : " + x + "  \n");
		
 		if ( x > (myArr.length)) {
			System.out.println("  Invalid Input. Number entered is greater than array size\n");
			return myArr;
		}
				 
			
//		   int oldSize = myArr.length;
//		  Integer[] newArray = new Integer[oldSize];
		   
           Integer[] newArray = new Integer[10];
			
		   for(int i = 0, j = 0; i <= myArr.length-1 ; i++){
			   
				if(i != x) {
					
				newArray[j] = myArr[i];       // creating a new array and copying the old array into it
 				j++;
				}
			}
			System.out.println(" The record is removed \n\n " );

            return newArray;
		}
		

	 
	 
	
	
	public static void main(String[] args) {
 		MyArrayListDemo mal = new MyArrayListDemo();
 
		mal.add(2);
		mal.add(4);
		mal.add(1);
		mal.add(6);
		mal.add(9);
		mal.add(8);
		mal.add(7);
		mal.add(5);
		mal.add(5);
		
		
		System.out.println("\n Result of get method to get the 2nd element in the array : " + mal.get(1) + "  \n");
		System.out.println("\n Result of size method  : " + mal.size() + " \n");
		myArray = mal.remove(mal,myArray,3);  // enter the index number to be deleted
		
		// to print the new array 
		
		System.out.println(" The new array  is as follows \n");
		for(int i = 0 ; i < myArray.length-1; i++) {
			
			System.out.print(myArray[i] + " ");
			
		}
 
	}

}
