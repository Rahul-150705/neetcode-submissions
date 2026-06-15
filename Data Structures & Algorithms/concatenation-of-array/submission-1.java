class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int [] result=new int[2*len];
        int x=0;
        for(int i=0;i<len;i++)
        {
            result[i]=result[i+len]=nums[i];
        }
        return result;
        
    }
}