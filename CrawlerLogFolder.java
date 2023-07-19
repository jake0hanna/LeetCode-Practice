class Solution 
{//1598
    public int minOperations(String[] logs) 
    {
        int depth = 0;

        for(int i = 0; i < logs.length; i++)
        {
            if(logs[i].equals("../"))
            {
                if(depth > 0)
                {
                    depth--;
                }
            }
            else if(!logs[i].equals("./"))
            {
                depth++;
            }
        }

        return depth;
    }
}
