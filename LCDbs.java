class Solution 
{
    public boolean hasGroupsSizeX(int[] deck) 
    {
        
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : deck) 
        {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        
        int gcd = -1;
        
        for (int freq : count.values()) 
        {
            if (gcd == -1) 
            {
                gcd = freq; 
            } 
            else 
            {
                gcd = gcd(gcd, freq); 
            }
        }

        
        return gcd > 1;


    }

    
    private int gcd(int a, int b) 
    {
        if (b == 0) 
            return a;

        return gcd(b, a % b);

    }

}



/* I misunderstood the problem, I didnt realise the groups were a lcd thing I thought they all needed to be exactly x
class Solution 
{
    public boolean hasGroupsSizeX(int[] deck) 
    {

        Arrays.sort(deck);

        int[] boobs = new int[deck[deck.length-1]];

        for(int i = 0; i < boobs.length; i++)
        {

            boobs[deck[i]]++;

        }

        for(int i = 0; i < boobs.length-1; i++)
        {

            if(boobs[i] != boobs[i+1]) 
                return false;


        }

        return true;
        
    }
}
*/