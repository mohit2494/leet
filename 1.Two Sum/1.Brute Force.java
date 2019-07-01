// we loop through the input array for each element x
// and we try to find another element which complements x
// for the target

// creating a function twoSum
// the function takes in input as the nums array 
// and the target

// The function returns an array of 2 sum pair
public int[] twoSum(int[] nums, int target) {
	// see that the array has length propert in java
	for (int i = 0; i < nums.length; i++) {
		for (int j = i+1; j<nums.length; j++) {
			if (nums[j] == target - nums[i]) {
				return new int [] {i,j};
			}
		}
	}

	// if no pair found, then we can throw an exception
	throw new IllegalArgumentException("No two sum solution");
}
		
// important follow through article regarding length vs length() - https://www.geeksforgeeks.org/length-vs-length-java/





