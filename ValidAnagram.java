class ValidAnagram
{
    public boolean isAnagram(String s, String t) 
    {

        if(s.length()!= t.length())
            return false;

        for(int i = 0; i < s.length(); i++)
        {
            t = t.replaceFirst(s.charAt(i)+"","");

        }

        if(t.length() > 0)
            return false;

        return true;
        
        
    }
}