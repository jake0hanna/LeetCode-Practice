class Solution 
{//2248
    public List<Integer> intersection(int[][] nums) 
    {
        int[] frequency = new int[1001];

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                    frequency[nums[i][j]]++;

            }

        }

        List<Integer> list =  new ArrayList<>();

        for(int i = 0; i < frequency.length; i++)
        {
            if(frequency[i] == nums.length)
                list.add(i);

        }

        return list;


    }
}