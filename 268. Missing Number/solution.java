/*
 * We can harness the fact that XOR is its own inverse to find the missing element in linear time.
 * Algorithm:
 * ----------
 *  Because we know that *nums* contains n numbers and that its missing exactly one number. If we XOR the numbers one by one, they will cancel out each other when the number is found. Only the number which doesn't exist will come out of the XOR sequence
 * */
class Solution {
	public: 
		int missingNumber(int[] nums) {
			int missing = nums.length;
			for ( int i = 0; i < nums.length; i++) {
				missing ^= i ^ nums[i];
			}
			return missing;
		}
}
