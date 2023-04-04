public class MissingNumbersInAnArray 
{

    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        Arrays.sort(nums);

        List<Integer> retList = new ArrayList<Integer>();

        HashSet<Integer> foundInts = new HashSet<Integer>();
        

        for(int num : nums)
        {

            foundInts.add(num);


        }

        for(int i = 0; i < nums.length; i++)
        {

            if(!foundInts.contains(i+1))
                retList.add(i+1);

        }


        /*                                          too slow
        for(int i = 0; i < nums.length; i++)
        {
            retList.add(i+1);
            retList.remove((Object)nums[i]);

        }
        */

        return retList;

        
    }


}
