// as we know that the HashSet contains limited alphabets
// we can create a direct array - we call this the direct access table
// ASCII
public class Solution {
	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		int ans = 0;
		int[] index = new int[128];
		for (int j = 0, i = 0; j < n; j++) {
			i = Math.max(index[s.charAt(j)],j);
			ans = Math.max(ans, j -i +1);
			index[s.charAt(j)] = j+1;
		}
		return ans;
	}
}

/**
 * commonly used tables are:
 * int[26] - for letters 'a' to 'z' or 'A' to 'Z'
 * int[128] - ASCII
 * int[256] - for extended ASCII
 */
