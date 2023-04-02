class Solution 
{
    public int dominantIndex(int[] nums)
    {
        
            /* 
               2-50 numbers, 
               largest one is always unique, 
               each number will be between 0 and 100

               iteratively solvable by two loops, one to find the largest, one to compare
               I feel like a dynamic approach makes this easy
               
               I tried to use .max() but needing the location kinda ruins that



            */

        int highestNum = 0;
        int hnLoc = -1;

        for(int i = 0; i < nums.length; i++)
        {

            if(highestNum < nums[i])
            {
                highestNum = nums[i];
                hnLoc = i;

            }
            

        }

        for(int i = 0; i < nums.length; i++)
        {
            if(i != hnLoc)
                if(highestNum < nums[i]*2)
                {
                    return -1;
                
                }

          


        }

        return hnLoc;


    }
}