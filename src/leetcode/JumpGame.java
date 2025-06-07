package leetcode;

public class JumpGame {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * Input: nums = [2,3,1,1,4] Output: true Explanation: Jump 1 step from index 0
		 * to 1, then 3 steps to the last index.
		 * 
		 * Input: nums = [3,2,1,0,4] Output: false Explanation: You will always arrive
		 * at index 3 no matter what. Its maximum jump length is 0, which makes it
		 * impossible to reach the last index.
		 * 
		 * 
		 */

		int[] nums = { 2, 3, 1, 1, 4 };
		System.out.println("1. Is jump is possible ? " + isJumpPossible(nums));

		int[] nums1 = { 3, 2, 1, 0, 4 };
		System.out.println("\n2. Is jump is possible ? " + isJumpPossible(nums1));

		int[] nums2 = { 0 };
		System.out.println("\n3. Is jump is possible ? " + isJumpPossible(nums2));

		int[] nums3 = { 0, 1 };
		System.out.println("\n4. Is jump is possible ? " + isJumpPossible(nums3));

		int[] nums4 = { 2, 0 };
		System.out.println("\n5. Is jump is possible ? " + isJumpPossible(nums4));

		int[] nums5 = { 0, 2, 3 };
		System.out.println("\n6. Is jump is possible ? " + isJumpPossible(nums5));

	}

	private static Boolean isJumpPossible(int[] nums) {
		int reachable = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > reachable)
				return false;
			reachable = Math.max(reachable, i + nums[i]);
		}
		return true;
	}

}
