class Solution {
    public int maxProfit(int[] prices) {
        int max_return = 0;
        int l=0,r=1;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                int rem = prices[r] - prices[l];
                max_return = (max_return < rem)?rem:max_return;
            }else{
                l=r;
            }
            r++;
        }
        
        
        return max_return;
    }
}
