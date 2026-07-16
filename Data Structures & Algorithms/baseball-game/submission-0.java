class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<operations.length;i++){
            String op=operations[i];
            if (op.equals("D")){
                int last=stack.peek();
                last=last*2;
                stack.push(last);
            }
            else if (op.equals("C")){
                stack.pop();
            }
            else if (op.equals("+")){
                    int last=stack.peek();
                    stack.pop();
                    int sec=stack.peek();
                    stack.push(last);
                    int sum=last+sec;
                    stack.push(sum);
            }
                else{
                    stack.push(Integer.parseInt(op));
                }


        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}