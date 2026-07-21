class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=nums2.length-1;i>=0;i--){
            int curr=nums2[i];
            while(!stack.isEmpty() && curr>=stack.peek()){
                stack.pop();                
            }
            if(stack.isEmpty()){
            map.put(curr,-1);
            }
            else{
                map.put(curr,stack.peek());
            }
            stack.push(curr);
        }
            int[] ans=new int[nums1.length];
            for(int j=0;j<nums1.length;j++){
                ans[j]=map.get(nums1[j]);
            }
        
        return ans;
    }
}