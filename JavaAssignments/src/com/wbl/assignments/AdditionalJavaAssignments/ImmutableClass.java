


//  Write an Immutable class  - First Method

// Here I have made the constructor private so the sub classes cannot create a new  instance
// and the instance variables are final so it cannot be changed.



package com.wbl.assignments.AdditionalJavaAssignments;


public final class ImmutableClass {

		
		  private final Integer custId;
		  private final String custName;
		  
		
		private  ImmutableClass (Integer id, String nm)
		    {
		       this.custId = id;
		       this.custName = nm;
		      System.out.println("inside constructor : " + this.custId + " " + this.custName); 
		    }
		
 		   
		  
		  @Override
		    public String toString() {
		        return custId + " " +  custName +  " ";
		    }
		
		  
		  public static  ImmutableClass  createNewInstance(Integer id, String nm)
		    {
		      return new ImmutableClass(id, nm);
		    }
		
		 	
		  
		  
		  
		public Integer getCustId() {
			return custId;
		}


		public String getCustName() {
			return custName;
		}
	

		// cannot reassign new values directly as the instance variables are final 
 	/*	
		public void updateCust(Integer uId, String uNm){
			  custId = uId;
			  custName = uNm;
			  
		}  */
		
		

		public void updateCust(Integer custId, String custName){
			  custId = 125;
			  custName = "Riva";
			  
		}	 	
	 	
	
		 
		public static void main(String[] args) {
			
// tow ways to create a new instance of the class			
		 
	 	ImmutableClass  icd = new ImmutableClass(123,"Pallavi");
	 	
//		ImmutableClass  icd =  ImmutableClass.createNewInstance(123,"Pallavi");

	 	
	 	
//		 	icd.updateCust(125,"Riva");   
	 	
		 System.out.println("Before changes : " + icd);

		
	 	
	 	icd.updateCust(icd.getCustId(), icd.getCustName());
	 	
		


		 System.out.println("After changes : " + icd + "  \n");
		 
		 System.out.println("changes cannot be made \n");
		 
		 
			}
	
	
	 
	

}
