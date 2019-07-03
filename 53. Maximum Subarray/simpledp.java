// reference : https://leetcode.com/problems/maximum-subarray/discuss/20193/DP-solution-and-some-thoughts

/*
So I change the format of the sub problem into something like: maxSubArray(int A[], int i), whichmeans the maxSubArray for A[0:i ] which must has A[i] as the end element. Note that now the sub problem's format is less flexible and less powerful than the previous one because there's a limitation that A[i] should be contained in that sequence and we have to keep track of each solution ofthe sub problem to update the global optimal value. However, now the connect between the sub problem & the original one becomes clearer:
*/

// the main recursive relation becomes : 
// maxSubArray(A,i) = maxSubArray(A, i-1) > 0 ? maxSubArray(A,i-1) : 0 + A[i];

// starting out the code here

class Solution {
	public int maxSubArray(int[] A) {
		
		int n = A.length;
		// dp means the maximum subarray ending with A[i]
		int[] dp = new int[n];

		dp[0] =  A[0];
		int max = dp[0];
		
		for (int i = 1; i < n; i++) {
			// dp step
			dp[i] = A[i] + (dp[i-1] > 0 ? dp[i-1] :0);
			// see how we are using Math.max
			max = Math.max(max, dp[i]);
		}
	return max;
}




