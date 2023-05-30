class Solution 
{
    public int numRookCaptures(char[][] board) 
    {

        /*
            find the R
            check in each direction until it finds a p or B
            if it finds p add 1 to counter

        */
        int x = -1, 
            y = -1;

        for(int i = 0; i < board.length; i++) 
        {
            for(int j = 0; j < board[i].length; j++) 
            {
                if(board[i][j] == 'R') 
                {
                    x = i;
                    y = j;
                    break;
                }
            }
            if (x != -1) 
            {
                break;
            }
        }

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int count = 0;

        for (int i = 0; i < 4; i++) 
        {
            int nx = x, 
                ny = y;

            while (true) 
            {
                nx += dx[i];
                ny += dy[i];

                if (nx < 0 || ny < 0 || nx >= board.length || ny >= board[nx].length || board[nx][ny] == 'B') 
                {
                    break;
                }

                if (board[nx][ny] == 'p') 
                {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}






