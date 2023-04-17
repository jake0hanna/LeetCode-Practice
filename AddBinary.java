class AddBinary
{
    public String addBinary(String a, String b)
    {
        StringBuilder num = new StringBuilder();

        int i = a.length()-1,
            j = b.length()-1,
            total = 0;

        /*

            iterate through and compare both strings,
            if there are:
                - two 0s: make that digit a 0 in the final num
                - 0 & 1: make that digit a 1 in the final num
                - two 1s: make that digit a 0 AND add one to the next digit

            If we track JUST the +1 it makes the logic messy
            however if we track the total for each digit, we can use it to track the overflow

        */


         while (i >= 0 || j >= 0) 
         {
            total /= 2; 
            // Reset total and carry over the remainder

            if (i >= 0) 
            {
                total += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) 
            {
                total += b.charAt(j) - '0';
                j--;
            }

            num.insert(0, total % 2);
        }

        // Check for any remaining carry
        if (total >= 2) 
        {
            num.insert(0, 1);
        }

        return num.toString();    
        
    }

}





