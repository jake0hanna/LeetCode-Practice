public class SingleNumber
{
    public int singleNumber(int[] nums) 
    {

        //Ive learned a lot from all this practice but the thing I know as most true is:
        //Sorting an array makes it so much easier to work with
        Arrays.sort(nums);


        for(int i = 0; i < nums.length; i+=2)
        {
            
            if(i+1 >= nums.length || nums[i] != nums[i+1])
                return nums[i];


        }

        return -1;

        
    }
}