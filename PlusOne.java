public class PlusOne
{
    public int[] plusOne(int[] digits) 
    {
        //iterate throught the array backwards checking if adding one would go over 9
        for(int i = digits.length-1; i >= 0; i--)
        if(digits[i]!=9)
        {
            digits[i] += 1;
            break;

        }//if its not the first row, change it to zero and let it check again
        else if(i != 0)
        {
            digits[i] = 0;

        }
        else // if it is the first row, remake the array with +1 digit size
        {
            digits = new int[digits.length+1];

            digits[0] = 1;

            for(int j = 1; j < digits.length; j++)
                digits[j] = 0;



        }
        
        return digits;
    }
}
