class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int need = 0;
        int have = map.size();
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;
        while(right<s.length())
        {
            char v=s.charAt(right);
            window.put(v,window.getOrDefault(v,0)+1);
            if(map.containsKey(v) && window.get(v) == map.get(v))
            {
                need++;
            }
            while(left<=right && need==have)
            {
                if(right-left+1<minLen)
                {
                    minLen=right-left+1;
                    minLeft=left; // this is to find the left at last to give the substring
                }
                char leftchar=s.charAt(left);
                window.put(leftchar,window.get(leftchar)-1); // move left++ when need==have
                if(map.containsKey(leftchar) && map.get(leftchar)>window.get(leftchar))
                {
                    need--;
                }
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
    
}
