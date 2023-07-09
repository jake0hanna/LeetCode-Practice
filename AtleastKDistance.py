class Solution:
# 1437
    def kLengthApart(self, nums: List[int], k: int) -> bool:
        index = 0
        while(index < len(nums)):
            if(nums[index] == 1):
                distance = 1
                while(distance <= k):
                    if(index + distance < len(nums) and nums[index + distance] != 0):
                        return False
                    distance += 1
            index += 1
        return True
