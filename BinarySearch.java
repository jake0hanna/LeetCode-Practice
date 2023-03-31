class BinarySearch {
    public int search(int[] nums, int target) 
    {

        /* read a blog post on the idea and structure and made my own attempt at it, I had everything functional except updating high and low in the loop */

        public int search(int[] nums, int target) 
        {
            int low = 0,
                high = nums.length-1,
                mid = 0;
    
            if(target < nums[0] || target > nums[high])
            {
    
                return -1;
            
    
            }
            
            while(low <= high)
            {
    
                mid = low + (high - low) / 2;
    
                if(target < nums[mid])
                {
                    high = mid -1;
    
                }
                else if(target > nums[mid])
                {
                    low = mid +1;
    
                }
                else 
                {
                    return mid;
                }
    
    
    
    
    
            }
    
            return -1;
            
    
    
          
        }


       
       /*  not binary search
       
       for(int i = 0; i < nums.length; i++)
        {

            if(nums[i] == target)
            {
                return i;
            }


        }
        return -1;
        
        */
    }
}