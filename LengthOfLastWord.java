class LengthOfLastWord
{
    public int lengthOfLastWord(String s) 
    {

        s = s.trim();

        if(s.length() <= 1)
            return 1;

        int index = s.lastIndexOf(' ');

        if(index < 0)
            return s.length();

        s = s.substring(index);

        return s.length()-1;

        
    }
}