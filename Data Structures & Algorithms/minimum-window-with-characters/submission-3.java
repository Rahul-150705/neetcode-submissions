class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        Map<Character,Integer>need=new HashMap<>();
        for(char c:t.toCharArray())
        {
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int required=need.size();
        int left=0;
        int right=0;
        int minLen=Integer.MAX_VALUE;
        int minLeft=0;
        int format=0;
        Map<Character,Integer> window=new HashMap<>();
        while(right<s.length())
        {
            char c=s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);
            if(need.containsKey(c) && 
            need.get(c).intValue()==window.get(c).intValue())
            {
                format++;
            }
            while(left<=right && format==required)
            {
                if(right-left+1<minLen)
                {
                    minLen=right-left+1;
                    minLeft=left;
                }
                    char leftchar=s.charAt(left);
                    window.put(leftchar,window.get(leftchar)-1);
                    if(need.containsKey(leftchar) && need.get(leftchar)>window.get(leftchar))
                    {
                        format--;
                    }
                    left++;
                }
                right++;
        }
        if(minLen==Integer.MAX_VALUE)
        {
            return "";
        }
        else
        {
            return s.substring(minLeft, minLeft + minLen);
        }
    }
}
    
