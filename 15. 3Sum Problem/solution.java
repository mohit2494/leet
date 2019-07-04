// let us try to break down the solution
// reference : https://leetcode.com/problems/3sum/discuss/7627/Share-my-Java-code-with-explanations
public class Solution {
	// returning a list of list of integers
	public List<List<Integer>> threeSum(int[] nums) {
		// we are sorting the integers so that we can skip
		// the equal elements all together
		Arrays.sort(nums);
		
		// declare a list of lists which is to be returned
		List<List<Integer>> ans = new ArrayList<>();
		
		for (int i = 0; i < nums.length - 2;) {
			for (int j = i+1, k = nums.length - 1; j<k) {
				// two pointers, one at the beg and one at the end
				// we'll move the pointer as per the sum
				sum = nums[i]+nums[j]+nums[k];
				if (sum>0) {
					--k;
				}
				else if (sum<0) {
					++j;
				}
				else {
					// we found an equal sum!
					// ***imp*** we how are inserting this list
					ans.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[k]));
					// now that we've used this element at j, we don't want it to be used
					// again
					int m = j+1;
					while(m < k && nums[j] == nums[m]) { ++m; }
					j = m;		
				}
			}
			// as we have considered this combination of i already
			// we'll skip the values equal to nums[i]
			int m = i+1;
			while(m<nums.length - 2&& nums[i]==nums[m]) {++m;}
			i = m;
		}
		return ans;
	}
}
