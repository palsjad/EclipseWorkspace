package com.wbl.assignments.FileHandling;

import java.io.File;
import java.util.Scanner;

public class ListFilesInFolder {
	

public static void main(String[] args) {
		
	ListFilesInFolder lff = new ListFilesInFolder();
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("\n\nEnter the Directory / Folder name. For eg (copy - paste ) -   C:\\QA\\EclipseWorkspace\\JavaAssignments \n");
	String input = scanner.next(); 
	scanner.close();
    lff.printFiles(input);


	}
		
		public void printFiles(String name) {
		
//		String directory = name;
//		File fl = new File("C:\\QA\\EclipseWorkspace\\JavaAssignments");
		
		File fl = new File(name);
	
        System.out.println(fl.exists());
               
        File[] list1 =  fl.listFiles();
   
        System.out.println(" The number of files in the directory : " +  + list1.length + " \n\n");
        
  //      for(File f : list1) {
          
        for(int i = 0; i < list1.length; i++) {
        	
        	if(list1[i].isFile() ){
        		 System.out.println("File : " + list1[i]);
        		 
        	}
        	else if(list1[i].isDirectory() ){
       		 System.out.println("Directory : " + list1[i]);

        	}
        		
        	
        	
        	
    /*    for(File f : list1) {	
     
              if(list1[i].isFile() ){
        		 System.out.println("File : " + f);
        		 
            	}
                 else if(list1[i].isDirectory() ){
       		 	 System.out.println("Directory : " + f);

        } 
        
          */
	}
        
}
		
 }		
 
	
 	
	
