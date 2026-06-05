class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        int depth = 0;
        for(String log : logs) {
            if(log.equals("../")) {
                if(!stack.isEmpty())
                    stack.pop();
            }
            else if(!log.equals("./"))
                stack.push(log);
        }
        return stack.size();
    }
}