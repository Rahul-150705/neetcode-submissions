class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int len=s.length();
        int[] count=new int[26];
        int[] count1=new int[26];
        for(int i=0;i<len;i++)
        {
            count[s.charAt(i)-'a']++;
            count1[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]!=count1[i])
            {
                return false;
            }
        }
        return true;

    }
}
