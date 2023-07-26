import java.util.HashMap;
import java.util.Map;

class Solution 
{//1399
    public int countLargestGroup(int n) 
    {
        Map<Integer, Integer> count = new HashMap<>();
        int max = 0;

        for (int i = 1; i <= n; i++) 
        {
            int key = 0, j = i;
            while (j > 0) 
            {
                key += j % 10;
                j /= 10;
            
            }

            count.put(key, count.getOrDefault(key, 0) + 1);
            max = Math.max(max, count.get(key));

        }

        int largestGroups = 0;

        for (int val : count.values()) 
        {
            if (val == max) 
            {
                largestGroups++;
            }
        }
        return largestGroups;
    }
}
