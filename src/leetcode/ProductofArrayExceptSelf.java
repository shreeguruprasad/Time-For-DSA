package leetcode;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		/*
		 * problem no : 238
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
		int n = nums.length;
		int[] ans = new int[n];
		int left = 1;
		for (int i = 0; i < n; i++) {
			ans[i] = left;
			left *= nums[i];
		}
		int rigth = 1;
		for (int i = n - 1; i >= 0; i--) {
			ans[i] *= rigth;
			rigth *= nums[i];

		}
		System.out.println(Arrays.toString(ans));
	}

}
