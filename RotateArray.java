class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        int[] newNums = new int[nums.length];
        k %= nums.length; 

        for(int i = 0; i < nums.length; i++)
        {
            newNums[(i+k)%nums.length] = nums[i];
        }

        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = newNums[i];
        }
        
    }






    /* Toooooooooo slow
    public void rotate(int[] nums, int k) 
    {

        int temp;

        for(int i = 0; i < k; i++)
        {

            temp = nums[nums.length-1];

            for(int j = nums.length-1; j > 0; j--)
            {
 
                nums[j] = nums[j-1];


            }

            nums[0] = temp;

        }
        
    }
    */
}