class MyQueue {
    Stack<Integer> stk2;
    Stack<Integer> stk1;

    public MyQueue() {
        stk1=new Stack<>();
        stk2=new Stack<>();        
    }
    
    public void push(int x) {
        int size=stk1.size();
        for(int i=0;i<size;i++){
            stk2.push(stk1.pop());
        }
        stk1.push(x);
        int s=stk2.size();
        for(int i=0;i<s;i++){
            stk1.push(stk2.pop());
        }

        
    }
    
    public int pop() {
        return stk1.pop();
        
    }
    
    public int peek() {
        return stk1.peek();
        
    }
    
    public boolean empty() {
        return stk1.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */