class Solution 
{
    public int[] sortArrayByParity(int[] nums) 
    {

        int[] boobs = new int[nums.length];
        int even = 0,
            odd  = nums.length -1;

        for(int i = 0; i < nums.length; i++)
        {

            if(nums[i] % 2 == 0)
            {
                boobs[even] = nums[i];
                even++;

            }
            else
            {
                boobs[odd] = nums[i];
                odd--;

            }


        }
        
        return boobs;
        
    }
}