class Solution 
{
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) 
    {
        List<Integer> nums1AsList = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> nums2AsList = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> nums3AsList = Arrays.stream(nums3).boxed().collect(Collectors.toList());
        
        Set<Integer> confirmed = new TreeSet<>();

        for(int i : nums1AsList)
        {
            if(nums2AsList.contains(i) || nums3AsList.contains(i))
            {
                confirmed.add(i);
            }
        }
        
        for(int i : nums2AsList)
        {
            if(!confirmed.contains(i) && nums3AsList.contains(i))
            {
                confirmed.add(i);
            }
        }
        
        return new ArrayList<>(confirmed);
    }
}
