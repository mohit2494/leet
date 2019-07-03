// https://tinyurl.com/y5behu75 - a classic binary search question
/*
Explanation : 
-------------
Looking at subarray with index [start,end]. We can find out that if the first member is less thanthe last member, there's no rotation in the array. So we could directly return the first element in this subarray.
If the first element is larger than the last one, then we compute the element in the middle, and compare it with the first element. 
If value of the element in the middle is larger than the first element, we know the rotation is at the second half of this array. 
Else, it is in the first half in the array.
*/

// Time : O(logn)
#include <iostream>
using namespace std;
class Solution {
public:
    int findMin(std::vector<int> &num) {
        
        if(num.empty()) return 0;

        int low = 0;
        int high = num.size() - 1;
        int mid;

        while(low < high) {
            mid = (low + high)/2;
            if(num[low]>num[mid]) {
                low++;
                high=mid;
            }
            else if(num[mid] > num[high]) {
                low = ++mid; 
            }
            else
                high = mid; 
        }
        return num[low];
    }
};
