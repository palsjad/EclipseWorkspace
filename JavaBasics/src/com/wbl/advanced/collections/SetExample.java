package com.wbl.advanced.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
	
	public void setBasics(){
		
		Set<String> s1 = new HashSet<String>();
	    	s1.add("pals");
 		   s1.add("sachin");
		   s1.add("aryan");
		   s1.add("riva");
		   s1.add("sugan");
		   s1.add("srikant");
		   s1.add("sanju");
		   s1.add("shreyu");
		   s1.add("shreyu");

		  for(String s : s1){
			  System.out.println(s);
		  }
	}
public void linkedHashSetBasics(){
		
		Set<String> s2 = new LinkedHashSet<String>();
	    	s2.add("pals");
 		   s2.add("sachin");
		   s2.add("aryan");
		   s2.add("riva");
		   s2.add("sugan");
		   s2.add("srikant");
		   s2.add("sanju");
		   s2.add("shreyu");
		   s2.add("shreyu");

		  for(String s : s2){
			  System.out.println(s); // follows the insertion order as it is linked
		  }
	}

  public void setHashCode() {
	
	Set<Student> stSet = new HashSet<Student>() ;
	
	Student stRec1 = new Student(1, "Pallavi");
	Student stRec2 = new Student(1, "Pallavi");
     stSet.add(stRec1);
     stSet.add(stRec2);
     
	 System.out.println(" stRec1 : " + stRec1.id + " " + stRec1.name );
	 System.out.println(" stRec2 : " + stRec2.id + " " + stRec2.name );

     if (stRec1 == stRec2){
    	 System.out.println(" == method : both the objects are same\n " );
     }
     else {
    	 System.out.println(" == method : both the objects are not same\n " );
     }
     
     if (stRec1.equals(stRec2)){
    	 System.out.println("equals method : both the objects are same\n " ); // after overriding the hashCode and equals method
	 }
    	 
     else {
    	 System.out.println("equals method : both the objects are not same\n " );  // before overriding the hasdCode and equals method

 
     }
	
	
	
	
}
	
	public static void main(String[] args) {
		
		SetExample se = new SetExample();
		
 	    se.setBasics();
		
//		SetExample se = new SetExample();
 	     	    
//		se.linkedHashSetBasics();
 	    
		se.setHashCode();
 
	}

}
