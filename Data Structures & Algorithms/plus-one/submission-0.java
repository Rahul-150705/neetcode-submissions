class Solution {
    public int[] plusOne(int[] digit) {
        for(int i=digit.length-1;i>=0;i--)
        {
            if(digit[i]<9)
            {
                digit[i]=digit[i]+1;
                return digit;
            }
            digit[i]=0;
        }
        int [] result=new int[digit.length+1];
        result[0]=1;
        return result;
    }
}
