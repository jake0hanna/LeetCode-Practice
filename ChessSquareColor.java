class Solution 
{
    public boolean squareIsWhite(String coordinates) 
    {

        /*
            there are no white cells with two even values

            it seems that the sum of the coordinates determines if its black or white

        */
        
        return (coordinates.charAt(0) + coordinates.charAt(1)) % 2 != 0;


        /*
            char col = coordinates.charAt(0); 
            int row = coordinates.charAt(1) - '0'; 

            return ((col - 'a' + 1) + row) % 2 == 0;

        /*
            if((coordinates.charAt(0) % 2 != 1 && coordinates.charAt(1) % 2 == 0)
            || (coordinates.charAt(1) % 2 != 1 && coordinates.charAt(0) % 2 == 0))
                return true;
            else return false;
        */
        
    }
}