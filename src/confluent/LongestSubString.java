package confluent;

import java.util.HashSet;

/*
 * Input: s = "abcabcbb"
 * Output: 3
 * 
 */

public class LongestSubString {

	public static void main(String[] args) {
		String input = "abcabcbb";
		HashSet<Character> set = new HashSet<>();
		int max = 0;
		int left = 0, right = 0;

		while (right < input.length()) {
			if (set.contains(input.charAt(right))) {
				set.remove(input.charAt(left));
				left++;
			} else {
				set.add(input.charAt(right));
				right++;
				int size = set.size();
				max = Math.max(max, size);
			}
		}

		System.out.println(max);

	}

}
