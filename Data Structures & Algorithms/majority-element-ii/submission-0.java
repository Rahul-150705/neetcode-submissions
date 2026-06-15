class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        map.forEach((key,value) ->{if(value>n/3)
        {
            list.add(key);
        }});
        return list;
    }
}