class Solution 
{
    public int countSegments(String s) 
    {
        if (s == null || s.trim().equals("")) 
        {
            return 0;
        }

        String[] segments = s.trim().split("\\s+");

        return segments.length;
    }
}
