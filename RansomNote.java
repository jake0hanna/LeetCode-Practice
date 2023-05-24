class Solution 
{

    public boolean canConstruct(String ransomNote, String magazine) 
    {

        /*
            Turns out counting the character counts is faster and since Im here to practice...

        */

        int[] charCount = new int[26];

        char[] iterableChars = ransomNote.toCharArray();

        for (char c : iterableChars)
        {
            charCount[c - 'a'] ++;
        }

        iterableChars = magazine.toCharArray();

        for (char c : iterableChars) 
        {
            charCount[c - 'a'] --;
        }

        for (int count : charCount) 
        {
            if (count > 0) {
                return false;
            }
        }

        return true;



    }


    /* 
        if magazine contains character at ransomNote[i] then remove both and repeat
        (until ransomNote is empty or magazine does not contain the character)

    FIRST ATTEMPT:

    public boolean canConstruct(String ransomNote, String magazine) 
    {
        while(ransomNote.length() != 0 && magazine.contains(ransomNote.charAt(0)+""))
        {
            magazine = magazine.replaceFirst(ransomNote.charAt(0)+"" ,"");
            ransomNote = ransomNote.substring(1);
        }

        return ransomNote.length() == 0;
    }*/
}