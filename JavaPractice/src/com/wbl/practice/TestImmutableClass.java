package com.wbl.practice;

public final class TestImmutableClass {
	
 	 
		    private final String[] array;
		 
		 
		 
		    public TestImmutableClass(String[] arr){
		 
		//        this.array = arr; // wrong
		        this.array = arr.clone(); 
		    }
		 
		
		    public String toString() {
		 
		        StringBuffer sb = new StringBuffer("Characters in array are: ");
		 
		        for (int i = 0; i < array.length; i++) {
		 
		            sb.append(array[i] + " ");
		 
		        }
		 
		        return sb.toString();
		 
		    }
	 
		 
		 
		    public static void main(String[] args) {
		 
		        String[] array = {"a","b"};
		 
		        TestImmutableClass immutableClass = new TestImmutableClass(array) ;
		 
		        System.out.println("Before constructing " + immutableClass);
		
		        array[1] = "c"; // change (i.e. mutate) the element
		 
		        System.out.println("After constructing " + immutableClass);
		   }

	}

 
