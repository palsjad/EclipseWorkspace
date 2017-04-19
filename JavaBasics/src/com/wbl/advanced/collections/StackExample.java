package com.wbl.advanced.collections;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
	
	public static void main(String[]  args) {
		
		
	Stack<Integer> stk = new Stack<Integer>();
	stk.push(56);
	stk.push(3546);
	stk.push(345);
	stk.push(1211);
	stk.push(9343);
	stk.push(7754);
		
	
	Iterator<Integer> it = stk.iterator();
	
	Iterator<Integer> it1 = stk.iterator();
	
	
	while(it1.hasNext()) {
		System.out.println("the number in insertion order : " + it1.next());
		}
		 

	while(it.hasNext()) {
		System.out.println("the number in LIFO order- when we use pop method : " + stk.pop() );
	}
	
	}
}

	 
