// the best way to solve the maximum subarray problem
// is the kadane's algorithm. We iterate through the array
// capturing sum until now and maxium sum, and reset the current sum
// when it goes to negative. For all negative members in the array
// , the algorithm returns 0

// later on we will also a see a simple dynamic programming approach
// which will be much useful

/**
 * Initialize:
 *      max_so_far = 0
 *      max_ending_here = 0
 *
 * Loop for each element of the array
 *      a. max_ending_here = max_ending_here + a[i]
 *      b. if (max_ending_here < 0)
 *              max_ending_here = 0
 *      c. if (max_so_far < max_ending_here)
 *              max_so_far = max_ending_here
 * return max_so_far
 *
Simple idea of the Kadane’s algorithm is to look for all positive contiguous segments of the array (max_ending_here is used for this). And keep track of maximum sum contiguous segment among all positive segments (max_so_far is used for this). Each time we get a positive sum compare it with max_so_far and update max_so_far if it is greater than max_so_far
*/
int maxSubArraySum(int a[], int size) {
	int max_so_far = 0, max_ending_here = 0;
	for (int i = 0; i < size; i++) {
		max_ending_here = max_ending_here + a[i];
		if (max_ending_here < 0) {
			max_ending_here = 0;
		}
		else if (max_so_far < max_ending_here) {
			max_so_far = max_ending_here;
		}
	}
	return max_so_far;
}
