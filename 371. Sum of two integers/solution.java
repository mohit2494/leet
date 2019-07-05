/*
 * This is how we break down bit manipulation problem. We do the main operation first and then break it down.
 * We then try to solve the parts using the bit operations. Lets see if we add 10+5.
 * 10 - 1010 + 4 - 0100 = 14 (1110) shows that addition is simply an OR operation
 * This videos explains why carry operation while addition is and AND bit operation - https://www.youtube.com/watch?v=qq64FrA2UXQ
 * While adding the carry to the next one is a shift operation. ( << ) 
 * we store the result of addition in a
 * while we store the result of carry in b after shifting
 */
class Solution {
	public int getSum(int a, int b) {
		
		if (a == 0) return b;
		if (b == 0) return a;

		while (b!=0) {
			int carry = a & b;
			a = a^b;
			b = carry << 1;
		}
		
		return a;
	}
}
