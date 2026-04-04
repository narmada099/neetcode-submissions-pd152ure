class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        for(String s:tokens){
            if(!isOperator(s)){
                stack.push(Integer.valueOf(s));
            }else{
                int a=stack.pop();
                int b=stack.pop();
                int res= applyOperator(b,a,s);
                stack.push(res);
            }
        }
        return stack.peek();
    }

        
        


        boolean isOperator(String s){
            return s.equals("+") || s.equals("-")||s.equals("*")||s.equals("/");
        }

        int applyOperator(int a , int b , String operator){
            switch(operator){
                case "*":
                  return a*b;
                case "+":
                 return a+b;
                case "-":
                 return a-b;
                case "/":
                 return a/b;
            }
            return -1;
        }
    }

