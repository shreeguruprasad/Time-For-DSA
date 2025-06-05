package leetcode;

import java.util.Arrays;

public class RemoveDuplicateFromArrayII {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Input: nums = [1,1,1,2,2,3]
		 * Output: 5, nums = [1,1,2,2,3,_]
		 * 
		 * Input: nums = [0,0,1,1,1,1,2,3,3]
		 * Output: 7, nums = [0,0,1,1,2,3,3,_,_]
		 * 
		 */
		
		int[] arr= {0,0,1,1,1,1,2,2,3,3};
		int count=2;
		for(int i=2;i<arr.length;i++) {
			if(arr[i]!=arr[count-2]) {
				arr[count]=arr[i];
				count++;
			}
			
		}
		
		System.out.println("total number of turns to remove duplicate : "+count);
		System.out.println(Arrays.toString(arr));
		
	}

}
