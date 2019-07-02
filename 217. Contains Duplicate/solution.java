/** The third and the best way to do this is to use a dynamic data structure that supports fast search and insert operations */

/*
From Approach #1 we know that search operations is O(n) in an unsorted array and we did so repeatedly. Utilizing a data structure with faster search time will speed up the entire algorithm.
There are many data structures commonly used as dynamic sets such as Binary Search Tree and Hash Table. The operations we need to support here are search() and insert(). For a self-balancing Binary Search Tree (TreeSet or TreeMap in Java), search() and insert() are both O(logn) time. For a Hash Table (HashSet or HashMap in Java), search() and insert() are both O(1) on average. Therefore, by using hash table, we can achieve linear time complexity for finding the duplicate in an unsorted array.
*/

public boolean containsDuplicate(int[] nums) {
	
	// important - read about java HashSet here - https://www.geeksforgeeks.org/hashset-in-java/
	Set<Integer> set = new HashSet<>(nums.length);
	for (int x: nums) {
		if (set.contains(x)) return true;
		set.add(x);
	}
	return false;
}

