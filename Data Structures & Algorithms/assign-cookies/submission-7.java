class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int greedy=0;
        int cookies=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(greedy<g.length && cookies<s.length)
        {
            if(g[greedy]<=s[cookies])
            {
                greedy++;
            }
            cookies++;
        }
        return greedy;
        
    }
}