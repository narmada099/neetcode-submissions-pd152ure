class Solution {
    public int maxProfit(int[] prices) {
       
        int maxProfit=Integer.MIN_VALUE;
        int minPrice=prices[0];
        for(int i=1;i<prices.length;i++){
            minPrice=Math.min(minPrice,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-minPrice);
        }
        return maxProfit==Integer.MIN_VALUE?0:maxProfit;
    }
}
