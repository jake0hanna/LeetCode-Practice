public class MaxProfit {
        public int maxProfit(int[] prices) 
        {
    
            /*
            iterate through array checking each, tracking best two days thus far and comparing
            
            my first attempt was just to iterate through each starting the second iteration on the day after
    
            the test case with an ungodly amount of numbers broke it as it was too slow
    
            I think the issue was I wrote my first version without realising that if the algorithm is only meant to
            detect differences in profit moving forward:
    
            then there is no reason to iterate through everything twice looking for the best two day combination,
            the only thing that matters is finding the biggest difference.
    
    
            */
    
    
            int lowestPrice = Integer.MAX_VALUE;
            int bestProfit = 0;
            int difference = 0;
    
    
            for(int i = 0; i < prices.length; i++)
            {
                //Find the lowest value day, much quicker than iterating through and calculating the difference
                if(prices[i] < lowestPrice)
                {
                    lowestPrice = prices[i];
                }
                difference = prices[i] - lowestPrice;
                
    
                //check the difference vs. previous lowest
                //then update if a higher profit has been found
                if(bestProfit < difference)
                {
    
                    bestProfit = difference;
    
    
                }
                
                
    
    
            }
    
          return bestProfit;
    
        }
    
    /*
            for(int buyDay = 0; buyDay < prices.length; buyDay++)
            {
    
                for(int sellDay = buyDay; sellDay < prices.length; sellDay++)
                {
    
                    if(prices[buyDay] < prices[sellDay] 
                    && difference < prices[sellDay] - prices[buyDay])
                    {
    
                        difference = (prices[sellDay] - prices[buyDay]);
    
                    }
    
    
                }
    
            }
        return difference
    */
      
    
    }