
//  Write  a program to search for a string in a file and then return 
//  the count of number of occurrences of the string.


package com.wbl.assignments.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



public class StringSearchAndReplace {

 	
public static void main(String[] args) throws IOException {
	
	System.out.println("\n\nBefore running this program ensure that you change the word 'gals' back to 'pals' in the 'test.txt'\n\n");

	File file = new File("test.txt");
	
	Scanner scan = new Scanner(file);

	StringSearchAndReplace so = new StringSearchAndReplace();
	

//	ArrayList<String> words;
	
//	words = so.scanFile(scan);
 
//	so.findString(scan);
	
// so.stringReplace(scan);
		
	scan.close();
	
	so.stringRepl();
	
 
	}	
		
 	
  public ArrayList<String> scanFile(Scanner scan) {	
		
		
	    String sentence = null;
			
 		ArrayList<String> wordlist= new ArrayList<String>();
		
	
		while (scan.hasNextLine()){
	
		 sentence = scan.nextLine();
		 wordlist.add(sentence);
		 
		 System.out.println("\n\nThe scanned sentence is : " + wordlist.get(0));
	
		  
		}
 		return wordlist;
		 
		
	}
	
 	
	public void findString(Scanner scan) {
		
 	ArrayList<String> wordlist = new ArrayList<String>();
	 
		
		String[] word = new String[50];
		
		wordlist= scanFile(scan);
	     
		for(String s : wordlist) {
		 	word = s.split(" ") ;
			
//			System.out.println("first word in the word array " + word[0] + "  " + word[5]); 
		}
		 

		int count = 0;
		int i = 0; 
		
		String findStr  = "dad";
		
		for(i = 0 ; i <= word.length-1; i++){
	//		System.out.println("the word is : " + word[i] + "   findStr " + findStr );
			
			if(word[i].equalsIgnoreCase(findStr ) ) {
				
		 
	//		  System.out.println("inside split for loop " ); 
		
			  count++;
				
			}
			 

		}
		 
	
		
		System.out.println("\n\nThe total count of the given String  " + findStr  + "  in the file is : " + count+"\n\n");

 
	}

	
	public void stringReplace1(Scanner scan) {
	
	//	StringBuilder sb = new StringBuilder();
		
 
 
 System.out.println("inside stringreplace");
	   
	while (scan.hasNextLine()){
		//scan.nextLine(); 
	 	scan.findInLine("pals").replaceAll("pals", "gals");
	    System.out.println("inside while loop");
			 
	  /*  wordlt.add(sentence);
			 
			 System.out.println("\n\nThe scanned sentence is : " + wordlt.get(0));
			  */
			} 
		 
		 

		}
	
	
	
	public void stringRepl() throws IOException {
		
		 File log = new File("test.txt");
		 String temp = null;
	 	 String temp1 = null;
	     ArrayList<String> tempFinal = new ArrayList<String>();
	     FileReader fr = new FileReader(log);
		 String s;
         
       try (BufferedReader br = new BufferedReader(fr)) {
      
 //   System.out.println("before while" + br.read());  //reads a single character
        	 
       while ((s = br.readLine()) != null) {
  //          System.out.println("inside while");
       
        	System.out.println("Before replacing  :  " + s + " \n");
         	temp = s.replaceAll("pals", "gals");
  //       	System.out.println("temp String after replacing " + temp);

          	tempFinal.add(temp);
 //           System.out.println("after : " + tempFinal.get(0));
          	 
             }
             
            System.out.println("\nafter replacing  :  " + tempFinal.get(0) + "\n");
            System.out.println("after replacing  :  " + tempFinal.get(1) + "\n");

        	temp = tempFinal.get(0);
            temp1 = tempFinal.get(1);
        	 
	        br.close();
	        
	        
	//  To write the changes made back in "test.txt" which is stored in the 'log' variable       
	        
	        FileWriter fw = new FileWriter(log);
	        fw.write(temp);
	        fw.write("\n");
	        fw.write(temp1);
	        fw.flush(); 
	        fw.close();
	              
	      // to create another output file and write to it 
	              
	        PrintWriter pw=new PrintWriter("test2.txt");
	        BufferedWriter bw = new BufferedWriter(pw);
	        bw.write(temp);
	        bw.write("\n");
	        bw.write(temp1); 
	        bw.flush();    
	        bw.close();
	    System.out.println("\nOpen the 'test.txt' and the newly created file 'test2.txt' to confirm that the changes have been made \n");    
             }
       
         catch (IOException e) {
 			e.printStackTrace();
 		}
         
         }
}


	
 
