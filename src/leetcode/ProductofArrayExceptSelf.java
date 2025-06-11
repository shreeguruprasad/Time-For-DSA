package leetcode;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		/*
		 * problem no : 88
		 * 
		 * Input: nums = [1,2,3,4] Output: [24,12,8,6]
		 * 
		 * Input: nums = [-1,1,0,-3,3] Output: [0,0,9,0,0]
		 * 
		 */

		int[] nums = { 1, 2, 3, 4 };
		int[] nums1 = { -1, 1, 0, -3, 3 };

		multipler(nums);
		multipler(nums1);

	}

	private static void multipler(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int product = 1;
			System.out.println(nums[i]);
			for (int j = 0; j < nums.length; j++) {
				if (j != i) {
					product = product * nums[j];
				}

			}
			result[i] = product;
		}
		System.out.println(Arrays.toString(result));

	}

}
