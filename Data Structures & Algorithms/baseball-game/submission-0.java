class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(String ops : operations) {
            if(ops.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }
            else if(ops.equals("D")) {
                stack.push(2 * stack.peek());
            }
            else if(ops.equals("C")) {
                stack.pop();
            }
            else 
                stack.push(Integer.parseInt(ops));
        }
        for(int score : stack)
            result += score;
        return result;    
    }
}