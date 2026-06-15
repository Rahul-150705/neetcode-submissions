class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        for(int seq:set)
        {
            if(!set.contains(seq-1))
            {
                int length=1;
                while(set.contains(seq+1))
                {
                    length+=1;
                    seq+=1;
                }
                longest=Math.max(longest,length);
            }
        }
        return longest;
        
    }
}
