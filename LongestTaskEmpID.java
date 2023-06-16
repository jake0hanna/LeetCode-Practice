class Solution 
{//2432
    public int hardestWorker(int n, int[][] logs) 
    {

        int id = logs[0][0];
        int largestGap = logs[0][1];
        int previousEndTime = logs[0][1];

        for(int i = 1; i < logs.length; i++)
        {
            if(largestGap < (logs[i][1] - previousEndTime))
            {
                id = logs[i][0];
                largestGap = logs[i][1] - previousEndTime;

            }
            else if(largestGap == (logs[i][1] - previousEndTime))
                id = Math.min(logs[i][0], id);

            previousEndTime = logs[i][1];            

        }

        return id;
        
    }
}