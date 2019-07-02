class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        length = len(nums)
        
        answer = [0]*length
        
        answer[0] = 1
        for i in range(1,length):
            answer[i] = answer[i-1]*nums[i-1]
        
        right = 1
        # the only important thing is seeing how
        # we use reversed in the process
        for i in reversed(range(length)):
            answer[i] =  answer[i] * right
            right *= nums[i]
        
        return answer
