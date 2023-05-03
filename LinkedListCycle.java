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

//SO DEDICATED I DID IT TWICE
 
 public class Solution 
 {
     public boolean hasCycle(ListNode head) 
     {
 
         if(head == null || head.next == null || head.next.next == null)
             return false;
 
         ListNode fast = head.next.next;
         ListNode slow = head.next;
 
         while (fast != null && fast.next != null) 
         {
             if (fast == slow) 
             {
                 return true;
             }
 
             fast = fast.next.next;
             slow = slow.next;
         }
         
         return false;
 
 
     }
 }
 
 
 
 
  /*
 public class Solution 
 {
     HashSet<ListNode> visited;
 
     public boolean hasCycle(ListNode head) 
     {
         if (visited == null) 
         {
             visited = new HashSet<ListNode>();
         }
 
         if (head == null) 
         {
             return false;
         }
 
         if (visited.contains(head)) 
         {
             return true;
         } 
         else 
         {
             visited.add(head);
         }
 
         return hasCycle(head.next);
     }
 }
 */