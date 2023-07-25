class Solution 
{//1394
    public int findLucky(int[] arr) 
    {

        int luckyNumber = -1;

        int found = 0;

        Arrays.sort(arr);

        for(int currentNum = 1; currentNum <= arr[arr.length-1]; currentNum++)
        {
            for(int i = 0; i < arr.length; i++)
            {   
                if(arr[i] == currentNum)
                {
                    found++;

                }

            }

            if(found == currentNum)
            {
                luckyNumber = (currentNum);
            }

            found = 0;

        }

        return luckyNumber;
        
    }
}