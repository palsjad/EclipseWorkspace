package com.wbl.advanced.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	
	public void queueBasics(){
		
		
	//this gives the natural asc order of the datainthequeue
		
// Queue<String> que = new PriorityQueue<String>();


//for giving our own  queue we can add the Comparator overloaded constructor 

   	MyPriorityComparator mcm = new MyPriorityComparator();
    Queue<String> que = new PriorityQueue<String>(mcm);
   	
 // theabove 2stmts can also be written as
 // Queue<String> que = new PriorityQueue<String>(new MyPriorityComparator());   

    que.add("java");
	que.add("html");
	que.add("css");
	que.add("webdriver");
	que.add("jenkins");
	
	Iterator<String> itr = que.iterator();	
	
	while(itr.hasNext()) {
		
		System.out.println("The queue is : " + que.poll());
	}	  
    
  // use this for the object queue
    
    StudentComparator mcm1 = new StudentComparator();
    Queue<Student> que1 = new PriorityQueue<Student>(mcm1);
	
 		Student  st1 = new Student(64454,"pallavi");
  		Student  st2 = new Student(51442, "sachin");
  		Student  st3 = new Student(71543,"pals");
  		Student  st4 = new Student(27876, "sach");
   		Student  st5 = new Student(74571,"pallu");
 		Student  st6 = new Student(95652, "sachya");
    
	 
    
  		
 			
		que1.add(st1);
		que1.add(st2);
		que1.add(st3);
		que1.add(st4);
		que1.add(st5);
		que1.add(st6);

	 	
		
		Iterator<Student> itr1 = que1.iterator();	
		
		while(itr1.hasNext()) {
			
	//		System.out.println("The queue is : " + que1.poll().id + "  and the name is : " + que1.poll().name);
			System.out.println("The queue is : " + itr1.next().id + "    " + itr1.next().name);	
		
	}
	
	
	}
	

	public static void main(String[] args) {

		
		 QueueExample pq = new  QueueExample();
		 pq.queueBasics();
	}

}
