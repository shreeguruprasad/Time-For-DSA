package leetcode;

public class ValidPalindrome {

	public static void main(String[] args) {
		/*
		 * problem no : 125
		 * 
		 * Input: s = "A man, a plan, a canal: Panama" Output: true Explanation:
		 * "amanaplanacanalpanama" is a palindrome.
		 * 
		 * Input: s = "race a car" Output: false Explanation: "raceacar" is not a
		 * palindrome.
		 * 
		 */
		String input = "A man, a plan, a canal: Panama";
		System.out.println(input);
		System.out.println(isValidPalndrome(input));

		String input2 = "race a car";
		System.out.println("\n" + input2);
		System.out.println(isValidaPalindromeApproachTwo(input2));

	}

	private static boolean isValidPalndrome(String str) {
		if (str.length() == 0 || str.length() == 1) {
			return true;
		}
		int start = 0;
		int last = str.length() - 1;
		while (start <= last) {
			char currFirst = str.charAt(start);
			char currlast = str.charAt(last);
			if (!Character.isLetterOrDigit(currFirst)) {
				start++;
			} else if (!Character.isLetterOrDigit(currlast)) {
				last--;
			} else {
				if (Character.toLowerCase(currFirst) != Character.toLowerCase(currlast)) {
					return false;
				}

				start++;
				last--;
			}
		}

		return true;
	}

	private static boolean isValidaPalindromeApproachTwo(String str) {
		str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

}
