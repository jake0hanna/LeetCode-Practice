class ContainsDuplicateII
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        
        //index i = j
        //     &
        //abs(index i - j) <= k

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            
            if(map.containsKey(nums[i]) && i - map.get(nums[i]) <= k)
                return true;
            map.put(nums[i], i);


        }

        return false;
    }
}