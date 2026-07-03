class Solution {
    public int maxProfit(int[] prices) {
        var left = 0;
        var right = 1;
        var maxProfit = 0;
        while (right < prices.length) {
            var profit = prices[right] - prices[left];
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (prices[right] < prices[left]) {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
