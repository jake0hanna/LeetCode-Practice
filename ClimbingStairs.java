class ClimbingStairs 
{
    public int climbStairs(int n) 
    {

        /*

            Generic rules will not solve this because the example is counting 1+2 and 2+1 as distinctive
            cause once we get to 5, 2+2+1, 2+1+2, and 1+2+2 will all count as individual steps
            
            memoization would work as each step is accessible in the same way the steps before it

            really that means its just fibonacci and I guess that means my same iterative approach should work
            just with different base cases and iteration variables
            
            based on the default test cases 2 seems like the starting point
            also this: 
            Constraints:
                  1 <= n <= 45



        */

        if(n == 0)
        {   
            return 0;

        }
        else if(n == 1)
        {
            return 1;

        }
        else if(n == 2)
        {
            return 2;

        }

        int twoPrevious = 2;
        int onePrevious = 1;
        int totalSteps = 0; 
        
        for(int i = 2; i < n; i++)
        {

            totalSteps = onePrevious+twoPrevious;
            onePrevious = twoPrevious;
            twoPrevious = totalSteps;


        }
        
        return totalSteps;

        
    }
}