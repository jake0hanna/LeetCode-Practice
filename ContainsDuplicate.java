class ContainsDuplicate
{
    public boolean containsDuplicate(int[] nums)
    {
        //Was originally a hashmap but then I learned about hashsets
        HashSet<Integer> map =  new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++)
        {

            if(map.contains(nums[i]))
                return true;

            map.add(nums[i]);

        }

        return false;
        
    }
}