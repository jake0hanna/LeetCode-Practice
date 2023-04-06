class SearchInsertPosition
    public int searchInsert(int[] nums, int target) 
    {

        for(int i = 0; i < nums.length; i++)
        {

            if(nums[i] != target)
            {

                if(i-1 >= 0 && nums[i-1] < target && nums[i] > target)
                {

                    return i;

                    
                }
                else if(i == 0 && target < nums[i])
                {

                    return 0;


                }
                else if(i == nums.length-1 && target > nums[i])
                {

                    return nums.length;

                }
            

            }
            else
                return i;
            


        }

         
        return -1;
        
    }
}