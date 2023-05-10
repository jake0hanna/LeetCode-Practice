class Solution 
{
    public int findDuplicate(int[] nums) 
    {

        HashSet<Integer> bingbong = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++)
        {

            if(bingbong.contains(nums[i]))
                return nums[i];
            else bingbong.add(nums[i]);


        }

        return -1;

        /*
            there is an easy iterative solution but its too slow

    

        boolean found = false;

        //iterate for each number
        for(int i = 1; i < nums.length; i++)
        {

            for(int j = 0; j < nums.length; j++)
            {

                if(nums[j] == i)
                {
                    if(found)
                        return i;
                    else
                        found = true;

                }


            }
            found = false;

            

        }

        return -1;
    */
        
    }
}