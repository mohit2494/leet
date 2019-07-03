// using the same approach as in the java program
class Solution {
public:
    int maxProduct(vector<int>& nums) {
      int r = nums[0];
      for (int i = 1, imin = r, imax = r; i < nums.size(); i++) {
              if (nums[i]<0) {
		// interestingly swap is also a function in c++
		// reference : https://www.geeksforgeeks.org/swap-in-cpp/
                swap(imin,imax);
              }
              imax = max(nums[i],imax*nums[i]);
              imin = min(nums[i],imin*nums[i]);
              r = max(r,imax);
      }
      return r;
    }
};
