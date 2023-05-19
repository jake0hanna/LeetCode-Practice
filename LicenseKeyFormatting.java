class Solution 
{
    public String licenseKeyFormatting(String s, int k) 
    {

        /* 
            Find number of valid characters

            modulus by k, put remainder at the start

            write to new String 

        */

        s = (s.replaceAll("[^a-zA-Z0-9]", "")).toUpperCase();

        if(s.length() == 0)
            return "";

        int firstSize = s.length() % k;

        if(firstSize == 0)
            firstSize = k;

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < firstSize; i++)
        {

            result.append(s.charAt(i));         

        }
        
        for(int i = firstSize; i < s.length(); i++)
        {
    
            if ((i - firstSize) % k == 0)
            {
                result.append("-");
            }
            result.append(s.charAt(i));
        }

        return result.toString();
        
    }
}