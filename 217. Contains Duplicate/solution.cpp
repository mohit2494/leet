/** we have 2 solutions for cpp **/

// Time : O(n)
// Space : O(n)

// unordered_set - https://www.geeksforgeeks.org/unordered_set-in-cpp-stl/


// solution 1

#include <bits/stdc++.h> 
using namespace std;

class Solution {
	public:
		bool containsDuplicate(vector<int>& nums) {
			// initializing a new unordered_set from beginning of nums till the end
			unordered_set<int> nums_set(nums.begin(),nums.end());
			return nums_set.size() != nums.size();
		}
};

// Time : O(nlogn)
// Space : O(1)

class Solution {
	public: 
		bool containsDuplicate(vector<int> &nums) {
			// learn more about std::sort here - https://www.geeksforgeeks.org/sort-c-stl/
			sort(nums.begin(), nums.end());
			// read more about unique here - https://www.geeksforgeeks.org/stdunique-in-cpp/
			return unique(nums.begin(), nums.end()) != nums.end();
		}
};


