// this one is done in a more intuitive way and I liked it
// we check the position of character. If it hasn't occured before, we increase the size of the substring
// if it has occured before, we change the starting of the substring to a point one greater than the previous existence of the chacracter
class Solution {
	public:
		int lengthOfLongestSubstring(string S) {

			// we are using a direct access table, than a hashmap
			int last[256];
			int maxSize = 0;

			// memset initializes a block of memory
			// reference : http://www.cplusplus.com/reference/cstring/memset/
			// Sets the first num bytes of the block of memory pointed by ptr to the specified value
			memset(last, -1, sizeof(last));
			
			// in the starting the beginning position will be the starting of the string
			int beginPos = 0;

			// string has an inbuilt function size in cpp
			for (int lastPos = 0; lastPos < s.size(); lastPos++) {
				
				if(last[s[lastPos]] < beginPos) {
					// it's fine, the char existed before the substring we are considering now
					maxSize = max(maxSize, lastPos-beginPos+1);
				}
				else {
					beginPos = last[s[lastPos]] + 1;
				}
			}
			return maxSize;

		}
}
