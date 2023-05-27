class Solution 
{
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) 
    {
        
        /* 
            
            alice candies - toBob + fromBob
            = 
            bob candies - toAlice + fromAlice


            get total amount of candies

            track one sides individual amounts

            find the middle point by subtracting one total from the other and dividing by 2

            loop through the array again looking for a number in bobs array that matches the middle point


        */

        int aliceTotal = 0, 
            bobTotal = 0;

        HashSet<Integer> aliceSet = new HashSet<>();

        for (int i = 0; i < aliceSizes.length; i++) 
        {
            aliceTotal += aliceSizes[i];
            aliceSet.add(aliceSizes[i]);
        }

        for (int i = 0; i < bobSizes.length; i++) 
        {
            bobTotal += bobSizes[i];
        }

        int middle = (bobTotal - aliceTotal) / 2;

     
        for (int i = 0; i < bobSizes.length; i++) 
        {
            if (aliceSet.contains(bobSizes[i] - middle)) 
            {
                return new int[] {bobSizes[i] - middle, bobSizes[i]};
            }
        }

        return null;

        
    }
}