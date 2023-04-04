class Solution 
{
    public int majorityElement(int[] nums) 
    {

        Arrays.sort(nums);

        HashMap<Integer, Integer> frequencyTracker = new HashMap<Integer, Integer>();
        //Track frequencies of each number as it is generally more efficient than iterating through

        for(int i = 0; i < nums.length; i++)
        {

            //put the active index's number in the tracker and/or plus one the frequency(value)
            frequencyTracker.put(nums[i], frequencyTracker.getOrDefault(nums[i], 0) + 1);

            if(frequencyTracker.get(nums[i]) > (nums.length/2))
                return nums[i];



        }

        return 0;

        
    }
}