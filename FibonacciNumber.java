class FibonacciNumber
{
    public int fib(int n) 
    {

        /*
            Not sure on how to manage data with recursion

        */

        if(n == 0)
            return 0;

        int x = 0,
            y = 1,
            sum = 1;



        for(int i = 1; i < n; i++)
        {

            sum = x+y;
            
            x = y;
            y = sum;

        }
        
        return sum;
        
        
    }
}