class Solution 
{//2644
    public int maxDivScore(int[] nums, int[] divisors) 
    {
        int maxCount = 0;
        int maxDiv = Integer.MAX_VALUE;

        Arrays.sort(divisors);

        for(int i = 0; i < divisors.length; i++)
        {
            int count = 0;

            for(int j = 0; j < nums.length; j++)
            {
                if(nums[j] % divisors[i] == 0)
                    count++;

            }

            if(maxCount < count)
            {
                maxCount = count;
                maxDiv = divisors[i];

            }
            else if(maxCount == count)
            {
                maxCount = count;
                maxDiv = Math.min(maxDiv, divisors[i]);
            }

        }

        return maxDiv;
        
    }
}