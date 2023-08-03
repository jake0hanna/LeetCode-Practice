import java.util.HashSet;

class Solution 
{
    public int maximumNumberOfStringPairs(String[] words) 
    {
        int pairs = 0;
        HashSet<Integer> usedIndices = new HashSet<>();

        for(int i = 0; i < words.length; i++)
        {
            if(!usedIndices.contains(i))
            {
                for(int j = i+1; j < words.length; j++)
                {
                    if(!usedIndices.contains(j))
                    {
                        String reversedJ = new StringBuilder(words[j]).reverse().toString();
                        if(words[i].equals(reversedJ))
                        {
                            pairs++;
                            usedIndices.add(i);
                            usedIndices.add(j);
                        }
                    }
                }
            }
        }

        return pairs;
    }
}
