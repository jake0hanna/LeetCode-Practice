class PerfectSquareBoolean 
{
    public boolean isPerfectSquare(int num) 
    {

        //Needed help here, ai pushed me in the correct direction

        if(num < 1)
            return false;

        for(int i = 1; num > 0; i+=2)
            num -= i;

        if(num == 0)
            return true;
        else return false;

    }
}