package leetcode;

import java.util.Arrays;

public class LengthofLastWord {

	public static void main(String[] args) {
		/*
		 * problem no : 58
		 * 
		 * Input: s = "Hello World"
		 * Output: 5
		 * Explanation: The last word is "World" with length 5.
		 * 
		 * Input: s = "   fly me   to   the moon  "
		 * Output: 4
		 * Explanation: The last word is "moon" with length 4.
		 * 
		 * Input: s = "luffy is still joyboy"
		 * Output: 6
		 * Explanation: The last word is "joyboy" with length 6.
		 * 
		 */
		
		
		String[] strArray = new String("   fly me   to   the moon  ").split(" ");
		System.out.println(strArray[strArray.length-1].length());
	}

}
