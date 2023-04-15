public class KthLargestElement
{

    //PriorityQueues keep their values in natural order
    PriorityQueue<Integer> list;

    //So keep exactly k elements in the list, checking if the kth element(top) is greater than what would be added
    int k;


    public KthLargest(int k, int[] nums) 
    {

        this.k = k;

        list = new PriorityQueue<Integer>();

        //Attempt to add each
        for(int num: nums)
            add(num);


    }

    public int add(int val)
    {

        if (list.size() < k)
            list.offer(val);
        else if (list.peek() < val)
        {
            list.poll();
            list.offer(val);

        }

        return list.peek();


    }

}
   /*   TOO SLOW

    List<Integer> numbers;
    int k;

    public KthLargest(int k, int[] nums) 
    {

        this.k = k;

        numbers = new ArrayList<Integer>();

        for(int num : nums)
        {
            numbers.add(num);

        }

        Collections.sort(numbers);
        
    }
    
    public int add(int val)
    {

        int x = numbers.size()-1,
        uniqueNums = 0;

        numbers.add(val);

        Collections.sort(numbers);

        return numbers.get(numbers.size()-k);
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */