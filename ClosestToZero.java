class Solution 
{
    public int findClosestNumber(int[] nums) 
    {
        int closestNum = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++)
        {
            if(Math.abs(nums[i]) < Math.abs(closestNum) || (Math.abs(nums[i]) == Math.abs(closestNum) && nums[i] > 0))
                closestNum = nums[i];
        }

        return closestNum; 
    }
}