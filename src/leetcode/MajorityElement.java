package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	/*
	 * problem no : 169
	 * 
	 * Input: nums = [3,2,3] Output: 3
	 * 
	 * Input: nums = [2,2,1,1,1,2,2] Output: 2
	 * 
	 */

	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2,1,1,1,1};
		int majority = 0;
		int majorityValue=0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1); 
			if(map.get(nums[i])>majority) {
				majority=map.get(nums[i]);
				majorityValue = nums[i];
			}
		}
		
		System.out.println("Highest repeated number is  : "+ majorityValue);
	}

}
