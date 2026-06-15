class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>map= new HashMap<>();
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Integer key:map.keySet())
        {
            if(map.get(key)>n/2)
            {
                max=key;
            }
        }
        return max;
    }
}