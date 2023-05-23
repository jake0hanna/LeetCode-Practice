public class LemonadeChange {
    
}
class Solution 
{
    public boolean lemonadeChange(int[] bills) 
    {

        /* Doesnt account for different options being  better based on whats coming up but w/e*/

        int fives = 0,
            tens = 0;

        for(int i = 0; i < bills.length; i++)
        {        
            switch(bills[i])
            {
                case 5:
                    fives++;
                break;

                case 10:
                    if(fives < 1)
                        return false;
                    fives--;
                    tens++;

                break;

                case 20:
                    if(tens > 0 && fives > 0) 
                    {
                        tens--;
                        fives--;
                    } else if(fives > 2) 
                    {
                        fives -= 3;
                    } else 
                    {
                        return false;
                    }
                break;  
            }
        }
        
        return true;
        
    }
}

