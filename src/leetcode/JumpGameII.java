package leetcode;

public class JumpGameII {

	public static void main(String[] args) {
		/*
		 * problem no : 45
		 * 
		 * Input: nums = [2,3,1,1,4] Output: 2 Explanation: The minimum number of jumps
		 * to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to
		 * the last index.
		 * 
		 * 
		 * 
		 * 
		 */
		int[] arr = { 2, 3, 1, 1, 4 };
		System.out.println(findJump(arr));

	}

	private static int findJump(int[] arr) {
		int jumps = 0, currEnd = 0, currFarthest = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			currFarthest = Math.max(currFarthest, i + arr[i]);
			if (i == currEnd) {
				jumps++;
				currEnd = currFarthest;
			}
		}
		return jumps;
	}

}
