class Solution {
    public boolean hasDuplicate(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        //     }
        
        // return false;

        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int num:nums){
            if(map.containsKey(num)){
                return true;
            } 
            else{
                map.put(num,1);
            }
        }
        return false;
        
    }
}