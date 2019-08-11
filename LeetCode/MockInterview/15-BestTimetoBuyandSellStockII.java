/*
122 Best Time to Buy and Sell Stock II
*/

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        if(prices.length==0 || prices.length==1) return maxProfit;

        int buy = prices[0];
        for(int price : prices){
            if(buy < price){
                maxProfit += (price-buy);
            }
            buy = price;
        }
        return maxProfit;
    }
}/*
Time Complexity: O(N)
Space Complexity: O(1)
*/


// 121. Best Time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if(prices.length==0) return maxProfit;

        int buy = prices[0];
        for(int i=1; i<prices.length; i++){
            if(buy < prices[i]){
                maxProfit = Math.max(maxProfit, prices[i]-buy);
            }
            else if(buy > prices[i]){
                buy = prices[i];
            }
        }
        return maxProfit;
    }
}/*
Time Complexity: O(N)
Space Complexity: O(1)
*/
