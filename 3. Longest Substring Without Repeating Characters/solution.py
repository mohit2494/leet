def lengthOfLongestSubstring(self, s):
    # result contains the length of the longest substring
    # initializing a tuple of values
    dictionary, result, start, = {}, 0 , 0 
    # lets loop over the string
    for index, char in enumerate(s):
        
        # when char already in dict
        if ch in dictionary:
            
            # check length from start of string to index
            # we'll be updating the start thereafter
            result = max(res,i - start)

            # we'll update the start to a point + 1
            # where the existing character is present
            start = max(start, dictionary[ch]+1)

        # updated dictionary
        dic[ch] = i
    
    # if the loop break, then we went till the end i.e. string length would be len(s) - dictionary[ch]
    # or it will be in res
    # lets check
    return max(res, length(s)-start)







