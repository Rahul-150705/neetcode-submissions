class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] count1=new int[26];
        int[] count2=new int[26];
        for(char s:s1.toCharArray())
        {
            count1[s-'a']++;
        }
        int window=s1.length();
        for(int i=0;i<window;i++)
        {
            count2[s2.charAt(i)-'a']++;
        }
        if(match(count1,count2)) return true;
        for(int i=window;i<s2.length();i++)
        {
            count2[s2.charAt(i)-'a']++;
            count2[s2.charAt(i-window)-'a']--;
            if(match(count1,count2)) return true;
        }
        return false;
    }
    private boolean match(int[]a,int[]b)
    {
        for(int i=0;i<26;i++)
        {
            if(a[i]!=b[i])
            {
                return false;
            }
        }
        return true;
    }
}
