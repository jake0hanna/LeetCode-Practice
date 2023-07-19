class Solution 
{//1588
    public int sumOddLengthSubarrays(int[] arr)
    {
        int total = 0;
        int n = arr.length;
        for (int length = 1; length <= n; length += 2) 
        {
            for (int i = 0; i <= n - length; i++) 
            {
                total += sum(arr, i, i + length);
            }
        }
        return total;
    }

    private static int sum(int[] arr, int start, int end) 
    {
        int total = 0;
        for (int i = start; i < end; i++)
        {
            total += arr[i];
        }
        return total;
    }
}