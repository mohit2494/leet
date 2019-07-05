class Solution:
    def countBits(self, num: int) -> List[int]:
        res = [0]*(num+1)
        res[0] = 0
        i = 1
        while i <= num:
            # tricky way of reminder by 2
            if (i&1) == 0:
                res[i] = res[i>>1] 
            else:
                res[i] = res[i-1] + 1
            i += 1
        return res
            
