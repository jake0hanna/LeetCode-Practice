public class MissingNumber
{
    public int missingNumber(int[] nums) 
    {

        // n(n+1)/2 sum of natural numbers
        int expectedTotal = nums.length*(nums.length+1)/2,
            actualTotal = 0;

        for(int i : nums)
            actualTotal += i;

        return expectedTotal - actualTotal;

        /* this involves iterating the array more than once and is functional, but very slow, 
        I think a better way would be to find what the sum of every digit between 0 and n
        and then find the actual sum of the array.

        The difference would be the missing number.


        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++)
        {

            if(nums[i] != i)
                return i;


        }

        return nums.length;
        */
    }
}