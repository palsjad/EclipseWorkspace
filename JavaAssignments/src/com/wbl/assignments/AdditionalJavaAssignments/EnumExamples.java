
//  Write a program that defines an enum having months of the year and then prints the value of all the enum elements.




package com.wbl.assignments.AdditionalJavaAssignments;

 
public class EnumExamples {
	
	public enum Month {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

// *********************First Enum Example*************************
	

	public enum UserStatus {
	    PENDING,
	    ACTIVE,
	    INACTIVE,
	    DELETED;
	}
	
	
// *********************Second Enum Example*************************
	
	
	
	Month mnth;	
	
		
	public 	EnumExamples(Month mnth){
		
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
	 
// *********************Third Enum Example*************************
	
	public enum Operation {
	    PLUS,
	    MINUS,
	    TIMES,
	    DIVIDE;

	    double calculate(double x, double y) {
	        switch (this) {
	            case PLUS:
	                return x + y;
	            case MINUS:
	                return x - y;
	            case TIMES:
	                return x * y;
	            case DIVIDE:
	                return x / y;
	            default:
	                throw new AssertionError("Unknown operations " + this);
	        }
	    }

	}
	
// *******************************************************************
	
	
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
		
// *********************************To print the First Enum - UserStatus ***********************************		
		
        System.out.println(UserStatus.ACTIVE);	
		
//******************** First way to print the  Second DaysOfTheWeek  Enum *********************************** 
		
 
        EnumExamples jan = new EnumExamples(Month.JANUARY);
		jan.printMonth();
		EnumExamples feb = new EnumExamples(Month.FEBRUARY);
		feb.printMonth();

		EnumExamples mar = new EnumExamples(Month.MARCH);
		mar.printMonth();
		
		EnumExamples apr = new EnumExamples(Month.APRIL);
		apr.printMonth();
		
		EnumExamples may = new EnumExamples(Month.MAY);
		may.printMonth();

		EnumExamples jun = new EnumExamples(Month.JUNE);
		jun.printMonth();

		EnumExamples jul = new EnumExamples(Month.JULY);
		jul.printMonth();

		EnumExamples aug = new EnumExamples(Month.AUGUST);
		aug.printMonth();

		EnumExamples sep = new EnumExamples(Month.SEPTEMBER);
		sep.printMonth();

		EnumExamples oct = new EnumExamples(Month.OCTOBER);
		oct.printMonth();

		EnumExamples nov = new EnumExamples(Month.NOVEMBER);
		nov.printMonth();

		EnumExamples dec = new EnumExamples(Month.DECEMBER);
		dec.printMonth();

 
		
	
//******************** Another way to print the  Second DaysOfTheWeek  Enum ***************************************
		
		
		  for (Month mon : Month.values()) {
	            System.out.println(mon);
	        }
		  
		  
//******************** First way to print the  Second DaysOfTheWeek  Enum plus instance field **********************
		
 		  
		  System.out.println(" \n\n"+ DaysOfTheWeek.TUESDAY.details);
		  

// **************************************To print the Operation Enums***********************************************		
		  
		  
	        double result = Operation.PLUS.calculate(1, 2);
	        System.out.println(result); //3.0
 
		  
		  
	}

}
