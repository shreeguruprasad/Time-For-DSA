package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public static void main(String[] args) {

		/*
		 * problem no : 55
		 * 
		 * Input: ransomNote = "a", magazine = "b" Output: false
		 * 
		 * Input: ransomNote = "aa", magazine = "ab" Output: false
		 * 
		 * Input: ransomNote = "aa", magazine = "aab" Output: true
		 * 
		 */

		String ransomNote = "a";
		String magazine = "b";
		System.out.println("ransomNote  : " + ransomNote + "     magazine   " + magazine + "   :  "
				+ isValidRansomNote(ransomNote, magazine));

		String ransomNote1 = "aa";
		String magazine1 = "ab";
		System.out.println("ransomNote  : " + ransomNote1 + "     magazine   " + magazine1 + "   :  "
				+ isValidRansomNote(ransomNote1, magazine1));
		String ransomNote2 = "aa";
		String magazine2 = "aab";
		System.out.println("ransomNote  : " + ransomNote2 + "     magazine   " + magazine2 + "   :  "
				+ isValidRansomNote(ransomNote2, magazine2));
		String ransomNote3 = "aa";
		String magazine3 = "bascc";
		System.out.println("ransomNote  : " + ransomNote3 + "     magazine   " + magazine3 + "   :  "
				+ isValidRansomNote(ransomNote3, magazine3));

	}

	private static boolean isValidRansomNote(String ransomNote, String magazine) {
		Map<Character, Integer> map = new HashMap<>();
		if (ransomNote.length() == 1 && magazine.length() == 1 && ransomNote.equals(magazine))
			return false;

		for (char mag : magazine.toCharArray()) {
			map.put(mag, map.getOrDefault(mag, 0) + 1);
		}

		for (char ran : ransomNote.toCharArray()) {
			if (map.containsKey(ran) && map.get(ran) > 0) {
				map.put(ran, map.getOrDefault(ran, 0) - 1);

			} else
				return false;
		}
		return true;
	}

}
