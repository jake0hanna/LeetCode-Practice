class Solution 
{
    public boolean canBeIncreasing(int[] nums) 
    {
        int removedNum = -1;

        for(int i = 0; i < nums.length - 1; i++) 
        {
            if(nums[i] >= nums[i + 1]) 
            {
                if(removedNum != -1) 
                    return false;
                    
                removedNum = i;

                if(i > 0 && nums[i+1] <= nums[i-1]) 
                {
                    nums[i+1] = nums[i];

                }
            }
        }

        return true;
    }
}
