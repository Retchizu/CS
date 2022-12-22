class Solution {
    public int maxProfit(int[] prices) {
        int priceLength = prices.length;
        int buy = prices[0];
        int currentProfit = 0, bestProfit = 0;
        for(int i = 1; i < prices.length;i++){
            if(buy > prices[i]){ // find the smallest value in array
                buy = prices[i];
            }
            currentProfit = prices[i] - buy;
            bestProfit = Math.max(bestProfit, currentProfit); // return the best profit
        }
    return bestProfit;
    }
}
