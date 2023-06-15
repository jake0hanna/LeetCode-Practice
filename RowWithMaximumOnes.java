class Solution
{//2643
    public int[] rowAndMaximumOnes(int[][] mat) 
    {
        int mostRow = 0;
        int most1s = 0;

        for(int i = 0; i < mat.length; i++)
        {
            int current1s = 0;

            for(int j = 0; j < mat[i].length; j++)
            {
                if(mat[i][j] == 1)
                    current1s++;

            }

            if(current1s > most1s)
            {   
                mostRow = i;
                most1s = current1s;

            }


        }

        return new int[] {mostRow, most1s};
        
    }
}