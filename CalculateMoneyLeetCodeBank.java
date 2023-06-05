class Solution 
{
    public int totalMoney(int n) 
    {
        int mondays = 1;
        int days = 0;
        int totalSaved = 0;

        for(int i = 0; i < n; i++) 
        {
            switch(i % 7) 
            {
                case 0:  
                    totalSaved += mondays;
                    days = mondays;
                    mondays++;
                    break;
                default:
                    days++;
                    totalSaved += days;
            }
        }
        return totalSaved;
    }
}
