class LastStoneWeight
{
    public int lastStoneWeight(int[] stones)
    {

        if(stones.length <= 1)
            return stones[0];

        for(int i = stones.length-1; i >= 0;)
        {

            Arrays.sort(stones);

            if(stones[stones.length-2] == 0)
                return stones[stones.length-1];

            if(stones[i] == stones[i-1])
            {
                stones[i] = 0;
                stones[i-1] = 0;
                

            }
            else
            {
                stones[i] -= stones[i-1];
                stones[i-1] = 0;


            }

            


        }

        return stones[stones.length-1];
        
        
    }
}