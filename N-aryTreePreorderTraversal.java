import java.util.List;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class BinaryTreeLevelOrderTraversal {

    List<Integer> order = new ArrayList();
    //list for tracking each traversals value, setting it outside of the method allows it to be independent of the recursive calls

    public List<Integer> preorder(Node root) 
    {

        //the goal is to iterate the tree in the proper order and return a list representing that
        //if the list
        //recursion should be easy for this type of problem
        //call the lowest value of each child first and then the other, repeating
        //using an iterator automatically handles null checks
        
        //its more effective to plan for passing null values
        if(root == null)
        {
            return order;
            
        }
        else
        {
            //add its value to the order list
            order.add(root.val);

            //iterate through its children which will add them 
            for(Node i : root.children)
            {
                preorder(i);

            }

            //Returning doesnt matter until the last call resolves
            return order;

        }
       


    }
}