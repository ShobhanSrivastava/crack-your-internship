class Solution:
    def minSteps(self, str : str) -> int:
        aSubstringCount = bSubstringCount = 0
        
        index = 0
        length = len(str)
        while index < length:
            foundA = foundB = False
            
            while index < length and str[index] == "a":
                index += 1
                foundA = True
                
            if foundA:
                aSubstringCount += 1
                
            while index < length and str[index] == "b":
                index += 1
                foundB = True
                
            if foundB: 
                bSubstringCount += 1
                
        return min(aSubstringCount, bSubstringCount) + 1
            
        



#{ 
 # Driver Code Starts
if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        str = (input())
        
        obj = Solution()
        res = obj.minSteps(str)
        
        print(res)
        

# } Driver Code Ends