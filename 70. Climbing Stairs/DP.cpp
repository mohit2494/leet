class Solution {
public:
    int climbStairs(int n) {
        
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        if (n==2)        
            return 2;
        
        // let us allocate memory for a new array now
        int *dp = new int[n+1];
        // initialize arrays
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        int i = 3;
        for (i = 3; i <=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        // you were returning dp of i 
        // the loop breaks on i+1
        // thus the value of i at this point would be i+1
        return dp[n];
    }
};

