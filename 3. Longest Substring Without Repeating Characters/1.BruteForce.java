// intuition : check all the substring one by one to see if it has no duplicate 
// character
public class Solution{
	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j <=n; j++) {
				if(allUnique(s,i,j)) {
					ans = Math.max(ans,j-i);
				}
			}
		}
		return ans;
	}

	public int allUnique(String s, int start, int end) {
		// this set keeps track of whatever
		// characters I've encountered until now
		Set<Character> set = new HashSet<>();
		for (int i = start; i < end;i++) {
			Character ch = s.charAt(i);
			if (set.contains(ch)) return false;
			set.add(ch);
		}
		return true;
	}
}
// Time complexity : find attached image
// Space complexity : O(min(n,m)). We need O(k) space for checking a substring has noduplicate characters, where k is the size of the Set. The size of the Set is upper bounded by the size of the string n and size of the charset.
