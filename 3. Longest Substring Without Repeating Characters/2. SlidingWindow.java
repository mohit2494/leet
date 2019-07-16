// sliding window concept
/*
In the naive approaches, we repeatedly check a substring to see if it has duplicate character. But it is unnecessary. If a substring Sij from index i to j-1 is already checked to have no duplicate characters. We only need to check if s[j] is already in the substring sij

To check if a character is already in the substring, we can scan the substring, whichleads to an O(n^2) algorithm. But we can do better.

By using HashSet as a sliding window, checking if a character exists can be done in O(1).

A sliding window is an abstract concept commonly used in array/string problems. A window is a range of elements in the array/string which is usually defined by the start and end indices, i.e [i,j) (left closed, right open)

We used hashset to store the characters in current window [i,j). Then we slide the index j to the right. If it is not in the Hashset, we slide j further. Doing so until s[j] is already in the HashSet.

We go on so and forth.

*/
public class Solution {
	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans = 0, i = 0, j = 0;
		while(i<n && j<n) {
			// try extend the range
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j-i);
			}
			else {
				// this is important 
				// this will remove char at i
				// and then will increment the index
				set.remove(s.charAt(i++));
			}
		}
	}
}
// Time complexity : O(n)
// Space complexity : O(min(m,n))
