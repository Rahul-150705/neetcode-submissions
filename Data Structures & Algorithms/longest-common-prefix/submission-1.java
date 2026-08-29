class Solution {
    public String longestCommonPrefix(String[] strs) {
        String v=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while(!strs[i].startsWith(v))
            {
                v=v.substring(0,v.length()-1);
            }
        }
        return v;
    }
}