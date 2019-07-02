# What is a counter - A counter is a container included in the collections module
# What is a container - Containers are objects that hold objects. They provide a way to access the contained objects and iterate over them.
# A counter is a subclass of dict.



# read more about Counter here - https://www.geeksforgeeks.org/counters-in-python-set-1/
from collections import Counter

class Solution:
    def containsDuplicate(self, nums):

        # counter creates a k,v pair dictionary
        # where k is the element in the nums array
        # and value is the frequency of the key
        d = Counter(nums)
            
        # see how we use items for counter
        for key,value in d.items():
           # means the key has frequency greater than 1
           if value > 1:
                return True
            
        return False

