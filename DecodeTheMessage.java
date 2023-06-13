class Solution 
{//2325
    public String decodeMessage(String key, String message) 
    {

        StringBuilder decoded = new StringBuilder();

        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char c : key.toCharArray()) 
        {
            if (Character.isLowerCase(c) && !seen.contains(c)) 
            {
                sb.append(c);
                seen.add(c);
            }
        }

        key = sb.toString();

        for(int i = 0; i < message.length(); i++)
        {
            if(message.charAt(i) != ' ')
            {
                char replacement = (char) ('a' + key.indexOf(message.charAt(i)));

                decoded.append(replacement);

                
            }
            else
            {
                decoded.append(' ');
            }
            

        }
        

        return decoded.toString();

    }
}