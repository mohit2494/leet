/*
 * after solving the question in linear space time, we now try to minimize the space complexity. 
 * answer[] array is allowed by the question. We'll use to first calculate the Left product in one iteration.
 * We will then use it to iterate over for the right product.
 */

class Solution {
	public int[] productExceptSelf(int[] nums) {

		// the length of the input array
		int length = nums.length

		int[] answer = new int[length];

		answer[0] = 1;
	
		for (int i = 1; i < length; i++) {
			answer[i] = nums[i-1] * answer[i-1];
		}

		// as we will update R as move from right to left
		// we will keep updating the answer array from right to left
		for ( int i = length -1; i >=0; i--)  {
			answer[i] = answer[i]*R;
			R *= nums[i];
		}
		
		return answer;
	}
}
