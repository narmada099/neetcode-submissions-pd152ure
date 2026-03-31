class Solution {
    public boolean isValid(String s) {
        char[] ch= s.toCharArray();
        Stack<Character> stack= new Stack<>();
        for(char c :ch){
            switch(c){
             case ')':
              
                if(!stack.isEmpty() && stack.peek()=='('){
               stack.pop();
              }else{
                return false;
              }
              break;
             case ']':
            
              if(!stack.isEmpty() && stack.peek()=='['){
               stack.pop();
              }else{
                return false;
              }
              break;
             case '}':
             if(!stack.isEmpty() && stack.peek()=='{'){
               stack.pop();
              }else{
                return false;
              }
              break;
             default:
             stack.push(c);
            }
              
        }
        return stack.isEmpty();
    }
}
