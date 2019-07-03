// reference : https://leetcode.com/problems/maximum-product-subarray/discuss/48230/Possibly-simplest-solution-with-O(n)-time-complexity

// The solution here looks beautiful. We know that when we multiply with a negative number, the m// until now becomes the smallest and the min until now will become the biggest. Thus, we swap th// e two.

class Solution {
	int maxProduct(int A[], int n) {
		// assuming there is atleast 1 element in the array
		// store the result that is the max we have found so far
		int r = A[0];

		for (int i = 1, imax = r, imin = r; i < n; i++) {
		
			// if a number is negative, then it makes 
			// max -> min 
			// min -> max
			// thus swapping
			// refer to swapping here :  https://www.geeksforgeeks.org/swap-exchange-objects-java/
			swap(imin,imax);
			
			// we'll see which one is bigger
			// max * A[i] or min*A[i]
			imax = max(A[i], imax*A[i]);
			imin = min(A[i], imin*A[i]);

			// r holds global max
			r = max(r,imax);
		}
		
		// return the max val
		return r;
	}
