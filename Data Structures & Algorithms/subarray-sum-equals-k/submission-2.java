class Solution {
    public int subarraySum(int[] nums, int t) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefix=0;
        int count=0;
        for(int k:nums)
        {
            prefix+=k;
            if(map.containsKey(prefix-t))
            {
                count+=map.get(prefix-t);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
        
    }
}