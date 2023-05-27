class Solution 
{
    public int[][] flipAndInvertImage(int[][] image) 
    {

        for(int[] arr : image)
        {

            int i = 0;

            for(int j = arr.length -1; i < arr.length/2; i++, j--)
            {

                int temp = arr[i] ^ 1;
                arr[i] = arr[j] ^ 1;
                arr[j] = temp;

            }

            if (arr.length % 2 != 0) 
            {
                arr[i] ^= 1;
            }

        }

        return image;
        
    }
}