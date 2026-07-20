class Solution {
    public int largestRectangleArea(int[] height) {
        int maxArea = 0;
        Stack<int[]> stk = new Stack<>(); // pair: (index, height)
        int maxarea=0;
        for (int i = 0; i < height.length; i++) 
        {
            int start=i;
            while(!stk.isEmpty() && stk.peek()[1]>height[i])
            {
                int[] x=stk.pop();
                int wid=x[0]; //index
                int high=x[1]; //height
                maxarea=Math.max(maxarea,high* (i-wid));
                start=wid;
            }
            stk.push(new int[]{start,height[i]});
        }
        for(int [] pair:stk)
        {
            int index=pair[0];
            int heig=pair[1];
            maxarea=Math.max(maxarea,heig*(height.length-index));
        }
        return maxarea;
    }
}