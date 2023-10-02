class Solution 
{//Min difference
    public List<List<Integer>> minimumAbsDifference(int[] arr) 
    {
        Arrays.sort(arr);

        int lowestDif = Integer.MAX_VALUE;

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                int difference = arr[j] - arr[i];
                
                if (difference < lowestDif) 
                {
                    lowestDif = difference;
                    list.clear();
                    list.add(Arrays.asList(arr[i], arr[j]));
                } 
                else if (difference == lowestDif) {
                    list.add(Arrays.asList(arr[i], arr[j]));
                }
            }
        }

        return list;

    }
}