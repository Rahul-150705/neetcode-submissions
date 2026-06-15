class Solution {
    public int characterReplacement(String s, int k) {
        int[] count=new int[26];
        int left=0,maxlen=0,maxcount=0;
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'A']++;
            maxcount=Math.max(maxcount,count[s.charAt(i)-'A']);
            while((i-left+1)-maxcount > k)
            {
                count[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}
