# python solution in O(n) time
class Solution:
    '''
        Checking out the -> operator in python. It basically marks the return function convention.
        https://stackoverflow.com/questions/14379753/what-does-mean-in-python-function-definitions
    '''
    def maxProfit(self, prices: List[int]) -> int:

        # check if the prices array is not empty
        if not prices:
            return 0
        # we generally use the snake case in python
        minimum_price, maximum_profit =  price[0], 0
        for i in range(1, len(prices)):
            minimum_price =  min(minimum_price, prices[i])
            maximum_profit =  max(maximum_profit, prices[i]-minimum_price)
        return mx
