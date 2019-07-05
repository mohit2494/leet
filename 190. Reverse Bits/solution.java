// reference - https://leetcode.com/problems/reverse-bits/discuss/54738/Sharing-my-2ms-Java-Solution-with-Explanation
// here's the algo 
// initialize result to 0
// then check the last bit of n and add it to result
// left shift result by 1 as the last bit will eventually become the first bit
// right shift n by 1 as the last bit it already considered.
class Solution {
	public int reverseBits(int n) {
		if (n==0) return 0;
		int result = 0;
		for (int i = 0; i < 32; i++) {
			result <<= 1;
			if ((n&1) == 1) result++;
			n >>= 1;
		}
		return result;
	}
}
