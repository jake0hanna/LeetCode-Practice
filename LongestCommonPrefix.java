class longestCommonPrefix 
{
    public String longestCommonPrefix(String[] strs)
    {

        int commonPrefixLength = 0;

        Arrays.sort(strs, new Comparator<String>(){

            public int compare(String string1, String string2)
            {

                return Integer.compare(string1.length(), string2.length());

            }

        });

        String checkstr = strs[0];

        //Iterate for each letter of the shortest string
        for(int j = 0; j < checkstr.length(); j++)
        {
            int commonPrefixTracker = 0;

            //Iterate for each string, comparing each character
            for(int i = 1; i<strs.length;i++)
            {
                if(checkstr.charAt(j) == strs[i].charAt(j))
                    commonPrefixTracker++;


            }
            if(commonPrefixTracker == strs.length -1)
            {
                commonPrefixTracker = 0;
                commonPrefixLength++;

            }
            else return checkstr.substring(0, commonPrefixLength);
            
        }
        
        return checkstr.substring(0, commonPrefixLength);
    }


}