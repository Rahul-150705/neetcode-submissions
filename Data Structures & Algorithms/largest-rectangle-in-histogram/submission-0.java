class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk=new Stack<>();
        int maxarea=0,height=0,width=0;
        int n=heights.length;
        for(int i=0;i<=n;i++)
        {
            while(!stk.isEmpty() && (i==n || heights[stk.peek()]>heights[i]))
            {
                height=heights[stk.pop()];
                width=stk.isEmpty() ? i : i-stk.peek()-1;
                maxarea=Math.max(maxarea,height*width);
            }
            stk.push(i);
        }
        return maxarea;
    }
}
