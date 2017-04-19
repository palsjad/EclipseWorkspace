package com.wbl.advanced.collections;

import java.util.Comparator;

public class MyPriorityComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// if we want to sort by name then do the following
		
		int result = o1.compareTo(o2);
				
				if (result == 1) {
				result = -1;
				}
				else if  (result == -1) {
					result = 1;
					}			
		
		return result;	
				
			 
	}
	
	 

	

	 
}
