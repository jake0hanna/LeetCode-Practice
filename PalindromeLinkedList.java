public /**
* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode() {}
*     ListNode(int val) { this.val = val; }
*     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
* }
*/

//Its bad but it works

class PalindromeLinkedList 
{
   public boolean isPalindrome(ListNode head) 
   {

       /*

           

       */

       List<Integer> list = new ArrayList<>();

       list.add(head.val);

       ListNode nextNode = head.next;
       
       while(nextNode != null)
       {
           list.add(nextNode.val);

           nextNode = nextNode.next;

       }

       for(int i = 0; i < list.size(); i++)
           if(list.get(i) != list.get(list.size()-i-1))
               return false;
       
       return true;
   }
} PalindromeLinkedList {
    
}
