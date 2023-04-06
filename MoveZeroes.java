public class MoveZeroes
{
    public void moveZeroes(int[] nums) 
    {
        //thought of as a null value and then its simply sorting
        int amountOfNumbers = 0;

        for(int i = 0; i < nums.length; i++)
        {

            if(nums[i] != 0)
            {

                nums[amountOfNumbers] = nums[i];

                amountOfNumbers++;


            }


        }
        for(int i = amountOfNumbers; i < nums.length; i++)
        {

            nums[i] = 0;


        }
        
    }
}