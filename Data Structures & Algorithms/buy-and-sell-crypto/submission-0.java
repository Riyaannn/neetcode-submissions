class Solution {
    public int maxProfit(int[] prices) {
        int min=0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>=prices[i]){
                int diff=prices[j]-prices[i];
                min=Math.max(diff,min);
            }
            }
        }
        return min;
    }
}
