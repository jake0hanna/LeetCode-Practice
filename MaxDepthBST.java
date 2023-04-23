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
class MaxDepthBST
{

    public int maxDepth(TreeNode root) 
    {

        if(root != null)
        {
            //Recursively traverse the whole tree,
             
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);


            //If either is null, return zero
            
            //For each depth will add one and return to the previous call and repeat to the top

            return Math.max(left, right) + 1;


        }
        else return 0;
        
    }
}