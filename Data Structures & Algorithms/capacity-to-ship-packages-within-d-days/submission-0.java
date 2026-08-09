class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int weight:weights){
            low=Math.max(low,weight);
            high+=weight;
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(weights,days,mid)){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}

boolean isPossible(int[] weights, int days,int k){
    int cap = 0;
    int daysUsed = 1;

    for(int weight : weights){

        if(cap + weight > k){
            daysUsed++;
            cap = weight;
        }
        else{
            cap += weight;
        }
    }

    return daysUsed <= days;
}