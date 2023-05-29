class Solution 
{

    //The faster way to do is to check that the lengths match and then make s = s + s and check if s contains goal
     
    public boolean rotateString(String s, String goal) 
    {

        //Try each variation of the stirng once
        for(int i = 0; i < s.length(); i++)
        {

            s = s.substring(1) + s.charAt(0);

            if(s.equals(goal))
                return true;


        }

        return false;
        

    }
}