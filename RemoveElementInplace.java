class RemoveElementInplace
{
    public int removeElement(int[] nums, int val) 
    {
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);

        int retVal = nums.length;
        int maxVal = nums[nums.length-1]+1;

        

        for(int i = 0; i < nums.length; i++)
        {

            if(nums[i] == val)
            {
                nums[i] = maxVal;
                retVal--;

            }

        }

        Arrays.sort(nums);

        return retVal;

        
    }
}