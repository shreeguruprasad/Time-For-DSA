package leetcode;

import java.util.Arrays;

public class MergeSorted {

	/*
	 * problem no : 88
	 * 
	 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 Output:
	 * [1,2,2,3,5,6]
	 * 
	 * Input: nums1 = [1], m = 1, nums2 = [], n = 0 Output: [1]
	 * 
	 */

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int m = 3, n = 3;

		// solution

		int totalArrSize = m + n - 1;
		int right = m - 1;
		int left = n - 1;

		while (left >= 0) {
			if (right > 0 && nums1[right] > nums2[left]) {
				nums1[totalArrSize--] = nums1[right--];
			} else {
				nums1[totalArrSize--] = nums2[left--];
			}
		}

		System.out.println(Arrays.toString(nums1));

	}

}
