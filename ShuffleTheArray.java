class Solution 
{
    public int[] shuffle(int[] nums, int n) 
    {
        int[] returnVals = new int[nums.length];

        for(int i = 0; i < n; i++)
        {
            returnVals[2*i] = nums[i];
            returnVals[2*i + 1] = nums[i+n];
            
        }
        return returnVals;

    }
}
