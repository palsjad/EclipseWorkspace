package com.wbl.advanced.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	
	public void mapBasics(){

	Map<Integer, String> mapSet = new HashMap<Integer,String>();
	mapSet.put(101, "Pallavi");
	mapSet.put(132241, "Sachin");
	mapSet.put(135531, "Aryan");
	mapSet.put(101, "Pallavi");
	mapSet.put(198363, "Hams");
	mapSet.put(123432, "Sugan");
	mapSet.put(134331, "Riva");

   
	//for(String s : s1){
 for(Map.Entry<Integer, String> mapRec : mapSet.entrySet()){
		 	System.out.println("Key: " + mapRec.getKey() + " : value : " + mapRec.getValue() );
		 	
	}
		
 
	}
	
	
	public void hashMapObject() {	
	// Hash map with object data type
		
 		Map<Student, Integer> mapObj = new HashMap<Student, Integer>();
 		Student  st1 = new Student(1,"pallavi");
 		Student  st2 = new Student(2, "sachin");
 		
 		mapObj.put(st1, 600);
 		mapObj.put(st2, 500);
 		
 	 Student key = new Student(1,"pallavi"); // we aretrying to create a new student object here with thesame data
 	 // as one of the records in the set assuming that the equals and hashCode method is not overwritten. Comment both the methods
 	 
 	 System.out.println("the key is : "+ mapObj.get(key));   // we get value = null when weexpect 600 whcih wehave forpallavi in the record
 	                                                                                                                      
 	 // So what will happen is a new Student obj will be created with 1, pallavi  and as it does not have any marks entered 
 	 // the return value  is null
 	 
 	 // npow uncomment the hashCode nad equals meethod andrunagain. You will get output as 600. 
 	 
 	
		
 }
	

	public void treeMapObject() {	
		
	 
		// Tree map with object data type
			
	 		Map<Student, Integer> mapObj1 = new TreeMap<Student, Integer>(new StudentComparator()); //when using the Comparator interface with 
	 		// studentComparator class
	 		
        //	Map<Student, Integer> mapObj1 = new TreeMap<Student, Integer>(); // whenusing thecomparable interfacewith student class
	 		Student  st1 = new Student(64454,"pallavi");
	 		Student  st2 = new Student(51442, "sachin");
	 		Student  st3 = new Student(71543,"pals");
	 		Student  st4 = new Student(27876, "sach");
	 		Student  st5 = new Student(74571,"pallu");
	 		Student  st6 = new Student(95652, "sachya");
	 		
	 		
	 		
	 		mapObj1.put(st1, 600);
	 		mapObj1.put(st2, 500);
	 		mapObj1.put(st3, 700);
	 		mapObj1.put(st4, 100);
	 		mapObj1.put(st5, 800);
	 		mapObj1.put(st6, 900);
	 		
	 		Set<Student> keys = mapObj1.keySet();
	 	 
	 		for(Student s : keys) {
	 	 System.out.println("the key is : "+ s.id + " the name is : " + s.name + " and the value is : " + mapObj1.get(s));
	 		} 
	}
	
	public void treeMapBasics(){

		Map<Integer, String> mapTree = new HashMap<Integer,String>();
		mapTree.put(101, "Pallavi");
		mapTree.put(132241, "Sachin");
		mapTree.put(135531, "Aryan");
		mapTree.put(101, "Pallavi");
		mapTree.put(198363, "Hams");
		mapTree.put(123432, "Sugan");
		mapTree.put(134331, "Riva");

	    
		Set<Integer> mapKey = mapTree.keySet();
		for(Integer key: mapKey)
			System.out.println("Key: " + key + " : value : " + mapTree.get(key));
	 }
		 
	 
		
	
	
 public static void main(String[]args){
	
	MapExample me = new MapExample();
 //	me.mapBasics();
//	me.treeMapBasics();
   me.hashMapObject();
//	me.treeMapObject();
}


}