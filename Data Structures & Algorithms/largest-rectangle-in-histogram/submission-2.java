class Solution {
    public int largestRectangleArea(int[] heights) {
        int area=0;
        int start=0;
        Stack<int[]> stk=new Stack<>();
        for(int i=0;i<heights.length;i++)
        {
            start=i;

            while(!stk.isEmpty() && stk.peek()[0]>heights[i])
            {
                int[] top=stk.pop();
                int height=top[0];
                int index=top[1];
                area=Math.max(area,height*(i-index));            
                start=index;
            }
            stk.push(new int[]{heights[i],start});
        }
        for(int[] x:stk)
        {
            int height=x[0];
            int index=x[1];
            area=Math.max(area,height*(heights.length-index));
        }
        return area;
    }
}
