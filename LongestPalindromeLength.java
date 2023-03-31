package LeetCode_Practice;
class LongestPalindromeLength 
{
    public static int longestPalindrome(String s) 
    {

        /*

            it just wants the length of the largest palidrome possible, so rather than constructing possible palindromes
            it should just check for basic rules such as: if theres a letter there is a odd amount of for the center,
                                                          or for even amounts of numbers to surround it.
            modulo
            my initial reaction is to once again double for loop but I feel like theres a better way as this would create 
            overlap that would need to be corrected. 

            I feel like I have to iterate through deleting each last instance of a letter and then keeping track of how many times;

            if I replace all instances of the first character found and then compare string length Ill be able to tell 
            how many characters were removed and then Ill be able to modulo that to determine groupings
            once I have groupings of single, odd, and even multiples of letters
            


        */

        int[] letterAmounts = new int[s.length()];
        int maxLength = 0;
        int newLength = s.length();
        boolean centerLetter = false;

        int groupingTracker = 0;
        //groupings
        while(s.length() != 0)
        {
           s = s.replaceAll(s.charAt(0)+"","");
           
           if(s.length() < newLength)
           {

               letterAmounts[groupingTracker] = (newLength - s.length());
                newLength = s.length();
                groupingTracker++;

           }


        }
        
        //print letterAmounts
        for(int i = 0; i < letterAmounts.length; i++)
        {
            System.out.println(letterAmounts[i]);

        }

        //sort through
        for(int i = 0; i < letterAmounts.length; i++)
        {
           if(letterAmounts[i] % 2 == 1)
           {//then odd

                if(centerLetter)
                {
                    maxLength += letterAmounts[i] - 1;
                }
                else
                {
                    maxLength += letterAmounts[i];
                    centerLetter = true;
                }

           }
           else
           {
                maxLength += letterAmounts[i];
           }

        }

        return maxLength;
        
    }
}