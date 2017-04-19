package com.wbl.advanced.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListExample {

	
	public void listBasics() {
		
//	List list1 = new ArrayList();	
//	list1.add(1);
//	list1.add('e');

//theabove is a generic type whichallows to storeanykind of data. But as list holds dataof thesame type
// declare itas follows.
		
		
List<String> list2 = new ArrayList<String>();	
	
list2.add("pals");
list2.add("sachin");
list2.add("aryan");
list2.add("riva");

for(int i= 0; i < list2.size() ; i++){
	System.out.println("the data in the list is : " + list2.get(i));
	
}

//another way to retrieve data from the list is

for (String f1 : list2) {
	
	System.out.println("another way to retreive data from the list using for loop is : " + f1);

}

//another way to retrieve data from the list is

Iterator<String> itr = list2.iterator();
while(itr.hasNext()){
	
	System.out.println("Printing contents of the list using Iterator : " + itr.next());
	
}
	

// create a list for integers
List<Integer> list3 = new ArrayList<Integer>();	


list3.add(20);
list3.add(30);
list3.add(40);
list3.add(50);

System.out.println("The size of the list before removing data is : " + list3.size());

 
// removing data by value

if(list3.contains(40)){
	System.out.println("The removed number by value is : " + list3.remove(new Integer(40)));
}
// removing data by index
System.out.println("The removed number by index is : " + list3.remove(1));

System.out.println("The size of the list after removing data is : " + list3.size());

List<Integer> list4 = new ArrayList<Integer>();	

list4.add(60);
list4.add(70);
list4.add(70);
list4.add(90);	

//now append theabove list to theprevious list

list3.addAll(list4);
System.out.println("The size of the list after appending thenew list is : " + list3.size());



}

 
   public void	vectorExample() {
	
	   
//	  Vector<String> vect = new Vector<String>(5, 2);	
 
//	   Vector<String> vect = new Vector<String>();	
 
	  Vector<String> vect = new Vector<String>();	
		
	   vect.add("pals");
	   System.out.println("theinitial capacity is : " + vect.capacity());
	   vect.add("sachin");
	   vect.add("aryan");
	   vect.add("riva");
	   vect.add("sugan");
	   vect.add("srikant");
	   vect.add("sanju");
	   vect.add("shreyu");
	   vect.add("hams");
	   System.out.println("the capacity after 9 records  is : " + vect.capacity());

	   vect.add("prabhu");
	   vect.add("rishi");
	   vect.add("varsha");
	   System.out.println("the capacity after 12 records  is : " + vect.capacity());
	   vect.add("sachin");
	   vect.add("aryan");
	   vect.add("riva");
	   vect.add("sugan");
	   vect.add("srikant");
	   vect.add("sanju");
	   vect.add("shreyu");
	   vect.add("hams");
	   vect.add("srikant");
	   vect.add("sanju");
	   vect.add("shreyu");
	   vect.add("hams");
	   System.out.println("the capacity atthe end of records  is : " + vect.capacity());
 
	    

}
   
   
   // forsorting anykindoflist
   
   public void sortList(){
	   
	   List<String> list3 = new ArrayList<String>();	
		
	   list3.add("sachin");
	   list3.add("pals");
	   list3.add("aryan");
	   list3.add("riva");

	   Collections.sort(list3);  // this sorts any kind of list
	   
	   for(int i= 0; i < list3.size() ; i++){
	   	System.out.println("the data in the list is : " + list3.get(i));
	   	
	   	
	   }
	   
   }
   
   
   public void sortListObject(){
   List<Student> stList = new ArrayList<Student>(); 
   
	Student  st1 = new Student(51442, "sachin");
	Student  st2= new Student(71543,"pals");
	Student  st3 = new Student(27876, "sach");
	Student  st4 = new Student(74571,"pallu");
	Student  st5 = new Student(95652, "sachya");
	
	
	stList.add(st1);
	stList.add(st2);
	stList.add(st3);
	stList.add(st4);
	stList.add(st5);
	
	Collections.sort(stList, new StudentComparator());
	
	for(Student std : stList) {
		System.out.println("the student id is : " + std.id + " and the name is : " + std.name);
		
		
//converting list to array and array to list
		
		Student[] stdArr = (Student[]) stList.toArray();
		List<Student> stdlist = Arrays.asList(stdArr);
		
	}
	
   }
   
   
   
	public static void main(String[] args) {
 
		ListExample le = new ListExample();
	//	le.listBasics();
		
	//	le.vectorExample();
	     
	//	le.sortList();
	
      le.sortListObject();
	
	}
	

}
