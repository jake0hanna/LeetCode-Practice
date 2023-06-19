class Solution 
{//2574
    public int[] leftRightDifference(int[] nums)
    {
        int[] result = new int[nums.length];
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        leftSum[0] = 0;

        for(int i = 1; i < nums.length; i++)
        {
            leftSum[i] = nums[i - 1] + leftSum[i - 1];
        }

        rightSum[nums.length - 1] = 0;

        for(int i = nums.length - 2; i >= 0; i--)
        {
            rightSum[i] = nums[i + 1] + rightSum[i + 1];
        }

        for(int i = 0; i < nums.length; i++)
        {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return result;
    }
}
