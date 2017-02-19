

package com.wbl.assignments.FileHandling;

/*		
********************************************************************************************	 
		
 to check if the file exisits do the following - try with full path and just the filename .put the file
		under the project name inline with the src file
		
    System.out.println(new File("C:\\QA\\EclipseWorkspace\\JavaAssignments\\test").exists());
    System.out.println(new File("test.txt").exists());
	
	 File f=new File("test.txt");
	 System.out.println("file name is " + f.getAbsolutePath()); 
	 
	 or
	 
	 System.out.println(new File("test.txt").getAbsoluteFile());
	 
********************************************************************************************	 

*/


import java.io.BufferedReader;
import java.io.File;
//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile  {
	
	
//File Content :  dad mom dad daddy mommy pals pallavi pals pals pallavi aryan riva riva riva
	
	
	public void BufferReader() throws IOException, FileNotFoundException {
	
	BufferedReader in = new BufferedReader(new FileReader("test.txt"));	 

 	 	String line ;
 	 	String[] words;
		while((line = in.readLine()) != null)
		{
		    System.out.println(line);
   
		    words = line.split(" ");
	    
	    int i = 0;
	    
	    for(String s : words) {
	    	
	    	i++;
	    	
	    	System.out.println("The word is : " + s );
	    	
	    	
	    }
	   
		System.out.println("The total count of words in the file is : " + i); 
		
		 
	}
	in.close();
	
	
	}		

	
	public void ReadScanner() throws FileNotFoundException {
		
        Scanner scan = new Scanner(new File("test.txt"));
        int i = 0;
        
		System.out.println("\n\nThe words in the file are : \n " );
   
		while(scan.hasNext()){
			
		i++;	
		String s = scan.next();
		System.out.println(s);
		
		}
		
		System.out.println("\nThe wordcount in the file is  : " + i);
	
		scan.close();
	}
	

	public static void main(String[] args) throws FileNotFoundException, IOException {

		ReadFromFile rff = new ReadFromFile();
      
   //   rff.BufferReader();
     rff.ReadScanner();
	 
	}
}
