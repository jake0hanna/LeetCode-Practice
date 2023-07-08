class Solution:
#1512 
    def numIdenticalPairs(self, nums: List[int]) -> int:
        totalIdenticalPairs = 0
        currentIndex = 0

        for x in nums:
            ind = currentIndex + 1
            while(ind < len(nums)):
                if(x == nums[ind]):
                    totalIdenticalPairs+=1
                ind+=1
            currentIndex+=1
        return totalIdenticalPairs
        