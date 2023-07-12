class Solution 
{//1408
    public List<String> stringMatching(String[] words) 
    {
        List<String> results = new ArrayList<String>();
        for(int i = 0; i < words.length; i++)
        {
            for(int j = 0; j < words.length; j++)
            {
                if(i != j)
                {
                    if(words[i].contains(words[j]))
                    {
                        if(!results.contains(words[j]))
                            results.add(words[j]);
                    }
                }
            }

        }

        return results;
        
    }
}