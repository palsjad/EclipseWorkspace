package com.wbl.basics.oops;

public class Books {
	public String bookTitle;
	public String bookAuthor;
	public int    bookId;
	public double bookPrice;
	public String bookDescp;
	public String bookCondition;
	
	

    public void booksDetails() {
    	System.out.println(" The title of the book is : " + bookTitle);
    	System.out.println(" The author of the book is : " + bookAuthor);
    	System.out.println(" The book Id of the book is : " + bookId);
    	System.out.println(" The price of the book is : " + bookPrice);
    	System.out.println(" The description of the book is : " + bookDescp); 	

    	
    	
      }
    
    public void setPrice(double price) {
    	bookPrice = price;
    	
    }
    
    public void getCondition(String condition) {
    	bookCondition = condition;
    	
    }
    
    
    
    
    /*	public int booksSold() {
	System.out.println("the number of books sold are : " );
	return totalPrints;
	
}

public void booksPrinted() {
	System.out.println("The number of books printed in the year of 2016 : " );
}

*/
    
    
    
}
