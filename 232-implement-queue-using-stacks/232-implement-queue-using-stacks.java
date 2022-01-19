class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    //Push in queue means that element is added at the last
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        
        while(s1.size()!=1){
            s2.push(s1.pop());
        }
        int ans = s1.pop();
        while(s2.size()!=0){
            s1.push(s2.pop());
        }
        return ans;
    }
    
    public int peek() {
        while(s1.size()!=1){
            s2.push(s1.pop());
        }
        int ans = s1.peek();
        while(s2.size()!=0){
            s1.push(s2.pop());
        }
        return ans;
    }
    
    public boolean empty() {
        if(s1.size()==0)    return true;
        return false;
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