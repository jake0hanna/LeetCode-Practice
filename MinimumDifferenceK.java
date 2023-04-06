public class MinimumDifferenceK {

    public int minimumDifference(int[] nums, int k) 
    {

        Arrays.sort(nums);

        //Only need to find the lowest difference, dont need to return which numbers
        int lowestDif = Integer.MAX_VALUE;

        for(int i = 0; i <= nums.length - k; i++)
        {

            lowestDif = Math.min(lowestDif, nums[i + k - 1] - nums[i]);

        }
        
        return lowestDif;

        
    }
}

