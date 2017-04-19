package com.wbl.advanced.StringBasics;

public class StringDemo {
	
	public void printString() {
		
		String str = "hello";
		String str1 = "world";
		String str2 = "world";
		
		str.concat(str1);  // this stmt alone does notchange the string as stringby itself is immutable..unless
		//we assgin the changed value to a reference variable it will just stay inthe heap memory.
		
		String str3 = str.concat(str1);
  
		System.out.println("str : " + str);												
		System.out.println("str1 : " + str1);		
		System.out.println("str3 : " + str3);	
		
		if (str1 == str2) {
			System.out.println(" The strings are same");
		}
		else {
			System.out.println(" The strings are not same");
		}
			
		
// now try creating string object and compare the strings
		
	
	String s1 = new String("pals");
	String s2 = new String("pals");
	
	if (s1 == s2) { // this compares the references / address of the heapmemory where the str is stored 
                    // so they are not same
		System.out.println("The strings objects are same");
	}
	else {
		System.out.println("The strings objects not same");
	}
		
	if (s1.equals(s2)) {
		System.out.println("The strings objects are same when we use equals method as we compare theactual data");
	}
	else {
		System.out.println("The strings objects not same");
	}
		
	}
	
	 public void stringMethods(){
		 
		String name = "pallavi jadhav" ;
		char[] charName = name.toCharArray();
		
//		for(int i=0;i< charName.length; i++) {
//			System.out.println("print the characters inthename : " + charName[i]);
//	
		
// another way to write the aboveforloop is
		
		for(char ch : charName) {
			System.out.println("print the characters inthename : " + ch );
			
		}
		
 
		
		System.out.println("print the length ofthe charName : " + charName.length);
	//	System.out.println("print the substring in the charName : " +  charName.substring(0,3));

        System.out.println("print the substring in the name : " +  name.substring(0,3));
        System.out.println("print the  name : " +  name );
        System.out.println("print the 12th char substring in the name : " +  name.substring(6,12));

        System.out.println("print the 13th char substring in the name : " +  name.substring(6,13));
        System.out.println("print the 14th char substring in the name : " +  name.substring(6,14));
 //       System.out.println("print the 15th char substring in the name : " +  name.substring(6,15));


     System.out.println("print the characters in the given index  : " + name.charAt(4));
     
     String temp = "Hello People!            ";
     
     System.out.println("print the trimmed string : " + temp.trim() );
     
     String temp1 = temp.trim();
     
     System.out.println("print the trimmed string length before and after: " + temp.length() + " : " + temp1.length() );

     
     
     System.out.println("print the index of a given character in the string  : " + name.indexOf('l') );
     
     
     System.out.println("print the firstindex of a given character in the string  : " + name.indexOf('a') );

     System.out.println("print the lastindex of a given character in the string  : " + name.lastIndexOf('a') );
     
     String word1 = "rtempa";
     String word2 = "atempt";
     String word3 = "btemp";
     System.out.println("print the comparision of 2 strings  : " + word1.compareTo(word2) );
     
     System.out.println("print the comparision of 2 strings  : " + word2.compareTo(word1) );
     
     System.out.println("print the comparision of 2 strings  : " + word2.compareTo(word3) );

     System.out.println("replace a character by a given character in the string : " + word2.replace('t','z')  );

    
	 }
	 
	 public void stringBufferAndStringBuilder(){
		 
		 StringBuffer sb = new StringBuffer("today");
		 
		 sb.append(" class");
		 System.out.println("String buffer is immutable so it can change a string : " + sb);
		 
		 StringBuilder sb1 = new StringBuilder("Pallavi");
		 sb1.append(" class");
		 System.out.println("String builder is immutable so it can change a string : " + sb1);
		 
		 
	 }
	 
	 public void reverseString1(String word){
		 
		 char[] ch = word.toCharArray();
		 for(int i = word.length()-1; i >=0; i--) {
			 System.out.println("print the reverserd String : " + ch[i]);
		 }
		 
	 } 
	 
	 public String reverseString(String word){ 
		 StringBuilder sb1 = new StringBuilder();
		 for(int i = word.length()-1; i >=0; i--) {
//			 System.out.println("thelenght is : " + word.length());
//			 System.out.println("i is : " + i);
//			 System.out.println("i is : " + word.charAt(i));
             sb1.append(word.charAt(i)); 
		 }
		 
		return sb1.toString();
	 }

	 
   public String fileAndExtension(String file) {
	   
	   int slashLastIndex = file.lastIndexOf('/');
	   int dotLastIndex = file.lastIndexOf('.');
	   
	   String fileNm = file.substring(slashLastIndex+1, dotLastIndex);
	   String fileExtn = file.substring(dotLastIndex+1);
	   return fileNm.concat(fileExtn);

 
   }
	 
	 
	 
	 
	public static void main(String[] args) {
		
	 StringDemo sd = new StringDemo();
	 
	sd.printString();
	
	sd.stringMethods(); 
	
    sd.stringBufferAndStringBuilder();

 //   sd.reverseString1("technology");
    System.out.println("Print the given string in reverse : " + sd.reverseString("technology"));

   System.out.println("to print the filename and extension of a given path ; " + sd.fileAndExtension("C:/Pallavi/Basic resume/Pallavi_Jadhav.docx"));
    
	}

}
