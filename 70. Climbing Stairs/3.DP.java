// as we see this problem can be broken down into subproblems, and it contains the optimal substructure property
// i.e. optimal solution can be constructed efficiently from optimal solutions of its subproblems, we can use
// dynamic programming to solve this problem
// One can reach ith step in one of the 2 ways:
// Taking a single step from (i-1)th step
// Taking a step of 2 from (i-2) step

// Let dp[i] denotes the number of ways to reach on ith step
// dp[i] = dp[i-1] + dp[i-2]

public class Solution{
	public int climbStairs(int n) {
		if (n==1) {
			return 1;
		}
		int[] dp = new int[n+1];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i<=n; i++) 
			dp[i] = dp[i-1]+dp[i-2];
		}
	return dp[n];
	}
}

