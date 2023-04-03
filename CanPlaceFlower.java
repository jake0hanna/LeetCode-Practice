public class CanPlaceFlower {
    
        public boolean canPlaceFlowers(int[] flowerbed, int n) 
        {
            /*
    
               go one by one and update the array and stop if it hits n
    
            */
            if(flowerbed.length == 1 && flowerbed[0] == 0)
                return true;
    
            for(int i = 0; i < flowerbed.length; i++)
            {
                if((i-1 < 0))
                {
                    if(flowerbed[i] == 0 && flowerbed[i+1] != 1)
                    {
                        flowerbed[i] = 1;
                        n--;
    
                    }
    
                }
                else if(i+1 >= flowerbed.length)
                {
                    if(flowerbed[i] == 0 && flowerbed[i-1] != 1)
                    {
                        flowerbed[i] = 1;
                        n--;
    
                    }
                }
                else if(flowerbed[i] == 0 && flowerbed[i-1] != 1 && flowerbed[i+1] != 1)
                {
                    flowerbed[i] = 1;
                    n--;
    
                }
                
    
            }
            if(n <= 0)
                return true;
    
            return false;
            
    
        }
    }