class Solution {
    public int[][] merge(int[][] interval) {
        Arrays.sort(interval,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>res=new ArrayList<>();
        res.add(interval[0]);
        for(int i=0;i<interval.length;i++)
        {
            int x=interval[i][0];
            int y=interval[i][1];
            int last=res.get(res.size()-1)[1];
            if(x<=last)
            {
                res.get(res.size()-1)[1]=Math.max(last,y);
            }
            else
            {
                res.add(new int[]{x,y});
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
