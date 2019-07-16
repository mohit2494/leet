// sliding window optimized
/*
The above solution requires atmost 2n steps. In fact, it could be optimized to require only n steps. Instead of using a set to tell if a character exists or not, we could define a mapping of the characters to its index. Then we can skip the characters immediately when we cound a repeated character.

The reason is that if s[j] have a duplicate in the range [i,j) with index j', we don't need to increase i little by little, we can skip all the elements in the range [i,j'] and let i to be j'+1 directly.
*/
public class Solution {
	public int lengthOfLongestSubstring(String s) {
		// map for storing alphabets
		Map<Character, Integer> map = new HashMap<>();
		int start=0, len=0;

		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				if(map.get(c) >= start) {
					start = map.get(c) + 1;
				}
			}
			len = Math.max(len, i-start+1);
			map.put(c,i);
		}
		return len;
	}
}
