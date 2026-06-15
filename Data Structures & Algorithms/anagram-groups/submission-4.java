class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            // char[] x=s.toCharArray();
            // Arrays.sort(x);
            int [] count=new int[26];
            //  use normal sort method to sort to reduce tc to m from log m
            for(char c: s.toCharArray())
            {
                count[c-'a']++;
            }
            String v=Arrays.toString(count);
            // String v=new String(x);
            if(!map.containsKey(v))
            {
                map.put(v,new ArrayList<>());
            }
            map.get(v).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}
