class MinStack {
    public Stack<Integer> stack;
    public MinStack() {
       stack = new Stack<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Stack<Integer> tmp = new Stack<>();
        int minimum = stack.peek();
        while(!stack.isEmpty()) {
            minimum = Math.min(minimum,stack.peek());
            tmp.push(stack.pop());
        }
        while(!tmp.isEmpty())
            stack.push(tmp.pop());
        return minimum;    
        
    }
}
