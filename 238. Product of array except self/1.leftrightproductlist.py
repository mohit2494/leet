# we construct a left array storing product of elements to the left of index i in the array
# we construct a right array storing product of elements to the right of index i in the array
# we then simply multiply in one iteration

# annotation to show return type of the function
class Solution : 
    def productExceptSelf(self, nums: List[int])->List[int]:
            
        # length of the array
        length = len(nums)

        L, R, answer = [0]*length, [0]*length, [0]*length
    
        # because first element has no element on the left
        L[0] = 1
    
        # talking about intializing the arrays
        for i in range(1, length):
            L[i] = nums[i-1] * L[i-1]
        
        R[length - 1] = 1

        # see how we use the reverse loop in real life
        for i in reversed(range(length-1)):
            R[i] = R[i+1] * nums[i+1]

        # lets calculate the answer
        for i in range(length):
            answer[i] = L[i]*R[i]
    return answer
