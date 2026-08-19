class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1)
        {
            return 0;
        }
        int buy = prices[0];
        int ans=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<buy)
            {
                buy = prices[i];
            }
            int profit = prices[i]-buy;
            if(ans<profit)
            {
                ans =profit;
            }
        }
        return ans;
    }
}
