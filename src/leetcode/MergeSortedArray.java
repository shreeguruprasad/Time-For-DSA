package leetcode;

import java.util.Arrays;

import javax.naming.spi.DirStateFactory.Result;

public class MergeSortedArray {

	/*
	 * 
	 * Tavant Coding round
	 * 
	 */
	
	
	public static void main(String[] args) {
		int[] firstArray = { 2, 4, 6, 8, 10 };
		int[] secondArray = { 1, 2, 3, 5, 7, 9 };

		System.out.println(Arrays.toString(mergeAndSort(firstArray, secondArray)));

	}

	private static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
		int firstLen = firstArray.length - 1;
		int secLen = secondArray.length - 1;
		int m = firstArray.length + secondArray.length - 1;
		int[] result = new int[m + 1];
		while (secLen >= 0) {
			if (firstLen >= 0 && secondArray[secLen] < firstArray[firstLen]) {
				result[m--] = firstArray[firstLen--];
			} else {
				result[m--] = secondArray[secLen--];
			}
		}

		return result;
	}

}
