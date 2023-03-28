
public class main 
{
    public static void main(String[] args) 
    {
      
        
    
    }

    public int[] runningSum(int[] nums)
    {
        int[] arraySums = new int[nums.length];
        for(int i = 0; i < arraySums.length; i++)
        {
            for(int j = 0; j<=i; j++)
            {

                arraySums[i] += nums[j]; 

            }

        }

        return arraySums;

    }

    public int pivotIndex(int[] nums) 
    {

        int leftSum = 0, totalSum = 0, pivotIndex = 0;

        /*
            leftsum * 2 == totalsum - nums[pivotIndex]
            


        */


        for(int i = 0; i < nums.length; i++)
        {
            totalSum += nums[i];
        }

        if(leftSum == totalSum -nums[0])
            return 0;

        for(int i = 1; i < nums.length; i++)
        {
            
            leftSum += nums[i-1];

            if(leftSum * 2 == totalSum - nums[i])
                return i;

        }


        return -1;

        
    }

    public static boolean isIsomorphic(String s, String t)
    {
        
        public boolean isIsomorphic(String s, String t)
        {
    
            int[] sMap = new int[256],
                  tMap = new int[256];
    
            for(int i = 0; i < s.length(); i++)
            {
                if(sMap[s.charAt(i)] != tMap[t.charAt(i)])
                {
    
                    return false;
    
    
                }
                sMap[s.charAt(i)] = i + 1;
                tMap[t.charAt(i)] = i + 1;
    
    
            }
    
            return true;
    
    
        }
       

    }

    public boolean isSubsequence(String s, String t) 
    {

        int currentIndex = 0;

        for(int i = 0; i < t.length(); i++)
        {
           if(currentIndex == s.length())
            return true;

            if(s.charAt(currentIndex) == t.charAt(i))
            {
                currentIndex++;
            }


        }

        if(currentIndex == s.length())
            return true;
        
        return false;
        
        
    }
}
















