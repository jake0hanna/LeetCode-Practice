class StackFrom2Queues
{
    Queue<Integer> mainQueue, 
          orgQueue;
    int size;

    public MyStack() 
    {

        mainQueue = new LinkedList();
        orgQueue = new LinkedList();
        
    }
    
    public void push(int x) 
    {
        for(int i = mainQueue.size(); i > 0 ; i--)
        {
            orgQueue.add(mainQueue.remove());

        }


        mainQueue.add(x);

        size = orgQueue.size();


        for(int i = 0; i < size; i++)
        {
        
            mainQueue.add(orgQueue.remove());


        }

    }
    
    public int pop() 
    {
        return mainQueue.remove();

        
    }
    
    public int top() 
    {
        return mainQueue.peek();
    }
    
    public boolean empty() 
    {
        return mainQueue.isEmpty();
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */