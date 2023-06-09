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
class Solution 
{
    public ListNode deleteDuplicates(ListNode head) 
    {
        if(head == null)
            return head;

        if(head.next != null && head.next.val != head.val)
        {

            deleteDuplicates(head.next);


        }
        else if(head.next != null && head.next.val == head.val)
        {

            head.next  = head.next.next;

            deleteDuplicates(head);


        }

        return head;

    }
}