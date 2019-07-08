// In the previous approach we are redundantly calculating the result for every step. Instead, we can store the result at each step in memo array and directly returning the result from memo array whenever that function is called again
// In this way, we are pruning recursion tree with the help of memo array and reducing size of the recursion treeupto n
public class Solution {
	public int climbStairs(int n) {
		int memo[] = new int[n+1];
		return climb_stairs(0, n, memo);
	}
	public int climb_stairs(int i, int n, int memo[]) {
		if (i>n) {
			return 0;
		}
		if (i==n) {
			return 1;
		}
		if (memo[i] > 0) {
			return memo[i];
		}
		memo[i] = climb_stairs[i+1, n, memo) + climb_stairs(i+2, n, memo);
		return memo[i];
	}
}
// Time - O(n)
// Space - O(n)
