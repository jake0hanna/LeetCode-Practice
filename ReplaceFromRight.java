class ReplaceFromRight
{
    public int[] replaceElements(int[] arr) 
    {
        //going right to left makes it so one less loop is needed and is more efficient

        int largestNum = -1;
        int tempNum;

        for(int i = arr.length-1; i >= 0; i--)
        {
            //we need to keep track of the largest number, NOT INCLUDING the current index
            //
            tempNum = arr[i];
            arr[i] = largestNum;

            if(largestNum < tempNum)
                largestNum = tempNum;


            



        }


        return arr;

    }

    /*
    public int[] replaceElements(int[] arr) 
    {
        for(int i = 0; i < arr.length; i++)
        {
            int largestNum = -1;
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[j] > largestNum)
                    largestNum = arr[j];
                            

            }

            arr[i] = largestNum;


        }

        return arr;
        
    }*/
}