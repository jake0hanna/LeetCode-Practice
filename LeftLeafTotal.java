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
    private List<Integer> leftLeaves = new ArrayList<>();

    public int sumOfLeftLeaves(TreeNode root) 
    {
        dfs(root, false);

        return leftLeaves.stream().mapToInt(Integer::intValue).sum();

    }

    private void dfs(TreeNode node, boolean isLeft) 
    {
        if (node == null) return;

        if (isLeft && node.left == null && node.right == null) 
        {
            leftLeaves.add(node.val);
        }

        dfs(node.left, true);
        dfs(node.right, false);
        
    }
}