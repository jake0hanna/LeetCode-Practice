class Solution 
{
    public int maxDistance(int[] colors) 
    {
        Map<Integer, Integer> firstOccurrence = new HashMap<>();
        Map<Integer, Integer> lastOccurrence = new HashMap<>();

        int maxDistance = 0;


        for(int i = 0; i < colors.length; i++)
        {
            if(!firstOccurrence.containsKey(colors[i]))
                firstOccurrence.put(colors[i], i);
            
            lastOccurrence.put(colors[i], i);


        }

        for(Integer color1 : firstOccurrence.keySet()) 
        {
            for(Integer color2 : lastOccurrence.keySet()) 
            {
                if(!color1.equals(color2)) 
                {
                    maxDistance = Math.max(maxDistance, Math.abs(lastOccurrence.get(color2) - firstOccurrence.get(color1)));
                }
            }
        }

        return maxDistance;
       
    }
}