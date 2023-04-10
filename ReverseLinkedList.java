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
class ReverseLinkedList {
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
}
