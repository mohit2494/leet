class Solution:
    def search(self, nums: List[int], target: int) -> int:
        low = 0
        high = len(nums)-1
        
        while(low<high):
            mid = int((low+high)/2)
            if (nums[high]<nums[mid]):
                low = mid+1
            else:
                high = mid
        
        rot = low
        print(rot)
        low = 0
        high = len(nums)-1
        
        while(low<=high):
            mid = int((low+high)/2)
            realmid = int((mid+rot)%len(nums))
            print(mid,realmid)
            if target == nums[realmid]: 
                return realmid
            elif target < nums[realmid]:
                high = mid-1
            else:
                low = mid+1
                
        return -1
