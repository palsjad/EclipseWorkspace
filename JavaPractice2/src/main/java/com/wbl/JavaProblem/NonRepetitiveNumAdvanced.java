//
//Write a program to find non repeated numbers in given array of numbers.
//eg: input:{2,3,4,2,3,7,5} output:{4,7,5}
//

package com.wbl.JavaProblem;

import java.util.ArrayList;
import java.util.List;

public class NonRepetitiveNumAdvanced {

	public static void main(String[] args) {

		int[] num = {2,2,3,4,2,3,7,5};

		findNonRepetitiveNums(num);

	}
	
	

 	public static int repetitiveCheck(List<Integer> arr, int num) {

		int flag = 0;

		if(arr.size() != 0) {
			
			for(int i = 0; i < arr.size();i++  ) {

    			if(num == arr.get(i)) { 

					flag = 1;
					break;

				}
			}
 
		}
		
		return flag;
		
	}
 	
 	
	public static void findNonRepetitiveNums(int input[]) {

		List<Integer> repetitiveArr = new ArrayList<Integer>();
		List<Integer> nonRepetitiveArr = new ArrayList<Integer>();

		int flag = 0, repFlag = 0;


		for(int i = 0; i < input.length; i++, repFlag = 0) {

			flag = repetitiveCheck(repetitiveArr,input[i]);

			if(flag != 1) {

				for(int j = 0; j < input.length; j++) {

					if ( j != i && input[j] == input[i]) {						 

  						repetitiveArr.add(input[i]);
						repFlag = 1;
  						break;

					}


				}

 				if(repFlag != 1) 
					nonRepetitiveArr.add(input[i]);


			}


		}

		System.out.println("Non Repetitive Array : " + nonRepetitiveArr.toString());

		System.out.println("Repetitive Array     : " + repetitiveArr.toString());

	}

 

}
