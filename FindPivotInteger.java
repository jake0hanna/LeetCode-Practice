class Solution 
{//2485
    public int pivotInteger(int n) 
    {

        int totalSum = 0;
        int newSum = 0;

        for(int i = 1; i <= n; i++)
            totalSum += i;


        for(int i = 1; i <= n; i++)
        {
            totalSum -= i;
 
            if (newSum == totalSum)
                return i;
 
            newSum += i;
            
        }

        return -1;



        /*
                TOO SLOW
        
        for(int i = 0; i <= n; i++)
        {
            int leftSum = 0;

            for(int j = 1; j <= i; j++)
            {
                leftSum += j;

            }

            int rightSum = 0;

            for(int j = i; j <= n; j++)
            {
                rightSum += j;

            }

            if(leftSum == rightSum)
                return i;

        }

        return -1;

        */
    }
}