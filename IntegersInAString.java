class IntegersInAString
{
    public int numDifferentIntegers(String word) 
    {
        //replace each non numeral character with a space
        //truncate from the front of the string until a space is found
        //convert each substring to an integer and 
        //      create a new integer object in a hashSet
        //return the size of the hashset
        //      

        HashSet<Integer> set = new HashSet<Integer>();
        word.replaceAll("[^0-9]", " ");

        while(word.length() > 0)
        {
            String currentString = word.truncate(0, word.indexOf(' '));

            if(currentString.charAt(0) == ' ')
            {
                set.add(Integer.parseInt(currentString));
               
            }

        }

        return set.size();
        


    }
}