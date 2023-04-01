class Solution 
{
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {

        /*
            [sr][sc] = pixel to start from
            replace pixels four directionally only of the same color as [sr][sc


        */

        //get color at starting position
        //while(color at vector(i) == spColor)
        //
        //iterate through all vectors,
        //if any location from the vectors = the original color,
        //replace the color and
        //repeat (iterate through all vectors...)


        //get color to replace
        int spColor = image[sr][sc];

        //dont paint if its the same color
        if (spColor == color) 
        {
            return image;
        }
        else //if not, paint it
        {
            image[sr][sc] = color;

        }

            for(DirectionVector dv : DirectionVector.values())
            { //Check each valid direction for a the StartingPositionColor
                if((sr + dv.getX() < image.length && sr + dv.getX() >= 0 && sc + dv.getY() < image[0].length && sc + dv.getY() >= 0))
                {
                    if(image[sr+dv.getX()][sc+dv.getY()] == spColor)
                    {   
                        image = floodFill(image, sr+dv.getX(), sc+dv.getY(), color);


                    }
                }


            }

        return image;

        
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