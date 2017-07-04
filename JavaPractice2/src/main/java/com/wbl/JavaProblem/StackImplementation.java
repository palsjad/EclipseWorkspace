package com.wbl.JavaProblem;

import java.util.ArrayList;
import java.util.List;

public class StackImplementation {
	
	// do it with an fixed size array
	
	List<Integer> arr = new ArrayList<Integer>();
	
	int lastIndex = 0;

	int sz = -1;

	
	public static void main(String args[] ) {
		

		StackImplementation si = new StackImplementation();
		
		si.manageStack();
		
		
	
		}

	public void manageStack() {
		
		sz =  pushNum(2);
		sz =  pushNum(4);
		sz = pushNum(5);
		sz =  pushNum(7);
		sz =  pushNum(8);

		popNum();
		popNum();

		
	}
	
	
		public int  pushNum( int num1) {


		arr.add(num1);
		sz++;
        System.out.println("size of the array : " + sz);

		return sz;

		}

		public void popNum() {

		int temp = arr.size();


		arr.remove(temp-1);

        System.out.println("the array after popping the element : " + arr);
        
        
		}

}
