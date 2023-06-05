class Solution 
{
    public String maximumTime(String time) 
    {
        char[] charArr = time.toCharArray();

        if (charArr[0] == '?') 
        {
            if (charArr[1] <= '3' || charArr[1] == '?') 
            {
                charArr[0] = '2';
            } 
            else {
                charArr[0] = '1';
            }
        }

        if (charArr[1] == '?') 
        {
            if (charArr[0] == '2') 
            {
                charArr[1] = '3';
            } 
            else {
                charArr[1] = '9';
            }
        }

        if (charArr[3] == '?') 
        {
            charArr[3] = '5';
        }

        if (charArr[4] == '?') 
        {
            charArr[4] = '9';
        }

        return new String(charArr);
    }
}
