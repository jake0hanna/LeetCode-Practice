class WordPattern
{
    public boolean wordPattern(String pattern, String s) 
    {

        char[] c = pattern.toCharArray();
        String[] strs = s.split(" ");

        if(c.length != strs.length)
            return false;

        HashMap<Character, String> patternMap = new HashMap<Character, String>(); 

        for(int i = 0; i < c.length; i++)
        {
            if(!patternMap.containsKey(c[i]))
            {
                if(patternMap.containsValue(strs[i])) 
                {
                    return false;
                }
                patternMap.put(c[i], strs[i]);

            }
            else if(!patternMap.get(c[i]).equals(strs[i]))
                return false;
            
            

        }
        return true;
        

    }
}