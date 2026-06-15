class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        int max=0;
        for(int i=1;i<prices.length;i++)
        {
            profit=prices[i]-min;
            if(min>prices[i])
            {
                min=prices[i];
            }
            if(profit>0)
            {
                max+=profit;
                min=prices[i];
                profit=0;
            }
        }
        return max;
        
    }
}