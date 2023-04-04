public class NextGreaterElement {


    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {

        // for each element in nums1 find the first greater number to the right of the same number in nums2

        //HashMap<Integer, Integer> indexMatch = new HashMap<Integer, Integer>();

        boolean foundIndex, 
                foundFirstGreater;

        int largestNum = 0,
            currentNum = 0;


        //Find index of each nums1 number
        for(int i = 0; i < nums1.length; i++)
        {//for each number in nums1

            largestNum = -1;
            foundIndex = false;
            foundFirstGreater = false;

            for(int j = 0; j < nums2.length; j++)
            {

                if(!foundIndex && nums1[i] == nums2[j])
                {
                    foundIndex = true;
                    currentNum = nums2[j];
                    
                }

                if(foundIndex && !foundFirstGreater)
                {
                    if(currentNum < nums2[j])
                    {
                        foundFirstGreater = true;
                        largestNum = nums2[j];


                    }

                }
              


            }
          
            nums1[i] = largestNum;


        }


        return nums1;
        
    }
}
