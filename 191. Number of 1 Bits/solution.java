/*
 The key idea here is to realize that for any number n, doing a bitwise AND of n and n-1 flips the least significant 1 in n to 0. In the binary representation, the least significant 1 bit in n always corresponds to a 0-bit in n-1. Therefore, anding the two numbers n and n-1 always flips the least significant 1-bit in n to 0, and keeps all the other bits the same.
*/
class Solution {
	public:
		int hammingWeight(int n) {
			int sum = 0;
			while (n!=0) {
				sum++;
				n &= (n-1);
			}
			return sum;
		}
}
