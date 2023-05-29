class Solution 
{

    public boolean judgeCircle(String moves) 
    {
        int x = 0, 
            y = 0;

        for (char move : moves.toCharArray()) 
        {
            if (move == 'U') y++;
            if (move == 'D') y--;
            if (move == 'L') x--;
            if (move == 'R') x++;
        }
        
        return x == 0 && y == 0;
    }


    /* Idk why this doesnt work
    public boolean judgeCircle(String moves) 
    {

        HashMap<Character,Integer> map = new HashMap<>();

        for(char s : moves.toCharArray())
        {
            map.put(s, map.getOrDefault(s, 0) + 1);

        }

        return (map.getOrDefault('U', 0) == map.getOrDefault('D', 0) && map.getOrDefault('R', 0) == map.getOrDefault('L', 0));


    }

    */
}
