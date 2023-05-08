class Solution 
{
    public String largestNumber(int[] nums) 
    {

        String[] convertedArray = new String[nums.length];

        String result;
        
        /*

            Medium problem

            Its slower but I wanted to try using a Stream since Ive been studying for 1z0-819


        */

        for(int i = 0; i < nums.length; i++)
        {

            convertedArray[i] = ""+nums[i];
         

        }


        result = Arrays.stream(convertedArray)
                       .sorted(new Comparator<String>() {
                                    public int compare(String a, String b) {
                                        String order1 = a + b;
                                        String order2 = b + a;
                                        return order2.compareTo(order1);
                                    }
                        })
                       .collect(Collectors.joining());

        if(result.charAt(0) != '0')
            return result;
        else return "0";

    }
}