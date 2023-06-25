class Solution 
{//1935
    public int canBeTypedWords(String text, String brokenLetters) 
    {
        String[] split = text.split(" ");
        char[] badLetters = brokenLetters.toCharArray();

        int result = 0;

        for(int i = 0; i < split.length; i++)
        {
            boolean check = false;

            for(int j = 0; j < badLetters.length; j++)
            {
                if(split[i].contains(""+badLetters[j]))
                {
                    check = true;
                    break;

                }
                    
            }
            if(!check)
            {
                result++;
                
            }

        }

        return result;

    }
}