class Solution 
{
    public boolean halvesAreAlike(String s) 
    {
        int aCount = 0;
        int bCount = 0;

        String a = s.toLowerCase().substring(0, s.length()/2);
        String b = s.toLowerCase().substring(s.length()/2);

        for(char c : a.toCharArray())
        {
            switch(c)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    aCount++;

            }
        }

        for(char c : b.toCharArray())
        {
            switch(c)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    bCount++;

            }
        }

        return aCount == bCount;
    }
}
