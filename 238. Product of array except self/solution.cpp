// Time : O(n)
// Space : O(1)

class Solution {
	public:
		// returning back an integer vector
		vector<int> productExceptSelf(vector<int>& nums) {
			if (nums.empty()) {
                                // returning an empty vector
                                return {};
                        }

                        // we will only use 1 answer array which is allowed
                        // lets see how we initialize a new vector
                        vector<int> answer(nums.size());

                        // as we don't have any left element
                        // we will consider the left product 
                        // to be 1
                        answer[0] = 1;
                        for (int i = 1; i < nums.size(); ++i) {
                                answer[i] = answer[i-1] * nums[i-1];
                        }  
                        
                        // we will now iterate through the same vector
                        int right = 1;
                        for (int i = nums.size()-2; i >=0 ; i--) {
                               right *= nums[i+1];
                               answer[i] = answer[i]*right;
                        }
                            
                        // return the answer vector
                        return answer;	
		}
}
