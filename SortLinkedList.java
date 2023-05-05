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

    /*

        My default was to add each node to a sortable list
        sort based on value
        then reconnect the linkedlist nodes

        its not as fast as merge sort implementations


    */

    public ListNode sortList(ListNode head) 
    {
        if(head == null)
            return head;

        ListNode node = head;

        int size = 0;
 
        List<ListNode> list = new ArrayList<ListNode>();

        while(node != null)
        {
            list.add(node);
            node = node.next;

        }

        Collections.sort(list, (a, b) -> a.val - b.val);

        ListNode newHead = list.get(0);
        ListNode current = newHead;

        for (int i = 1; i < list.size(); i++) 
        {
            current.next = list.get(i);
            current = current.next;
        }

        head = newHead;
        current.next = null;


        return head;


    }
}









