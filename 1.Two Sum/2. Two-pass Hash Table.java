/*
We reduce the look up time from O(n) to O(1) by trading space for speed. A hash table is built exactly for this purpose, it supports fast look up in near constant time. I say "near" because if a collision occurred, a look up could degenerate to O(n) time. But look up in hash table should be amortized O(1) time as long as the hash function was chosen carefully.
*/

// using the same function characteristics then
public int[] twoSum(int[] nums, int target) {
	
	// create a new map for storing the number and its index
	Map<Integer, Integer> map = new HashMap<>();

	// we are looping through twice making it a 2 pass hashmap
        for (int i = 0; i<nums.length; i++) {
		map.put(nums[i],i);
	}

	for (int i = 0; i < nums.length; i++) {	
		int complement = target - nums[i];
		// check if complement present and complement not the same
		// as the current number
		if (map.containsKey(complement) && map.get(complement) != i) {
			// lets return the pair
			return new int[] {i,map.get(complement)};
		}
	}
	
	// if no solution was found, we will throw an exception
	throw new IllegalArgumentException("No two sum solution");
}

/*
 After notes :
	1. containsKey - https://www.geeksforgeeks.org/hashmap-containskey-method-in-java/
	2. get - https://www.geeksforgeeks.org/map-get-method-in-java-with-examples/
 * */
