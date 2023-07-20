class Solution 
{//1544
    public String makeGood(String s) 
    {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) 
        {
            int currentSize = sb.length();
            
            //If the current character does not equal the character at the current index BUT it does when both are set to lowercase
            // then we know that they werent originally the same but are the same after making one of them lowercase
            if (currentSize != 0 && 
                sb.charAt(currentSize - 1) != c &&
                Character.toLowerCase(sb.charAt(currentSize - 1)) == Character.toLowerCase(c)) 
                {
                sb.deleteCharAt(currentSize - 1);
            } 
            else 
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
