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
class ValidateBST
{

    // Max value test cases are fun

    public boolean isValidBST(TreeNode root)
    {
       return isValidBST(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);

    }
    public boolean isValidBST(TreeNode root, double minValue, double maxValue)
    {
        boolean check = true;
        
        //check each individual node rather than each nodes children
        if(root == null)
        {
            return true;
        }
        
        if(root.val <= minValue || root.val >= maxValue)
        {
            return false;

        }

        check = isValidBST(root.left, minValue, root.val);

        if(check)
        {
            check = isValidBST(root.right, root.val, maxValue);

        }
        return check;



    }

/*
    public boolean isValidBST(TreeNode root) 
    {
        boolean idk = true;

        /*

            BST validation: 
            - left must be lower than all keys above it,
            - right must be higher

            Depth first should work as each node can check its child nodes against it

            rewriting the method to include a min and max value 
            as there isnt enough available information to determine if a node fits with a node 2 above it



     
        if(root.left != null)
        {
            if(root.left.val < root.val)
            {
                
                idk = isValidBST(root.left);


            }
            else return false;
        }


        if(root.right != null)
        {
            if(idk && root.right.val > root.val )
            {
                
                idk = (isValidBST(root.right));


            }
            else return false;
        }

        
        return idk;


    }
       */
}












