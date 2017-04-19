package com.wbl.basics.oops;


public class BooksDemo {
	public static void main(String[] args) {
		
	  Books bk1 = new Books();
	  bk1.bookTitle = "Harry Potter And The Cursed Child" ;
	  bk1.bookAuthor = "J.K. Rowling";
	  bk1.bookId = 101;
	  bk1.bookPrice = 20.75;

	  bk1.setPrice(25.75);
	  bk1.bookDescp = " The Book about Harry Potter";
	  bk1.getCondition("New");
		
	  bk1.booksDetails();	
	   
	}

}
