class Solution 
{
    public String truncateSentence(String s, int k) 
    {

        String[] split = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < k; i++)
        {

            sb.append(split[i]+" ");


        }

        return sb.toString().trim();
        
    }
}   