import java.awt.Point;
import java.util.ArrayList;
class Solution 
{
    int[][] tempGrid;

    public List<List<Integer>> shiftGrid(int[][] grid, int k) 
    {
        tempGrid =  new int[grid.length][grid[0].length];
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        for(int i = 0; i < grid.length; i++)
        {
            list.add(new ArrayList<Integer>());

        }


        for(int x = 0; x < grid.length; x++)
        {

            for(int y = 0; y < grid[0].length; y++)
            {

                Point p = findLocation(k, x, y);
                tempGrid[(int)p.getX()]
                        [(int)p.getY()] 
                        = 
                        grid[x][y];


            }


        }



        for(int x = 0; x < grid.length; x++)
        {

            for(int y = 0; y < grid[0].length; y++)
            {

                (list.get(x)).add(tempGrid[x][y]);


            }


        }
        

        return list;
        
    }

    public Point findLocation(int k, int x, int y)
    {

        //If y + k > grid.length, then wrap around
        
        for(int i = 0; i < k; i++)
        {

            if(++y == tempGrid[0].length)
            {
                y = 0;

                if(++x == tempGrid.length)
                {
                
                    x = 0;

                }

            }

        }


        return new Point(x,y);


    }

}
























