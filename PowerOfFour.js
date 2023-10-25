/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfFour = function(n) 
{
    if(n/4 == 4 || n == 1)
    {
        return true; 
    }
    else if(n == 0 || n == 2 || n == 3)
    {

        return false;

    }
    else
    {
        return isPowerOfFour(n/4);

    }
    
};