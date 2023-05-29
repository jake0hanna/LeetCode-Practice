public class Solution 
{
    public boolean isMonotonic(int[] nums) 
    {

        if(nums.length == 1) 
            return true;

        boolean isIncreasing = nums[0] <= nums[nums.length - 1];

        for(int i = 1; i < nums.length; i++) 
        {
            if(isIncreasing && nums[i] < nums[i - 1]) 
                return false;
            if(!isIncreasing && nums[i] > nums[i - 1]) 
                return false;
        }
     
        return true;
    }

} {
    
}
