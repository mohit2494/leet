/*
 * we'll be using the same 1 pass algorithm to calculate the 2 sum problem
 * lets import vector and undordered map in c++
 * */
#include <vector>
#include <unordered_map>
using namespace std;

class Solution {

	public :
		vector<int> twoSum(vector<int>& nums, int target) {
			unordered_map<int, int> m;
			vector<int> result;
			for (int i = 0;  i < nums.size(); i++) {
				if(m.find(nums[i]) == m.end())	 {
					// it reached the end while searching
					// still could not find it
					// storing the complement
					m[target - nums[i]] = i;
				} else {
					result.push_back(m[nums[i]]);
					result.push_back(i);
					break;
				}
			}			
			return result;
		}
};	



/**
 * unordered_map - https://www.geeksforgeeks.org/unordered_map-in-cpp-stl/
 * vector - https://www.geeksforgeeks.org/vector-in-cpp-stl/
 */




