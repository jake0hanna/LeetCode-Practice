class Solution 
{
    public int findCenter(int[][] edges) 
    {

        HashMap<Integer, Integer> edgeTracker = new HashMap<>();

        for(int i = 0; i < edges.length; i++)
        {

            edgeTracker.merge(edges[i][1], 1, Integer::sum);

        }

        Map.Entry<Integer, Integer> maxEntry = Collections.max(edgeTracker.entrySet(), Map.Entry.comparingByValue());

        
        return maxEntry.getKey();

        
    }
}