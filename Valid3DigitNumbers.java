class Solution 
{
    public int[] findEvenNumbers(int[] digits) 
    {

        ArrayList<Integer> validNumbers = new ArrayList<>();
        int[] frequency = new int[10];

        if(digits.length < 3)
            return null;

        for(int i = 0; i < digits.length; i++)
        {
            frequency[digits[i]]++;

        }

        for(int digit1 = 1; digit1 < 10; digit1++)
        {
            for(int digit2 = 0; digit2 < 10; digit2++)
            {
                for(int digit3 = 0; digit3 < 10; digit3++)
                {
                    int tempFreq[] = frequency.clone();
                    if(tempFreq[digit1]-- > 0 && tempFreq[digit2]-- > 0 && tempFreq[digit3]-- > 0) 
                    {
                        int number = (digit1 * 100) + (digit2 * 10) + digit3;
                        if(number % 2 == 0)
                            validNumbers.add(number);
                    }
                }
            }
        }



       int[] returnVals = new int[validNumbers.size()];

       for(int i = 0; i < returnVals.length; i++)
       {
           returnVals[i] = validNumbers.get(i);

       }

       return returnVals;
        
    }
}







