// reference - https://leetcode.com/problems/counting-bits/discuss/270693/Intermediate-processsolution-for-the-most-voted-solution-i.e.-no-simplificationtrick-hidden
/*
 * An even number in binary ends with 0
 * An odd number in binary ends with 1
 * 1) If it is even, the ending bit is 0, then that bit can be ignored. countBits(num) is same as countBits(num>>1)
 * 2) If it is odd, the ending bit is 1, then the number of set bits is that of  num-1+1, i.e countBits(num) == countBits(num-1)+1
 * */
class Solution {
	public int[] countBits(int num) {
		// creating the result array
		int[] res = new int[num+1];
		res[0] = 0;
		for (int i = 1; i <= num; i++){
			// tricky way of remainder when
			// divided by 2
			if((i&1) == 0) {
				res[i] = res[i>>1];
			}
			else {
				res[i] = res[i-1] + 1;
			}
		}
		return res;
	}
}
