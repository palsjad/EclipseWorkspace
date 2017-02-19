package com.wbl.assignments.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
public class CopyFileToFile {

	public static void main(String[] args) {
		
System.out.println("\n\nCopying 'test.txt' to  'test3.txt' after creating it. \n");
System.out.println("Please delete test3.txt before running this program  \n");
System.out.println("and confrim that it gets created at the end of the program .\n");		
		
		
// reading from a file and storing it in a list 
	 
	BufferedReader br = null;
	
	try {
		br = new BufferedReader(new FileReader("test.txt"));
	} 
	
	catch (FileNotFoundException e2) {
 		e2.printStackTrace();
	}
	
	List<String> fileDetails = new ArrayList<String>();	
	String line = "";
	
	try {
		while((line = br.readLine()) != null){
		 
			fileDetails.add("\n" + line);	 //this adds the next line on a new line and does not concatenate the strings
		}
		
	 } 
	
    catch (IOException e1) {  
		
 		e1.printStackTrace();
	 }
	
	   finally {
		   try {
			   
			if (br.readLine() != null) {
				   br.close();
			   }
		} 
		   catch (IOException e) {
 			e.printStackTrace();
		}
		   
	   }
	 
	
// now writing into the a new file
	

    File f = new File("test3.txt");
    
    FileWriter fw = null;
	
	try {
		fw = new FileWriter(f);
		for(String s : fileDetails) {
		fw.write(s);
		}
		
	}	
	  catch (IOException e) {
 		e.printStackTrace();
	}
	finally {
		
		if (fw != null) {
			try {
				fw.flush();
				fw.close();
            } catch (IOException e) {
            	System.out.println("IO exception");
            }
             }   
		
 		}
		
	  
	    

     
     
	}

}
