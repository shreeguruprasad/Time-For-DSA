package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicateFromArray {
	public static void main(String[] args) {

		/*
		 * 
		 * Input: nums = [1,1,2] Output: 2, nums = [1,2,_]
		 * 
		 * Input: nums = [0,0,1,1,1,2,2,3,3,4] Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
		 * 
		 */

		int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5 };
		int[] result = duplicateElementRemover(arr);
		System.out.println("after removing the duplicate elements in the array :" + Arrays.toString(result));
	}

	public static int[] duplicateElementRemover(int[] arr) {
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				arr[count] = arr[i];
				count++;
			}

		}

		int[] resultAsArray = IntStream.range(0, arr.length)
				.filter(i -> i == 0 || arr[i] != arr[i - 1])
				.map(i -> arr[i])
				.toArray();

		System.out.println(" number of elements moved :" + count);

		// return resultAsArray;

		return arr;

	}

}
