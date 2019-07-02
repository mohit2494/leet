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

/*

Definition
----------
   
Vectors are same as dynamic arrays with the ability to resize itself automatically when an element is inserted or deleted, with their storage being handled automatically by the container. Vector elements are placed in contiguous storage so that they can be accessed and traversed using iterators. In vectors, data is inserted at the end. Inserting at the end takes differential time, as sometimes there may be a need of extending the array. Removing the last element takes only constant time because no resizing happens. Inserting and erasing at the beginning or in the middle is linear in time.

Some important related functions 
--------------------------------

begin() – Returns an iterator pointing to the first element in the vector
end() – Returns an iterator pointing to the theoretical element that follows the last element in the vector
rbegin() – Returns a reverse iterator pointing to the last element in the vector (reverse beginning). It moves from last to first element
rend() – Returns a reverse iterator pointing to the theoretical element preceding the first element in the vector (considered as reverse end)
cbegin() – Returns a constant iterator pointing to the first element in the vector.
cend() – Returns a constant iterator pointing to the theoretical element that follows the last element in the vector.
crbegin() – Returns a constant reverse iterator pointing to the last element in the vector (reverse beginning). It moves from last to first element
crend() – Returns a constant reverse iterator pointing to the theoretical element preceding the first element in the vector (considered as reverse end)
*/



