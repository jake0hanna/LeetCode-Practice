class Solution 
{
    public boolean isPathCrossing(String path) 
    {

         HashSet<Coordinate> visited =  new HashSet<>();
         int currentX = 0,
             currentY = 0;

        visited.add(new Coordinate(0,0));

         for(char c : path.toCharArray())
         {
            switch(c)
            {

                case 'N':
                    currentY += 1;
                    break;
                case 'S':
                    currentY -= 1;
                    break;
                case 'E':
                    currentX += 1;
                    break;
                case 'W':
                    currentX -= 1;
                    break;


            }

            Coordinate newPosition = new Coordinate(currentX, currentY);
            
            if(visited.contains(newPosition)) {
                return true;
            }
            
            visited.add(newPosition);
            

         }

         return false;
        
    }

    class Coordinate
    {

        int x, y;

        Coordinate(int x, int y)
        {
            this.x = x;
            this.y = y;

        }

        @Override
        public boolean equals(Object obj)
        {
            if(this == obj)
                return true;
            if(obj == null || getClass() != obj.getClass())
                return false;
            Coordinate that = (Coordinate) obj;
            return x == that.x && y == that.y;
        }

        @Override
        public int hashCode() 
        {
            return Objects.hash(x, y);
        }
    }
}