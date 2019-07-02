/* We need to find out the maximum difference (which will be the maximum profit) between two numbers in the given array. Also, the second number (selling price) must be larger than the first one(buying price).
 * in formal terms we need to find max(prices[j]-prices[i]) for every i and j such that j>i
 */

public class Solution{
	
	/**
	 * Function returns maximum profit from the array
	 *
	 */
	public int maxProfit(int prices[]) {
		for(int i = 0; i < prices.length; i++) {
			for ( int j = 0; j < prices.length; j++) {
				
				// calculate profit for given i,j
				int profit = prices[j] - prices[i];
				
				// check if max
				if ( profit > maxprofit ) {
					maxprofit = profit;
				}
			}
		}
	}
}

/*
 * Time complexity : O(n^2)
 * Space complexity : O(1) only 2 variables maxprofit and profit are used
 */
