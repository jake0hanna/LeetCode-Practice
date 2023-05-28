class Solution 
{
    public String reverseOnlyLetters(String s) 
    {

        StringBuilder reversed = new StringBuilder();

        /* 
            trying to utilize the "two pointer" approach I keep learning about

            start from both ends, when it finds two letters it swaps if its not a letter, it skips


        */

        char[] charArray = s.toCharArray();

       int i = 0;
       int j = s.length()-1;


        while(i < j)
        {

            if(!Character.isLetter(s.charAt(i)))
            {
                i++;
            }
            else if(!Character.isLetter(s.charAt(j)))
            {
                j--;
            }
            else
            {
                
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;

                i++;
                j--;


            }

            

        }

        return new String(charArray);

        
    }
}