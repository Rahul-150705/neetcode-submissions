class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for(String wrd:strs)
        {
            char[] chars=wrd.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            if(!map.containsKey(key))
            {
               map.put(key,new ArrayList<>()) ;
            }
            map.get(key).add(wrd);
        }
        return new ArrayList<>(map.values());
        
    }
}
