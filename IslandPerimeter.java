class IslandPerimeter
{
    public int islandPerimeter(int[][] grid)
    {

        /*  
            1 = island , 0 = water

            find perimeter of the island, CAN assume there is only 1 island

            total sides = row/col + 1

        */

        int perimeterLength = 0;

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++) 
            { // Iterate through the grid finding each island
                if(grid[i][j] == 1)
                {
                    //+4 for each tile
                    perimeterLength += 4;

                    //Check if theres a tile attached below or to the right of and remove perimeter accordingly
                    if(i > 0 && grid[i-1][j] == 1){
                        perimeterLength -= 2;
                    }
                    if(j > 0 && grid[i][j-1] == 1){
                        perimeterLength -= 2;
                    }
                }

            }  
        
        }

        return perimeterLength;

        
    }

}