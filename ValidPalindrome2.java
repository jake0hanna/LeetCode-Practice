public class ValidPalindrome2
{
    public boolean validPalindrome(String s) 
    {
        int left = 0;
        int right = s.length() - 1;

        while (left < right)
        {
            if (s.charAt(left) != s.charAt(right)) 
            {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) 
    {
        while (left < right) 
        {
            if (s.charAt(left) != s.charAt(right)) 
            {
                return false;
            }

            left++;
            right--;
            
        }

        return true;
    }
}


    /* TOO SLOW
        if (s.length() <= 2)
        {
            return true;
        }

        //Check each character
        for(int i = 0; i < s.length(); i++)
        {
            String l = (s.substring(0, i) + s.substring(i+1, s.length()));

            boolean found = false;
            
            for (int j = 0; j < l.length() / 2; j++)
            {
                // Check char at j vs char at length-j
                if (l.charAt(j) != l.charAt(l.length() - j - 1)) 
                {
                    // Mismatch found, exit the loop
                    break;

                }
                
                // If the loop has reached the middle without a mismatch, return true
                if (j == (l.length() / 2) - 1) 
                {
                    return true;

                }
            }

        }
        
        return false;

    */
