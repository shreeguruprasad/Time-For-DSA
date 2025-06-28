package interview.questions;

import java.util.Arrays;

public class QuestionNumberThree {

	public static void main(String[] args) {
		/*
		 * 
		 * Wissen Technology Solutions : 1st Technical Round
		 * 
		 * Input : 2,2,5,6,-2 
		 * output: 2,2,5,6,-2
		 * 
		 * Input : -6,-2,0,6,2,1 
		 * output: -2,-6,6,0,2,1
		 * 
		 * Explanation : swap the odd indices with even indices if it greater
		 * 
		 */

		int index = 0;
		int[] arr = { 2, 2, 5, 6, -2 };
		System.out.print(Arrays.toString(arr) + " -> " + Arrays.toString(swapper(arr, index)));
		
		int[] arr1 = { -6,-2,0,6,2,1 };
		System.out.print("\n"+Arrays.toString(arr1) + " -> " + Arrays.toString(swapper(arr1, index)));
	}

	private static int[] swapper(int[] arr, int index) {
		while (index < arr.length - 1) {
			if (arr[index] < arr[index + 1]) {
				int temp = arr[index];
				arr[index] = arr[index + 1];
				arr[index + 1] = temp;
			}
			index = index + 2;
		}

		return arr;
	}

}
