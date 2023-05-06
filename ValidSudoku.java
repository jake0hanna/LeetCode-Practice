class Solution 
{

    public boolean isValidSudoku(char[][] board) 
    {

        HashSet<Character> found;
        char cell;

        // Rows
        for (int i = 0; i < board.length; i++) 
        {
            found = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) 
            {
                cell = board[i][j];

                if (cell != '.' && found.contains(cell)) 
                {
                    return false;
                } 
                else 
                {
                    found.add(cell);
                }
            }
        }

        // Columns
        for (int j = 0; j < board[0].length; j++) 
        {
            found = new HashSet<>();
            for (int i = 0; i < board.length; i++) 
            {
            
                cell = board[i][j];
                if (cell != '.' && found.contains(cell)) 
                {
                    return false;
                } 
                else 
                {
                    found.add(cell);
                }
            }
        }


        // 3x3 boxes
        for (int boxRow = 0; boxRow < 3; boxRow++) 
        {
            for (int boxCol = 0; boxCol < 3; boxCol++) 
            {
                found = new HashSet<>();

                for (int i = 0; i < 3; i++) 
                {
                    for (int j = 0; j < 3; j++) 
                    {
                        cell = board[boxRow * 3 + i][boxCol * 3 + j];
                        if (cell != '.' && found.contains(cell)) 
                        {
                            return false;
                        } 
                        else 
                        {
                            found.add(cell);
                        }
                    }
                }
            }
        }

        return true;
    }
}













