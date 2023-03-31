public class LinkedListCycles {
    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
    public ListNode detectCycle(ListNode head) 
    {
        /*
            142 
            
            dont edit the list
            return the node at the pos of the start of the cycle, -1 if no cycle

            not sure on the optimal way to track if a node has already been visited,
            but I think keeping a list of each nodes visited and then checking the list

            won't let me use an arraylist so I found a description of how and now Im attempting to implement my own version without seeing any code

            

        */

        ListNode slowPointer = head, 
                 fastPointer = head;
        boolean cycleCheck = true,
                foundCycle = false;
        int slowPointerSteps = 0;


        while(cycleCheck)
        {
            if(fastPointer.next != null && fastPointer.next.next != null)
            {

                slowPointer = slowPointer.next;

                if(foundCycle && slowPointer == fastPointer)
                {

                    return slowPointer;

                }

                
                
                if(foundCycle)
                {
                    fastPointer = fastPointer.next;
                }
                else
                    fastPointer = fastPointer.next.next;

                if(slowPointer == fastPointer && !foundCycle)
                {
                    
                    foundCycle = true;
                    fastPointer = head;

                }
                if (foundCycle && slowPointer == fastPointer)
                {

                    return slowPointer;

                }
              
            }
            else
            {

                cycleCheck = false;

            }

        }
        
        return null;






    }
}


















