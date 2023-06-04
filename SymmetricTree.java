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

    /*
     *  I needed help with this one, Im competent when it comes to traversing trees
     *  
     *  The way I was thinking about it was that I couldnt access more than 1 deep of both sides of the tree at the same time 
     *  Now I realise that as long as you pass the pointers all the way down, the pointers will be able to access the whole tree
     * 
     */

    public boolean isSymmetric(TreeNode root) 
    {

        return checkSym(root.right, root.left);
        
        
    }

    public boolean checkSym(TreeNode nodeA, TreeNode nodeB)
    {
        
        //Null checks (however if both are null then they are symmetrical)
        if(nodeA == null && nodeB == null)
        {
            return true;

        }
        
        if(nodeA == null || nodeB == null)
        {
            return false;

        }

        //Check if values are equal
        boolean equalValues = nodeA.val == nodeB.val;

        //Check if subtrees are symmetrical
        boolean AL_BR_sym = checkSym(nodeA.left, nodeB.right);
        boolean AR_BL_sym = checkSym(nodeA.right, nodeB.left);


        //If ALL conditions are met then the tree is symmetrical
        return equalValues && AL_BR_sym && AR_BL_sym;
        

    }

}