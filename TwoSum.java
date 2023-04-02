class TwoSum
{
    /*

        Brute force and more hashmap practice


    */
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer, Integer> indexLog = new HashMap<>();

        int comp = 0;

        for(int i = 0; i < nums.length; i++)
        {
            comp = target - nums[i];
            if(indexLog.containsKey(comp))
            {

                return new int[]{indexLog.get(comp), i};

            }

            indexLog.put(nums[i], i);



        }

        return null;


    }
    /*
 
    public int[] twoSum(int[] nums, int target) 
    {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {

                if(i != j && nums[i]+nums[j] == target)
                {
                    return(new int[]{i,j});

                }


            }

        }
        return new int[2];
        
    }
   
}
    */
}