class ArrayConcatenation
{
    public int[] getConcatenation(int[] nums) 
    {

        int length = nums.length*2;
        int[] ans = new int[length];

        for(int i = 0; i < nums.length; i++)
        {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];


        }

        return ans;


    }
}