class Solution 
{
    public String thousandSeparator(int n) 
    {

        String nStr = Integer.toString(n);
        StringBuilder periodAdder = new StringBuilder();

        for(int i = nStr.length() - 1, count = 0; i >= 0; i--, count++)
        {
            periodAdder.append(nStr.charAt(i));

            if(count % 3 == 2 && i != 0)
            {
                periodAdder.append(".");
            }
        }

        
        return periodAdder.reverse().toString();
    }
}
