public class ArrangingCoins
{
    public int arrangeCoins(int n) 
    {
        long left=0,
            mid = 0,
            right = n,
            current = 0;

        while(left <= right)
        {

            mid = left + (right - left) /2;

            current = mid * (mid+1) /2;

            
            if(current == n)
                return (int)mid;
            else if(current > n)
                right = mid-1;
            else if(current < n)
                left = mid+1;


        }

        return (int)left -1;




    }   








    /* too slow
    public int arrangeCoins(int n) 
    {
        int rows = 0;
        int coins = n;
        int currentRowCoins = 0;

        for(int i = 1; i <= Integer.MAX_VALUE; i++)
        {// for each possible row

            for(int j = 1; j <= i; j++)
            {//remove the amount of coins = to the row
                currentRowCoins++;
                coins--;
                if(coins == 0)
                {
                    if(currentRowCoins > rows+1/2)
                        rows++;
                    return rows;
                }
                    
            }
            rows++;
            currentRowCoins = 0;


        }
        
        return rows;

        
    }
    */
} {
    
}
