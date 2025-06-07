package leetcode;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {

	public static void main(String[] args) {
		/*
		 * 
		 * Input: arr = [17,18,5,4,6,1] Output: [18,6,6,6,1,-1]
		 * 
		 * Explanation: - index 0 --> the greatest element to the right of index 0 is
		 * index 1 (18). - index 1 --> the greatest element to the right of index 1 is
		 * index 4 (6). - index 2 --> the greatest element to the right of index 2 is
		 * index 4 (6). - index 3 --> the greatest element to the right of index 3 is
		 * index 4 (6). - index 4 --> the greatest element to the right of index 4 is
		 * index 5 (1). - index 5 --> there are no elements to the right of index 5, so
		 * we put -1.
		 * 
		 * Input: arr = [400] Output: [-1] Explanation: There are no elements to the
		 * right of index 0.
		 * 
		 */

		int[] arr1 = { 17, 18, 5, 4, 6, 1 };
		System.out.println(Arrays.toString(solutions(arr1)));

		int[] arr2 = { 400 };
		System.out.println(Arrays.toString(solutions(arr2)));

	}

	private static int[] solutions(int[] arr) {
		int[] result = new int[arr.length];
		result[arr.length - 1] = -1;
		int max = Integer.MIN_VALUE;
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
			}
			result[i - 1] = max;
		}
		return result;
	}

}
