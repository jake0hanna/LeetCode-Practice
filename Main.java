
public class main
{
    public static void main(String[] args) 
    {
      
        
    
    }

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public ListNode middleNode(ListNode head) 
{
    //876
    //I feel like it should need a +1 after the size/2 to account for rounding, but it works without.

    ListNode nextNode = head;
    int size = 0; 


    while(nextNode != null)
    {
        size++;

        nextNode = nextNode.next;

    }

    nextNode = head;
    size = (size/2);

    while(size > 0)
    {
        nextNode = nextNode.next;

        size--;

    }
    return nextNode;

    public ListNode reverseList(ListNode head) 
    {

        //206, probably the dumbest thing ever

        ListNode currentNode = head, 
                previousNode = null,
                nextNode = null;

        
        while(currentNode != null)
        {

            nextNode = currentNode.next; 
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
            

        }
        return previousNode;

        
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {

        /*
            21 - needed help


            Check if current lists are null
            if not null, 
                recursively merge the lower valued lists.next with the other current index
                return original instance of lower valued lists.next
            if either list is null, return the other 

        */
       
        if(list1!=null && list2!=null)
        {

            if(list1.val<list2.val)
            {
                list1.next = mergeTwoLists(list1.next,list2);
                return list1;

            }
            else
            {
                list2.next = mergeTwoLists(list2.next,list1);
                return list2;

            }

        }
        if(list1==null)
        {
            return list2;
        }
        return list1;
        

        
    }
    


    public int[] runningSum(int[] nums)
    {
        int[] arraySums = new int[nums.length];
        for(int i = 0; i < arraySums.length; i++)
        {
            for(int j = 0; j<=i; j++)
            {

                arraySums[i] += nums[j]; 

            }

        }

        return arraySums;

    }

    public int pivotIndex(int[] nums) 
    {

        int leftSum = 0, totalSum = 0, pivotIndex = 0;

        /*
            leftsum * 2 == totalsum - nums[pivotIndex]
            


        */


        for(int i = 0; i < nums.length; i++)
        {
            totalSum += nums[i];
        }

        if(leftSum == totalSum -nums[0])
            return 0;

        for(int i = 1; i < nums.length; i++)
        {
            
            leftSum += nums[i-1];

            if(leftSum * 2 == totalSum - nums[i])
                return i;

        }


        return -1;

        
    }

    public static boolean isIsomorphic(String s, String t)
    {
        
        public boolean isIsomorphic(String s, String t)
        {
    
            int[] sMap = new int[256],
                  tMap = new int[256];
    
            for(int i = 0; i < s.length(); i++)
            {
                if(sMap[s.charAt(i)] != tMap[t.charAt(i)])
                {
    
                    return false;
    
    
                }
                sMap[s.charAt(i)] = i + 1;
                tMap[t.charAt(i)] = i + 1;
    
    
            }
    
            return true;
    
    
        }
       

    }

    public boolean isSubsequence(String s, String t) 
    {

        int currentIndex = 0;

        for(int i = 0; i < t.length(); i++)
        {
           if(currentIndex == s.length())
            return true;

            if(s.charAt(currentIndex) == t.charAt(i))
            {
                currentIndex++;
            }


        }

        if(currentIndex == s.length())
            return true;
        
        return false;
        
        
    }
}
















