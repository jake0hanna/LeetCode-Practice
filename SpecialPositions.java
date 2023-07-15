class Solution 
{
    public int numSpecial(int[][] mat) 
    {
        int m = mat.length;
        int n = mat[0].length;

        int[] rows = new int[m];
        int[] cols = new int[n];

        //get number of 1s in each row and column
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++)
            {
                if (mat[i][j] == 1) 
                {
                    rows[i]++;
                    cols[j]++;
                }
            }
        }

        //if row and column only have 1 then it is a "special position"
        int count = 0;
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (mat[i][j] == 1 && rows[i] == 1 && cols[j] == 1)
                {
                    count++;
                }
            }
        }

        return count;
    }
}
