package com.wbl.advanced.collections;

//public class Student  // when using Comparator and comment the compareTo method 
public class Student implements Comparable<Student>{	
	public int id;
	public String name;
			
			public Student(int id, String name){
				
				this.id = id;
				this.name = name;
			}

			@Override
			public int compareTo(Student o1) {
				
			
				// if we want to sort by name then do the following
				
			return this.name.compareTo(o1.name);	
				
				// if we want to sort by the id in descending order then do the following 
			
			// for ascending  reverse the logicbetween this. and o1
				
		/*		int result = 0 ;
				
			if (o1.id > this.id) {   
					 result = 1;
					
				}
				else if  (o1.id < this.id) {
					 result = -1;
					
				}
				return result;
				
				
		*/		
						
		 }
			
	 	
			@Override
			public int hashCode() {
				
				return id * 7;
			}

			@Override
			public boolean equals(Object o1) {
				boolean isEqual = false;
				if(o1 instanceof Student &&  ((Student)o1).id == this.id &&  ((Student)o1).name == this.name){
					isEqual = true;
				}
				
				return isEqual;
			}
			
			
			
			 
		}

		
		
		

	 
