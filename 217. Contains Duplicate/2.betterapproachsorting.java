/**
 * This approach employs sorting algorithm. Since comparison sorting algorithm like heapsort is known to provide O(n \log n)O(nlogn) worst-case performance, sorting is often a good preprocessing step. After sorting, we can sweep the sorted array to find if there are any two consecutive duplicate elements.
 */

// after sorting the duplicate elements will become consecutive
public boolean containsDuplicate(int[] nums) {
	// read about the sorting complexity in java here : https://stackoverflow.com/questions/22571586/will-arrays-sort-increase-time-complexity-and-space-time-complexity
	Array.sort(nums);
	for ( int i = 0; i < nums.length; i++) {
		if (nums[i] == nums[i+1]) return true;
	}
	return false;
}
/*
 Time complexity : O(nlogn)
 Space complexity : O(n)
 */
