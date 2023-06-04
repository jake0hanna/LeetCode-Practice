/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{

    int[] values;

    public TreeNode sortedArrayToBST(int[] nums) 
    {

        /*
            should find the middle and then add nodes

        */  

        if(values == null)
            values = nums;


        int mid = (0 + values.length -1) / 2;

        TreeNode head = new TreeNode(values[mid]);
        
        head.right = addNodes(mid+1, values.length-1);
        head.left = addNodes(0, mid-1);

        return head;

        
    }

    public TreeNode addNodes(int low, int high)
    {

        if(low > high)
            return null;

        int mid = (high + low) / 2; 

        TreeNode node = new TreeNode(values[mid]);

        node.right = addNodes(mid+1, high);
        node.left = addNodes(low, mid-1);

        return node;


        

    }


}