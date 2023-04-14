class HappyNumber
{
    public boolean isHappy(int n) 
    {
        HashSet<Integer> seenSums = new HashSet<>();
        String s;
        int sum = n;

        while(sum != 1)
        {
            s = ""+sum;

            sum = 0; 

            for(int i = 0; i < s.length(); i++)
            {
                int x = (s.charAt(i) - '0');

                x *= x;

                sum += x;

            }

            

            if(seenSums.contains(sum))
                return false;

            seenSums.add(sum);

        }
        return true;
    }
}