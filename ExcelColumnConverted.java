class Solution 
{
    public String convertToTitle(int columnNumber) 
    {

            /*
                for every 26 the first letter should increment 1

            */

        StringBuilder letters = new StringBuilder();

        while(columnNumber > 0) 
        {
            columnNumber--; 

            char letter = (char) ('A' + columnNumber % 26);

            letters.insert(0, letter); 

            columnNumber /= 26;
            
        }


        return letters.toString();

    }
}