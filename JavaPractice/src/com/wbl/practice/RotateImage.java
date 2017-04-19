package com.wbl.practice;

import java.util.Arrays;

public class RotateImage {

	public static void main(String[] args) {

		int[][] imageArr = { { 2, 3, 4 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] finalArr = new int[3][3];

		System.out.println("\n " + Arrays.toString(imageArr[0]) + " \n " + Arrays.toString(imageArr[1]) + " \n "
				+ Arrays.toString(imageArr[2]) + "\n");

		for (int i = 0, j = 0, m = imageArr.length - 1, n = 0; m >= 0; m--, j++) {

			finalArr[i][j] = imageArr[m][n];

			finalArr[i + 1][j] = imageArr[m][n + 1];

			finalArr[i + 2][j] = imageArr[m][n + 2];

		}

		for (int i = 0; i <= (finalArr.length - 1); i++) {

			for (int j = 0; j <= (finalArr[i].length - 1); j++) { // medha's   suggestion
																	 
				System.out.print(finalArr[i][j]);
				
				if(j != finalArr.length-1){
					System.out.print(", ");

					
				}

			}
			
			System.out.print("\n");
		}

	}

}
