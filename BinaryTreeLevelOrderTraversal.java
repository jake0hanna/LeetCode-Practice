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
class Solution {

    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> order = new ArrayList<>();

        //Null check
        if(root == null)
        {

            return order;

        }


        //queue for traversing, this instantiation is important for managing the active level
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty())
        {
            //resets each time a new node is traversed
            int size = queue.size();
            //Values of the current position
            List<Integer> currentNodes = new ArrayList();

            for(int i = 0; i<size; i++)
            {
                //remove a node and traverse its children
                TreeNode activeNode = queue.remove();

                currentNodes.add(activeNode.val);
                
                if(activeNode.left != null)
                {
                    queue.add(activeNode.left);

                }

                if(activeNode.right != null)
                {
                    queue.add(activeNode.right);

                }

            }

            order.add(currentNodes);

        }

        return order;

    }




/*
    List<List<Integer>> order = new ArrayList();
    /*
            Same general idea as the previous question, however, it wants a list of lists. 
            based on sample output this function doesnt have to worry about things not being properly sorted

            I initially wrote a similar method to the previous question however it traverses based on depth not level
            I feel like an easy solution to this is to track levels and add to each individual array based on the level
            In the discussion I saw a suggestion for using a queue
    

    public List<List<Integer>> levelOrder(TreeNode root)
    {
        if(root == null)
            return order;
        if(order.isEmpty())
        {
            ArrayList<Integer> rno = new ArrayList();
            rno.add(root.val);
            order.add(rno);  
        }

        ArrayList<Integer> nodeOrder = new ArrayList();

        if(root.left != null)
        {
            nodeOrder.add(root.left.val);

        }
        if(root.right != null)
        {
            nodeOrder.add(root.right.val);

        }
        if(!nodeOrder.isEmpty())
        {
            order.add(nodeOrder);
        }

        levelOrder(root.left);
        levelOrder(root.right);

        return order;
        
    }
*/
}

