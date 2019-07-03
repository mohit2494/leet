# going by the java approach
class Solution:
    def maxProduct(self, nums: List[int]) -> int:

            # result variable
            r= nums[0]
            imin = nums[0]
            imax = nums[0]

            # lets loop
            for i in range(1,len(nums)):

                # swap if negative
                if nums[i] < 0 :

                    #swap manually
                    temp = imin
                    imin = imax
                    imax = temp

                imax = max(nums[i],imax*nums[i])
                imin = min(nums[i],imin*nums[i])
                r= max(r,imax)

            # return r
            return r
