class Solution:
    def twoSum(self, num,target):
        
        # declare hash map for storing: complement -> key
        hash_map = {}
    
        # create and check for complement
        for index1,value in enumerate(num):

            # check if complement in hash map
            # then we can return
            complement = target-value

            if complement in hash_map:          
                index2 = hash_map[complement]
                if index1 != index2:
                    return index1, index2
            else:
                hash_map[value] = index1


