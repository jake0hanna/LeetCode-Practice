
class Solution 
{

    public List<List<Integer>> threeSum(int[] nums) 
    {

        Arrays.sort(nums);

        List<List<Integer>> results = new ArrayList<>();


        for(int i = 0; i < nums.length; i++)
        {


            int left = i + 1;
            int right = nums.length - 1;


            while(left < right)
            {
                
                int potentialNum = nums[i] + nums[left] + nums[right];

                if(potentialNum == 0)
                {
                    results.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                }
                else if(potentialNum < 0)
                {
                    left++;

                }
                else
                {
                    right--;

                }


            }



        }

        results = results.stream()
               .distinct()
               .collect(Collectors.toList());

        return results;



    }


        /* iterate once for each number,
            once for each pair for each number, (i != j)
            then once looking for the inverse value of i + j (o != i|j)

            
        It works but its tooooooooooooooooo slow   



    public List<List<Integer>> threeSum(int[] nums) 
    {

        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) 
        {
            for (int j = i + 1; j < nums.length; j++) 
            { 
                for (int o = j + 1; o < nums.length; o++) 
                {

                    if (nums[i] + nums[j] == -nums[o]) 
                    {
                        List<Integer> potentialList = Arrays.asList(nums[i], nums[j], nums[o]);

                        Collections.sort(potentialList); 

                        boolean found = false;
                        for (List<Integer> list : results) 
                        {
                            if (list.equals(potentialList)) 
                            {
                                found = true;
                                break;
                            }
                        }

                        if (!found) 
                        {
                            results.add(potentialList);
                        }
                    }
                }
            }
        }

        return results;

    }

       */
}
