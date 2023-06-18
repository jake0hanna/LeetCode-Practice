class Solution 
{//2706
    public int buyChoco(int[] prices, int money) 
    {
        Arrays.sort(prices);

        int currentMoney = money;
        int chocoBought = 0;

        for(int i = 0; i < prices.length; i++)
        {   
            if(prices[i] <= currentMoney)
            {
                currentMoney -= prices[i];
                chocoBought++;
            }

            if(chocoBought == 2)
                break;
        }

        if(chocoBought < 2)
            return money;

        return currentMoney;
    }
}