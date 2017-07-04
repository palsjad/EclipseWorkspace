/*
Given a string, find the longest substrings without repeating characters. Iterate through the given string,
 find the longest maximum substrings.
 input:java2novice, o/p: a2novice

 input:java_language_is_sweet, o/p: uage_is

*/

//[j0a1v2, _4l5a6n7g8u9, g11e12_13i14s15, s17w18e19]

package com.wbl.practice;

import java.util.ArrayList;
import java.util.List;

public class FindLongestSubstring {

	public static void main(String[] args) {

		String str = "java_language_is_sweet";

		List<String> finalResult = checkStr(str);

		System.out.println(finalResult.toString());  // print the final list of non duplicate strings

		findLongest(finalResult);

	}
	
	
//********************************************************************************

	public static List<String> checkStr(String str) {

		List<String> list = new ArrayList<String>();

		String res = "";

		int flag = 0;
		int temp = 0;

		for (int i = 0; i < str.length(); i++) {

			flag = checkDuplicates(res, str.charAt(i));  // check for duplicates in the created temporary string

			if (flag == 0) {
				res = res.concat(Character.toString(str.charAt(i)));
			}

			else {

				list.add(res);

				System.out.println(res.toString());

 
				// scale back upto the character that is duplicated and reset the index i

				temp = revertBackToDuplicate(str, str.charAt(i), i); 

				i = temp - 1;
				res = "";
				flag = 0;
			}

		}

		return list;

	}
	
//********************************************************************************

	public static int revertBackToDuplicate(String givenString, char ch, int index) {

		int num = 0;

		for (int i = index - 1; i > 0; i--) {

			if (givenString.charAt(i) == ch) {

				num = i + 1;
				break;
			}

		}

		return num;
	}
	
//********************************************************************************
	

	public static int checkDuplicates(String result, char a) {

		int flag = 0;

		if (result.isEmpty()) {

			return flag = 0;
		}

		for (int m = 0; m < result.length(); m++) {

			if (result.charAt(m) == a) {

				flag = 1;
			}

		}

		// System.out.println("flag : " + flag);

		return flag;
	}
	
 //********************************************************************************
	

	public static void findLongest(List<String> finRes) {

		String longestStr = "";

		longestStr = finRes.get(0);

		for (int i = 1; i < finRes.size(); i++) {

	//		System.out.println(finRes.get(i));

			if (longestStr.length() < finRes.get(i).length()) {

				longestStr = finRes.get(i);
			}
		}

		System.out.println("\n\nThe longest sub string in the given string is : " + longestStr);
	}

 //********************************************************************************
	
	
}



