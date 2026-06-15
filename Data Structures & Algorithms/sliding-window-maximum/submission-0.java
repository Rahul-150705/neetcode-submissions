class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            while(!dq.isEmpty() && nums[dq.getLast()]<nums[i])
            {
                dq.removeLast();
            }
            dq.addLast(i);
            if(!dq.isEmpty() && dq.getFirst()==i-k)
            {
                dq.removeFirst();
            }
            if(i>=k-1)
            {
                list.add(nums[dq.getFirst()]);
            }
        }
        int [] res=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
}
