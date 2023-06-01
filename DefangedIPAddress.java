class Solution 
{
    public String defangIPaddr(String address) 
    {
        
        StringBuilder defanged = new StringBuilder();

        for(char c : address.toCharArray())
        {
            if(c != '.')
                defanged.append(c);
            else
                defanged.append("[.]");
        }

        return defanged.toString();
        
    }
}