class Solution 
{
    public int findSpecialInteger(int[] arr) 
    {
        HashMap<Integer, Integer> map =  new HashMap<>();

        for(int i = 0; i < arr.length; i++)
        {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);


        }

        Map.Entry<Integer, Integer> maxEntry = null;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
            {
                if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) 
                {
                    maxEntry = entry;
                }
            }

        return maxEntry.getKey();
        
    }
}