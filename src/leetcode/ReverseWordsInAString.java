package leetcode;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		/*
		 * problem no : 151
		 * 
		 * Input: s = "the sky is blue" 
		 * Output: "blue is sky the"
		 * 
		 * Input: s = "  hello world  " 
		 * Output: "world hello" 
		 * Explanation: Your reversed
		 * string should not contain leading or trailing spaces.
		 * 
		 * Input: s = "a good   example" 
		 * Output: "example good a" 
		 * Explanation: You need
		 * to reduce multiple spaces between two words to a single space in the reversed
		 * string.
		 * 
		 */
		
		String input1 = "the sky is blue";
		wordReverser(input1);
		String input2 = "  hello world  ";
		wordReverser(input2);
		String input3 = "a good   example";
		wordReverser(input3);
		
		
	}

	private static void wordReverser(String str) {
		System.out.println(str);
		String result= "";
		String[] arr = str.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			result = result+arr[i];
			if(i!=0) {
				result = result+" ";
			}
		}
		System.out.println(result);
	}

}
