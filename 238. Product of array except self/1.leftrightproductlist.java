/**
 1. Initialize two empty arrays, L and R where for a given index i, L[i] would contain the product of all the numbers to the left of i and R[i] would contain the product of all the numbers to the right of i.
 
 2. We would need two different loops to fill in values for the two arrays. For the array L, L[0] would be 1 since there are no elements to the left of the first element. For the rest of the elements, we simply use L[i] = L[i - 1] * nums[i - 1]. Remember that L[i] represents product of all the elements to the left of element at index i.

 3. For the other array, we do the same thing but in reverse i.e. we start with the initial value of 1 in R[length - 1] where length is the number of elements in the array, and keep updating R[i] in reverse. Essentially, R[i] = R[i + 1] * nums[i + 1]. Remember that R[i] represents product of all the elements to the right of element at index i.

 Once we have the two arrays set up properly, we simply iterate over the input array one element at a time, and for each element at index i, we find the product except self as L[i] * R[i].
**/

class Solution {
	public int[] productExceptSelf(int[] nums) {
	
		// length of the arrays
		int length = nums.length;
		
		// initialize 2 new arrays
		int[] left =  new int[length];
		int[] right = new int[length];

		// final answer to be returned
		int[] answer = new int[length];

		// L[i] contains the product of all elements to the left
		// Note : for the element at index '0', there are no elements to the Left,
		// so L[0] would be 1
		L[0] = 1;

		for (int i = 1; i < length; i++) {
			/*
				L[i-1] already contains the product of elements to the left of 'i-1'
				simply multiplying it with nums[i-1] would give the product of all
				elements to the left of index i				
			*/
			L[i] =  nums[i-1]*L[i-1];
		}

		// similarly for R[i]
		R[length-1] = 1
		for (int i = length-2; i >= 0; i--) {
			R[i] = nums[i+1]*R[i+1];
		}

		// constructing the answer array
		for ( int i = 0; i < length ; i++) {
			answer[i] = L[i] * R[i];
		}
	}
}

/*
 	Complexity

	Time - O(n) We use one iteration to construct the array L, one to construct array R and one last to 
	construct the array answer

	Space - O(n) used up by the two intermediate arrays that we constructed to keep track of product of elements
	to the left and right
*/


