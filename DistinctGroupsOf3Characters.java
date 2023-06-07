class Solution 
{

    public int countGoodSubstrings(String s)
    {

        int count = 0;

        char[] speed = s.toCharArray();

        for(int i = 1; i < s.length()-1; i++)
        {   
            if(speed[i-1] != speed[i] && speed[i+1] != speed[i] && speed[i-1] != speed[i+1])
                count++;

        }

        return count;


    }

    /*
        Turns out creating creating strings is very slow



    public int countGoodSubstrings(String s)
    {
        int count = 0;

        String centered;

        for(int i = 1; i < s.length()-1; i++)
        {   
            centered = s.substring(i-1, i+2);
            if(centered.charAt(0) != centered.charAt(1) && centered.charAt(1) != centered.charAt(2) && centered.charAt(0) != centered.charAt(2))
                count++;

        }

        return count;

        
    }*/
}