package leetcode;

import java.util.Arrays;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {
		/*
		 * problem no : 27
		 * 
		 * Input: nums = [3,2,2,3], val = 3 Output: 2, nums = [2,2,_,_]
		 * 
		 * Input: nums = [0,1,2,2,3,0,4,2], val = 2 Output: 5, nums = [0,1,4,0,3,_,_,_]
		 * 
		 * 
		 */

		List<Integer> input1 = Arrays.asList(3, 2, 1, 2, 3, 5, 2, 3, 6);
		int val1 = 3;
		System.out.println(elementRemover(input1, val1));

		List<Integer> input2 = Arrays.asList(0, 1, 2, 2, 3, 0, 4, 2);
		int val2 = 3;

		System.out.println(elementRemover((input2), val2));

	}

	private static int elementRemover(List<Integer> inputList, int val) {
		int count = 0;
		for (int i = 0; i < inputList.size(); i++) {
			if (inputList.get(i) != val) {
				inputList.set(count, inputList.get(i));
				count++;
			}
		}
		System.out.println(inputList);
		return count;
	}

}
