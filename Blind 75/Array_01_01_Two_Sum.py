class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if(len(s)<=1):
            return len(s)
        
        letters = list(s)
        longest="" #str
        
        for i in range(0,len(letters)):
            substr = ""
            for j in range(i,len(letters)):
                if letters[j] in substr:
                    break
                else:
                    substr+=letters[j]
            if len(longest)<len(substr):
                longest=substr
                
        return len(longest)
