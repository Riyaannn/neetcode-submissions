class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack=new ArrayDeque<>();
        int n=temperatures.length;
        int[] ans=new int[n];
        
        for(int i=0;i<n;i++){
          
           // int curr=temperatures[i];
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int prevIndex=stack.pop();
                ans[prevIndex]=i-prevIndex;
            }
            stack.push(i);

        
        }
        return ans;
    }
}
