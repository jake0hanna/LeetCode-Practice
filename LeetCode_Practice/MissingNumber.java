package LeetCode_Practice;

public class Solution
{
    public int findKthPositive(int[] arr, int k) 
    {
        int missingNumberCount = 0;
        int currentNumber = 1;
        int arrIndex = 0;

        while(missingNumberCount < k) 
        {
            if(arrIndex >= arr.length || currentNumber != arr[arrIndex]) {
                missingNumberCount++;
            } 
            else
            {
                arrIndex++;
            }

            if(missingNumberCount != k) 
            {
                currentNumber++; 
            }
        }

        return currentNumber;
    }
}
