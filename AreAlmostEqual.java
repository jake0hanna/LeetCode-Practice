class Solution 
{
    public boolean areAlmostEqual(String s1, String s2) 
    {

        /*
         *  Tracking the differences is important to find if swapping is valid or if they are already equal.
         * 
         */

        if (s1.length() != s2.length()) 
        {
            return false;
        }

        int count = 0;

        int first = -1, 
            second = -1;

        for (int i = 0; i < s1.length(); i++) 
        {
            if (s1.charAt(i) != s2.charAt(i)) 
            {
                count++;
                
                if (count > 2)
                {
                    return false;
                }
                if (first == -1) 
                {
                    first = i;
                } 
                else 
                {
                    second = i;
                }
            }
        }

        return count == 0 
        || 
        (count == 2 && s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first));
    }
}
