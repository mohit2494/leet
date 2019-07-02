/*
 * This approach is a naive one and reaches O(n^2) of complexity
 * The solution in this one exceeds the time limit
 */

class Solution {
	/*
	 * Function returns boolean whether the array contains duplicate entry
	 */
	public boolean containsDuplicate(int[] nums) {
		for (int i = 0; i < nums.length; i++)  {
			for (int j = 0; j < i ; ++j) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
	}
}
				




