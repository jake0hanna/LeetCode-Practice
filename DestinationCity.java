class Solution 
{
    public String destCity(List<List<String>> paths) 
    {

        HashMap<String, Integer> count  = new HashMap<>();

        for(List<String> path : paths)
        {
            count.put(path.get(1), count.getOrDefault(path.get(1), 0));
        }

        for(List<String> path : paths)
        {
            count.remove(path.get(0));
        }

        return count.keySet().iterator().next();        
    }
}
