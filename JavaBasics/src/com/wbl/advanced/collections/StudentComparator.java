package com.wbl.advanced.collections;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// if we want to sort by name then do the following
		
	//	return o1.name.compareTo(o1.name);	
		
		int result = 0 ;
		 result = o1.name.compareTo(o2.name);
//			System.out.println("inide the comparator.o1 thei id is : " + o1.id + "  and the name is : " + o1.name);
	
		if (result == -1){
			result= 1;
		}
			
		else 
			if (result ==  1){
				result= -1;
			}
			 return result;
	}
	
}
