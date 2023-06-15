class Solution {
    //2678
    public int countSeniors(String[] details) 
    {
        int total = 0;

        for(String deet : details)
        {
            if(Integer.valueOf(deet.substring(11,13)) > 60)
                total++;

        }
        
        return total; 

    }
}