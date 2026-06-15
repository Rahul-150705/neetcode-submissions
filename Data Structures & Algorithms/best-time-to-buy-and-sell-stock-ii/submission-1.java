class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=prices[0];
        int max=0;
        for(int num:prices)
        {
            if(num<min)
            {
                min=num;
            }
            profit=Math.max(profit,num-min);
            if(profit>0)
            {
                max+=profit;
                min=num;
                profit=0;
            }
        }
        return max;
    }
}