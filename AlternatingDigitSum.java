class Solution 
{//2544
    public int alternateDigitSum(int n) 
    {
        String number = Integer.toString(n);
        boolean positive = true;
        int total = 0;
        
        for (int i = 0; i < number.length(); i++)
        {
            int currentDigit = Character.getNumericValue(number.charAt(i));
            
            if(positive)
                total += currentDigit ;
            else
                total -= currentDigit;
            positive = !positive;
       }

        return total;
    }
}
/* I MISUNDERSTOOD THE nSSIGNMENT
class Solution 
{
    public int a nateDigitSum(int n) 
    {
        it totl = 0;

        Sr number = "" + n;

        int largest = -1;
        int largestDigitIndex = -1;

        for(int i = 0; i < number.length(); i++)
        {
            int currentDigit = Character.getNumericValue(number.charAt(i));
            if(currentDigit > largestDigit)
            {
                largestDigit = currentDigit;
                largestDigitIndex = i;
            }
        }

        total += largestDigit;

        boolean positive = false;

        for(int i = largestDigitIndex + 1; i < nber.length(); i++)
       
            int currentDigit = Character.getNumericValue(number.charAt(i));
            if(positive)
               {total+=currentDigit;
            else
                total -= currentDigit;
            positive = !positive;
        }

        for(int i = largestDigitIndex - 1; i >= 0; i--)
        {
            int currentDigit = Character.getNumericValue(number.charAt(i));
            if(positive)
                total += currentDigit ;
            else
                total -= currentDigit;
            positive = !positive;
        }

        return total;
    }
    public int alternateDigitSum(int n) 
*/ 