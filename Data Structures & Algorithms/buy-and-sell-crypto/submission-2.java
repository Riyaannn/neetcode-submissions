class Solution {
    public int maxProfit(int[] prices) {
        int i=0,j=1;
        int max=0;
        while(i<j && j<prices.length){
            if(prices[i]>prices[j]){
                i=j;
                j++;
            }
            else{
                int diff=prices[j]-prices[i];
                max=Math.max(max,diff);
                j++;
            }
         
        }
        return max;
    }
}
