class MinStack {
    Stack<Integer> minStack;
    Stack<Integer> stack;
    public MinStack() {
        minStack= new Stack<>();
        stack= new Stack<>();
    }
    
    public void push(int val) {

        if(minStack.isEmpty() || minStack.peek()>=val){
            minStack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        int curr= stack.pop();
        if(curr==minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
