class Solution 
{
    public boolean checkValid(int[][] matrix) 
    {

        HashSet<Integer> rowChecker = new HashSet<>();
        HashSet<Integer> columnChecker = new HashSet<>();

        for(int i = 0; i < matrix.length; i++)
        {

            for(int j = 0; j < matrix.length; j++)
            {
                rowChecker.add(matrix[i][j]);
                columnChecker.add(matrix[j][i]);

            }

            if(rowChecker.size() != matrix[0].length)
                return false;

            rowChecker.clear();

            if(columnChecker.size() != matrix[0].length)
                return false;

            columnChecker.clear();

        }


        return true;
        
    }
}