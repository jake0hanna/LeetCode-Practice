class ClimbingStairs2
{
    public int minCostClimbingStairs(int[] cost) 
    {

        /*
            I started along on my iterative method and got it to work pretty well but then noticed edge cases and faulty logic with how it found
            the best path, not knowing how else to proceed I asked gpt4 and it started talking about dynamic programming so heres my attempt
            with that approach

            I started with a loop iterating upwards but ended up with a similar problem to my previous attempt and
            after thinking about and researching dynamic programming, I realised it makes more sense to iterate downwards.

        */


            
            for(int i = cost.length - 3; i >= 0; i--)
            {
                cost[i] += Math.min(cost[i+1], cost[i+2]);
 
            }

            return Math.min(cost[0], cost[1]);

            

        /*
        int step = -1;
        int totalCost = 0;

        while(step <= cost.length)
        {
            if(step + 2 >= cost.length || step + 1 >= cost.length)
            {return totalCost;}

            if((step + 2 >= cost.length))
            {
                totalCost += cost[step+2];
                step += 2;

            }

            if(cost[step + 2] <= cost[step + 1])
            {
                totalCost += cost[step+2];
                step += 2;
            }
            else
            {   
                totalCost += cost[step+1];
                step++;

            }


        }

        return totalCost;     

        */   
        
    }
}