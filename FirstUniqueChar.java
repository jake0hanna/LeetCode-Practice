class Solution 
{
    public int firstUniqChar(String s) 
    {
        HashSet<Character> seen = new HashSet<Character>();

        for(int i = 0; i < s.length(); i++)
        {
            char b = s.charAt(i);

            for(int j = i+1; j < s.length(); j++)
            {
                if(seen.contains(b))
                    break;
                if(b == s.charAt(j)){
                    seen.add(b);
                    break;

                }

            }

            if(!seen.contains(b))
                return s.indexOf(b);

        }
        
        return -1;
        
    }
}