

// Write a program  that accepts input from the command line and then prints them.


package com.wbl.assignments.Loops;

import java.util.Scanner;

public class ReadFromConsole {
	 
	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("What is your name ");
	    String name = scanner.next();
	    System.out.println("Your name is: " + name);
	    scanner.close();
	  }
	  
	}

 





