class Solution 
{
    public int findMaxK(int[] nums) 
    {

        Arrays.sort(nums);

        int currentLargest = -1;

        for(int i = 0; i < nums.length; i++)
        {

            if(nums[i] < 0)
            {

                for(int j = nums.length-1; nums[j] > 0; j--)
                {

                    if(nums[i] * -1 == nums[j])
                    {

                        return nums[j];

                    }

                } 

            }

        }



        return currentLargest;
        
    }
}