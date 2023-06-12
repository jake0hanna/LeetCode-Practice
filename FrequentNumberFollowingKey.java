class Solution 
{//2190
    public int mostFrequent(int[] nums, int key) 
    {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length-1; i++)
        {

            if(nums[i] == key)
                map.merge(nums[i+1], 1, Integer::sum);


        }

        Map.Entry<Integer, Integer> maxEntry = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
        
        return maxEntry.getKey();

    }

}