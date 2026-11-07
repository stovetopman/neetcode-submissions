class Solution {
    public int maxProfit(int[] prices) {
        int buy = 100;
        int max = 0;
        int n = prices.length;

        for (int i = 0; i < n;i ++) {
            buy = Math.min(buy, prices[i]);
            max = Math.max(max, prices[i] - buy);
        }
        return max;
    }
}
