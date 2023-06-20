public class Solution 
{//2169
    public int countOperations(int num1, int num2) 
    {
        int total = 0;
        
        while (num1 != 0 && num2 != 0) 
        {
            if (num1 == 1) 
            {
                total += num2;
                break;
            }
            
            if (num2 == 1) 
            {
                total += num1;
                break;
            }

            if (num1 >= num2) 
            {
                num1 -= num2;
            } 
            else 
            {
                num2 -= num1;
            }
            
            total++;

        }

        return total;

    }
}
