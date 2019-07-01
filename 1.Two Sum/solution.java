/*
 * The best solution for 2 sum problem in java can do it in 1 pass
 * While we iterate and insert elements into the table , we can 
 * check whether the complement exists or not.
 */

import java.util.Map;
import java.util.HashMap;

/**
 * Function calculates 2 sum
 * returns indexes of numbers which
 * evaluate to the target sum
 */
public int[] twoSum(int[] nums, int target) {
	
	// declare and initialize map
	Map<Integer, Integer> map = new HashMap<>();
	
	// only 1 pass needed this time
	for (int i = 0; i < nums.length; i++) {
		
		int complement = target - nums[i];
		
		// remember we are ommiting the statement
		// which checked the existence of same number
		// because we haven't inserted the number yet
		if (map.containsKey(complement)) {
			return new int[] { map.get(complement), i };
		}
		else {
			map.put(nums[i],i);
		}
	}
	return new int[] {-1,-1};
}
