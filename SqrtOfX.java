public class Solution 
{
    public int mySqrt(int x) 
    {
        
        if(x == 0) return 0;

        int first = 1;
        int last = x;
        
        while(first <= last)
        {
            int mid = first + (last - first) / 2;

            if(x / mid >= mid) 
            {
                first = mid + 1;
            } 
            else 
            {
                last = mid - 1;
            }
        }

        return last;
    
        /*

            If x is 0, return 0.
            Initialize first to 1 and last to x.
            While first is less than or equal to last, do the following:
            a. Compute mid as first + (last - first) / 2.
            b. If mid * mid equals x, return mid.
            c. If mid * mid is greater than x, update last to mid - 1.
            d. If mid * mid is less than x, update first to mid + 1.
            Return last.

        

        if(x == 0)
            return 0;

        int first = 1;
        int last = x;
        int mid = 0;
        
        while(first <= last)
        {

            mid = first + (last - first) / 2;

            if(mid * mid == x)
                return mid;

            if(mid * mid > x)
            {
                last = mid - 1;

            }
            if(mid * mid < x)
            {
                first = mid + 1;

            }



        }

        return last;
       */ 
    }
} {
    
}
