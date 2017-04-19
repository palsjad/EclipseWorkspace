
/*	 Find highest occurred character in a String?

	eg: abbcbuhkjashbb o/p: b*/

package com.wbl.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HighestOccurenceOfChar {

	public static void main(String args[]) {

		String str = "abbcbuhkjashbb";

		String[] val = str.split("");

		String letter = "";
		int count = 1;
		int j = 0;

		Map<String, Integer> result = new HashMap<String, Integer>();

		for (int i = 0; i < val.length; i++) {

			letter = val[i];
			if ((!result.containsKey(letter))) {
				for (j = i, i++; i < val.length; i++) {

					if (val[i].equals(letter)) {

						count++;
					}

					result.put(letter, count);

				}
				count = 1;
				i = j;

			}

		}

		int max = 0;
		String maxChar = "";
		Set<String> mapKey = result.keySet();

		System.out.println("\nThe list is as follows\n");

		for (String ch : mapKey) {

			System.out.println(ch + "  :  " + result.get(ch));

			if (result.get(ch) > max) {
				max = result.get(ch);
				maxChar = ch;
			}

		}

		System.out.println("\nThe most repeated character is : " + maxChar + " and it is repeated " + max + " times ");

	}
}
