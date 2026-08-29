class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char [] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String v=new String(arr);
            map.putIfAbsent(v,new ArrayList<>());
            map.get(v).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
