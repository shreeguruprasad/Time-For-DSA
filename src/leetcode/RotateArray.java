package leetcode;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {

		/*
		 * problem no : 189
		 * 
		 * Input: nums = [1,2,3,4,5,6,7], k = 3 Output: [5,6,7,1,2,3,4]
		 * 
		 * Input: nums = [-1,-100,3,99], k = 2 Output: [3,99,-1,-100]
		 * 
		 */

		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		System.out.println("Before sorting the array :" + Arrays.toString(nums));
		System.out.println("After sorting the array :" + Arrays.toString(arrayRotater(nums, k)));

		System.out.println();
		int[] nums1 = { -1, -100, 3, 99 };
		k = 2;
		System.out.println("Before sorting the array :" + Arrays.toString(nums1));
		System.out.println("After sorting the array :" + Arrays.toString(arrayRotater(nums1, k)));

	}

	private static int[] arrayRotater(int[] nums, int k) {
		int m = nums.length - 1;
		int[] result = rotater(nums, 0, m);
		result = rotater(result, 0, k - 1);
		return rotater(result, k, m);
	}

	private static int[] rotater(int[] nums, int left, int right) {
		while (left <= right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}
		return nums;

	}

}
