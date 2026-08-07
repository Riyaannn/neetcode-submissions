class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        int ans=-1;
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(piles, h, mid)){
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
 boolean isPossible(int[] piles,int h,int k){
        int hr=0;
        for(int pile:piles){
            hr+=(pile + k - 1) / k;
        }
        return hr<=h;
    }
