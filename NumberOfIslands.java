class NumberOfIslands
{   
    int islandsFound;

    public int numIslands(char[][] grid)
    {
        /*
            I feel like I could solve this problem with a similar method to the previous problem,

            iterate through replacing each 1 with a 2 to denote that it has been accounted for
            this would involve iterating the entire board



        */ 
        

        for(int width = 0; width < grid.length; width++)
        {
            for(int height = 0; height < grid[width].length; height++)
            {

                if(grid[width][height] == '1')
                {
                    replaceAllDirections(grid, width, height);
                    islandsFound++;
                }


            }


        }

        return islandsFound;


    }
    
    public void replaceAllDirections(char[][] grid, int x, int y)
    {
        if(grid[x][y] == '1')
        {
            grid[x][y] = '2';

            for(DirectionVector dv : DirectionVector.values())
            {
                if(isWithinBounds(grid, x+dv.getX(), y+dv.getY()))
                {
                    if(grid[x+dv.getX()][y+dv.getY()] == '1')
                    {
                        replaceAllDirections(grid, x+dv.getX(), y+dv.getY());

                    }
                }

            }

        }


    }

    public boolean isWithinBounds(char[][] grid, int x, int y)
    {

        if(x< grid.length && x >= 0 && y < grid[x].length && y >= 0)
            return true;
        else return false;


    }

}

enum DirectionVector
{

    Up(0,-1),
    Down(0,1),
    Left(-1,0),
    Right(1,0);

    int x, y;



    DirectionVector(int x, int y)
    {
        this.x = x;
        this.y = y;

    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }


}