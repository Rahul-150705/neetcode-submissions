class Solution {
    public boolean isPalindrome(String s) {
        int start=0,end=s.length()-1;
        StringBuilder sb=new StringBuilder();
        while(start<end)
        {
            while(start<end && !Character.isLetterOrDigit(s.charAt(start)))
            {
                start++;
            }
            while(start<end && !Character.isLetterOrDigit(s.charAt(end)))
            {
                end--;
            }
            if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end)))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
