// Time: O(n)
// Space: O(1)

#include <vector>
#include <algorithm>
using std::vector;
using std::max;
using std::min;


class Solution {
	public:
		int maxProfit(vector<int> &prices) {
			if (prices.empty()) return 0;

			/** https://stackoverflow.com/questions/23120856/use-of-curly-brackets-braces-around-a-variable-c*/
			int ret{0}, low{prices[0]};
			for (auto price: prices) {
				low = min(low,price);
				ret = max(ret,price-low);
			}
			return ret;
		}
};
/**
 * numeric_limits : https://en.cppreference.com/w/cpp/types/numeric_limits
 * range based iteration : *using the auto keyword* : https://www.geeksforgeeks.org/range-based-loop-c/
 */


