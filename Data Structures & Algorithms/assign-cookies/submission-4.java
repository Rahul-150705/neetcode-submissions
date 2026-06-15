class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        int greedy=0;
        int cookies=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(greedy<g.length && cookies<s.length)
        {
            if(g[greedy]<=s[cookies])
            {
                count++;
                cookies++;
                greedy++;
            }
            else if(g[greedy]>s[cookies])
            {
                cookies++;
            }
        }
        return count;
        
    }
}