public class RemoveDuplicates
{
    public int removeDuplicates(int[] nums) 
    {
        int nullVal = Integer.MIN_VALUE;

        for(int i = 1; i < nums.length; i++)
        {

            if(nums[i-1] == nums[i])
            {
                nums[i-1] = nullVal;


            }


        }
        int amountOfNumbers = 0;

        for(int i = 0; i < nums.length; i++)
        {

            if(nums[i] != nullVal)
            {

                nums[amountOfNumbers] = nums[i];

                amountOfNumbers++;


            }


        }
        for(int i = amountOfNumbers; i < nums.length; i++)
        {

            nums[i] = nullVal;


        }

        return amountOfNumbers;

        
    }
}