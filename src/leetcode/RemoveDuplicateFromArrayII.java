package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateFromArrayII {

	public static void main(String[] args) {
		
		/*
		 * problem no : 80
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
		
		// second time 
		int[] inputArray= {0,0,1,1,1,1,2,2,3,3};
		int countSecond=2;
		
		System.out.println(Arrays.toString(inputArray)+"  ==>>  ");
		for(int i=2;i<inputArray.length;i++) {
			
			if(inputArray[i-2]!=inputArray[countSecond]) {
				inputArray[countSecond] = inputArray[i];
				countSecond++;
			}
			
		}
		
		System.out.print(Arrays.toString(inputArray) +"       =>  "+countSecond);
		
		
		
	}

}
