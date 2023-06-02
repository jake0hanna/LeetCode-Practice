class Solution 
{
    public String freqAlphabets(String s) 
    {

        StringBuilder result = new StringBuilder();

        int i = s.length() - 1;
        
        while (i >= 0) 
        {
            if (s.charAt(i) == '#') 
            {
                int number = Integer.parseInt(s.substring(i - 2, i));
                result.append((char) ('a' + number - 1));
                
                i -= 3;

            } 
            else 
            {
                int number = Integer.parseInt(s.substring(i, i + 1));
                result.append((char) ('a' + number - 1));

                i--;

            }
        }
        return result.reverse().toString();
    }
}
