
//  Write a program that defines an enum having months of the year and then prints the value of all the enum elements.




package com.wbl.assignments.AdditionalJavaAssignments;

 
public class EnumDemo {
	
	public enum Month {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
	
	
	Month mnth;	
	
		
	public 	EnumDemo(Month mnth){
		
	 this.mnth = mnth;
	}	
	
	public enum DaysOfTheWeek {
		MONDAY("THIS IS MONDAY"),
		TUESDAY("THIS IS TUESDAY"),
		WEDNESDAY("THIS IS WEDNESDAY"),
		THURSDAY("THIS IS THURSDAY"),
		FRIDAY("THIS IS FRIDAY"),
		SATURDAY("THIS IS SATURDAY"),
		SUNDAY("THIS IS SUNDAY");
	 

	 private String details;

	 DaysOfTheWeek(String details) {
	        this.details = details;
	
	    }
	 
	 
	 public String details() {
	        return details;
	    }
	 
	}  // closing brace for the enum 
	 
	
	public enum UserStatus {
	    PENDING,
	    ACTIVE,
	    INACTIVE,
	    DELETED;
	}
	
	public void printMonth() {
		
		switch (mnth) {
		
		case JANUARY :
			System.out.println("The month is January\n");
			break;
		
		case FEBRUARY :
			System.out.println("The month is FEBRUARY\n");
			break;
		
		case MARCH :
			System.out.println("The month is MARCH\n");
			break;
			
		case APRIL :
			System.out.println("The month is APRIL\n");
			break;	
			
		case MAY :
			System.out.println("The month is MAY\n");
			break;		
			
		case JUNE :
			System.out.println("The month is JUNE\n");
			break;
		case JULY :
			System.out.println("The month is JULY\n");
			break;
		case AUGUST :
			System.out.println("The month is AUGUST\n");
			break;
		case SEPTEMBER :
			System.out.println("The month is SEPTEMBER\n");
			break;
		case OCTOBER :
			System.out.println("The month is OCTOBER\n");
			break;
		case NOVEMBER :
			System.out.println("The month is NOVEMBER\n");
			break;
		case DECEMBER :
			System.out.println("The month is DECEMBER\n");
			break;
		
		}
	}

	public static void main(String[] args) {
 
	 	EnumDemo jan = new EnumDemo(Month.JANUARY);
		jan.printMonth();
		EnumDemo feb = new EnumDemo(Month.FEBRUARY);
		feb.printMonth();

		EnumDemo mar = new EnumDemo(Month.MARCH);
		mar.printMonth();
		
        EnumDemo apr = new EnumDemo(Month.APRIL);
		apr.printMonth();
		
        EnumDemo may = new EnumDemo(Month.MAY);
		may.printMonth();

		EnumDemo jun = new EnumDemo(Month.JUNE);
		jun.printMonth();

		EnumDemo jul = new EnumDemo(Month.JULY);
		jul.printMonth();

		EnumDemo aug = new EnumDemo(Month.AUGUST);
		aug.printMonth();

		EnumDemo sep = new EnumDemo(Month.SEPTEMBER);
		sep.printMonth();

		EnumDemo oct = new EnumDemo(Month.OCTOBER);
		oct.printMonth();

		EnumDemo nov = new EnumDemo(Month.NOVEMBER);
		nov.printMonth();

		EnumDemo dec = new EnumDemo(Month.DECEMBER);
		dec.printMonth();

 
		
	
//********************  another way to print the Enums ***************************************
		
		
		  for (Month mon : Month.values()) {
	            System.out.println(mon);
	        }
		
// ************************ To print Enums plus instance field **************************
		  
		  System.out.println(" \n\n"+ DaysOfTheWeek.TUESDAY.details);
		  
	        System.out.println(UserStatus.ACTIVE);

		  
		  
		  
		  
	}

}
