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

		int[] n1 = { 2, 3, 6, 0, 0, 0 };
		int[] n2 = { 3, 5, 8 };
		int x = 3;
		int y = 3;
		
		System.out.print("1st array -> "+Arrays.toString(n1) + " 2nd array -> "+Arrays.toString(n2));

		int totalArrayLength = x + y - 1;
		int r = x - 1;
		int l = y - 1;

		while (l >= 0) {
			if (r - 1 > 0 && n1[r] > n2[l]) {
				n1[totalArrayLength--] = n1[r--];
			}else {
				n1[totalArrayLength--] = n2[l--];
			}
		}
		System.out.println("   ***  merged array  *** ==>> "+Arrays.toString(n1));
	}

}