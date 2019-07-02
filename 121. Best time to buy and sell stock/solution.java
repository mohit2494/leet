/**
 * one pass solution
 * The points of interest are the peaks and valleys in the given graph. We need to find the largest peak following the smallest valley. We can maintain two variables - minprice and maxprofit corresponding to the smallest valley and maximum profit (maximum difference between selling price and minprice) obtained so far respectively.
 *
*/
public class Solution {

	/**
	 * Function returns max profit in O(n)
	 */
	public int maxProfit(int prices[]) {
		
		// see how we initialize for max value
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minprice) {
				// update min price
				minprice = prices[i];
			}
			else if (prices[i] - minprice > maxprofit) {
				// update max profit
				maxprofit = prices[i] - minprice;
			}
		}
		return maxprofit;
	}
}
