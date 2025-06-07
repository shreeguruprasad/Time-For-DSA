package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MaxNumInRightSideOfArray {

	public static void main(String[] args) {
		/*
		 * 
		 * Input: nums = [2,3,5,1,4] Output: [5,4]
		 * 
		 */

		int[] nums = { 2, 3, 5, 1, 4 };
		System.out.println("result :" + getMaxNumberRightSideOfTheArray(nums).toString());
	}

	private static List<Integer> getMaxNumberRightSideOfTheArray(int[] nums) {
		int minimumNumber = Integer.MIN_VALUE;
		List<Integer> list = new ArrayList();

		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] > minimumNumber) {
				list.add(nums[i]);
				minimumNumber = nums[i];
			}
		}

		return list;
	}

}
