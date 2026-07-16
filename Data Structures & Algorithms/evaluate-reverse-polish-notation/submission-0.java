class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack=new ArrayDeque<>();
        int ans=0;
        for(int i=0;i<tokens.length;i++){
            // if(stack.isEmpty()){
                if(tokens[i].equals("+")){
                    int right=stack.pop();
                    int left=stack.pop();
                    ans=left+right;
                    stack.push(ans);
                }
                else if(tokens[i].equals("*")){
                    int right=stack.pop();
                    int left=stack.pop();
                    ans=left*right;
                    stack.push(ans);
                }
                else if(tokens[i].equals("-")){
                    int right=stack.pop();
                    int left=stack.pop();
                    ans=left-right;
                    stack.push(ans);
                }
                else if(tokens[i].equals("/")){
                    int right=stack.pop();
                    int left=stack.pop();
                    ans=left/right;
                    stack.push(ans);
                }
                else{

                    stack.push(Integer.parseInt(tokens[i]));
                }

            }
        //}
        return stack.peek();
    }
}
