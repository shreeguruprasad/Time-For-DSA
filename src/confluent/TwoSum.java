package confluent;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
/*
 * input array : [2,5,8,6,9,7}
 * target : 15
 * 
 * output : {5,8}
 */

public class TwoSum {

	public static void main(String[] args) {

		System.out.println("Executing started...");
		int[] input = { 2, 5, 8, 6, 9, 7 };
		int target = 15;
		System.out.println(
				"So two numbers to get the target values are :" + Arrays.toString(getTwoSumNum(input, target)));
		System.out.println("Execution ended...");
	}

	private static int[] getTwoSumNum(int[] inputArray, int targetValue) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < inputArray.length; i++) {
			int subValue = targetValue - inputArray[i];

			if (map.containsKey(subValue)) {
				return new int[] { subValue, inputArray[i] };
			}
			map.put(inputArray[i], inputArray[i]);
		}
		return new int[] {};

	}

}
