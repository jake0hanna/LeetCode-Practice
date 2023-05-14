class Solution 
{


    //I figured out the result>= 10 and result > 0 on my own after AI ripped apart my code

    public int addDigits(int num) 
    {
        int result = num;

        while (result >= 10) 
        {
            int sum = 0;

            while (result > 0) 
            {
                sum += result % 10;
                result /= 10;
            }

            result = sum;

        }

        return result;
    
    }

}



    /* too slow
    public int addDigits(int num) 
    {
        int result = 0;

        String number = ""+num;

        int[] nums = new int[number.length()];

        do
        {
            if(result != 0) 
                number = ""+(result);

            for(int i = 0; i < nums.length; i++)
            {
                nums[i] = number.charAt(i) - '0';;

            }

            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] != -1)
                {
                    result += nums[i];
                    nums[i] = -1;
                }

            }

            
        }while((""+result).length() > 1);

        return result;
        
        
    }*/
class Solution 
{

    public int addDigits(int num) 
    {
        int result = num;

        while (result >= 10) 
        {
            int sum = 0;

            while (result > 0) 
            {
                sum += result % 10;
                result /= 10;
            }

            result = sum;

        }

        return result;
    
    }

}



    /* too slow
    public int addDigits(int num) 
    {
        int result = 0;

        String number = ""+num;

        int[] nums = new int[number.length()];

        do
        {
            if(result != 0) 
                number = ""+(result);

            for(int i = 0; i < nums.length; i++)
            {
                nums[i] = number.charAt(i) - '0';;

            }

            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] != -1)
                {
                    result += nums[i];
                    nums[i] = -1;
                }

            }

            
        }while((""+result).length() > 1);

        return result;
        
        
    }*/
