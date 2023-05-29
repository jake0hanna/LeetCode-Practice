class RecentCounter
{

    /*
     *  I tried this with an ArrayList and then once it timed out I realized I needed to only track the most recent requests I used a different data structure
     * 
     * 
     */

    Deque<Integer> count;

    public RecentCounter() 
    {
        count = new LinkedList<Integer>();

    }
    
    public int ping(int t) 
    {
        count.add(t);

        
        while (!count.isEmpty() && count.peek() < t - 3000)
        {
            count.poll();
        }
        
        return count.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */