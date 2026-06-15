class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum=0;
        int costSum=0;
        int diffSum=0;
        int result=0;
        for(int i=0;i<gas.length;i++)
        {
            gasSum+=gas[i];
            costSum+=cost[i];
        }
        if(gasSum<costSum) return -1;
        for(int i=0;i<gas.length;i++)
        {
            diffSum+=gas[i]-cost[i];
            if(diffSum<0)
            {
                diffSum=0;
                result=i+1;
            }
        }
        return result;
    }
}
