package interview.questions;

public class QuestionNumberTwo {

	public static void main(String[] args) {
		/*
		 * 
		 * Wissen Technology Solutions : 1st Technical Round
		 * 
		 * Input : 	5 
		 * 			2,2,5,6,-2 
		 * output:  3
		 * 
		 */

		long[] arr = { 2, 2, 1, 6, 5 };
		int len = arr.length;

		for (int i = 1; i < len - 1; i++) {
			long leftSum = 0;
			long rightSum = 0;
			for (int j = 0; j < i; j++) {
				leftSum = leftSum + arr[j];
			}
			for (int j = i+1; j < len; j++) {
				rightSum = rightSum + arr[j];
			}
			
			if(leftSum == rightSum) {
				System.out.println(i+1);
			}
		}
	}

}
