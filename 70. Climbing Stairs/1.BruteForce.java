/**
 * In this brute force approach, we take all possible step combinations i.e. 1 and 2, at every step. At every step we are calling function climbStairs for step1 and step2 and return the sum of returned values of both functions.
 */

// climbStairs(i,n) = climbStairs(i+1,n) + climbStairs(i+2,n)
// where i defines the current step and n defines the destination step
public class Solution {
	public int climbStairs(int n) {
		climb_stairs(0,n);
	}
	public int climb_stairs(int i, int n) {
		// termination condition - recursion
		if (i>n) {
			return 0;
		}
		if (i == n) {
			return 1;
		}
		return climb_stairs(i+1,n) + climb_stairs(i+2,n);
	}
}
// Time complexity : O(2^n) : size of recursion tree will be 2^n
// Space complexity : O(n) : The depth of recursion tree can go upto n
