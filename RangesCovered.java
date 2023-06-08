class Solution 
{
    public boolean isCovered(int[][] ranges, int left, int right) 
    {
        int total = Math.abs(left - right) +1;

        for(int i = left; i <= right; i++)
        {
            for(int j = 0; j < ranges.length; j++)
            {
                if (ranges[j][0] <= i && ranges[j][1] >= i) 
                {
                    total--;
                    break;
                }

            }
            

        }

        return total == 0;

        
    }
}