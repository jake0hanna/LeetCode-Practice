public class InvertBinaryTree {
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


    TreeNode trueRoot;

    public TreeNode invertTree(TreeNode root) 
    {
        if(trueRoot == null)
            trueRoot = root;

        if(root != null)
        {

             TreeNode storeLeft = root.left;
             TreeNode storeRight = root.right;

             root.right = null;
             root.left = null;

            if(storeRight != null)
            {

                root.left = storeRight;
                invertTree(root.left);


            }
            

            if(storeLeft != null)
            {

                root.right = storeLeft;
                invertTree(root.right);

            }
            


        }

        return trueRoot;
        
    }

}
















