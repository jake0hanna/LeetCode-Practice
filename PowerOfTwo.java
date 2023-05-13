class Solution
{
    public boolean isPowerOfTwo(int n) 
    {
        
        double d = n;

        while(d > 2)
        {

            d = d/2;


        }

        if(d == 2 || d == 1)
            return true;
        else return false;
        
    }
}