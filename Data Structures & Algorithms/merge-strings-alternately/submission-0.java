class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int first=word1.length();
        int sec=word2.length();
        int length=(first+sec)-1;
        int x=0;
        int y=0;
        for(int i=0;i<length;i++)
        {
            if(first>0)
            {
                sb.append(word1.charAt(x++));
                first--;
            }
            if(sec>0)
            {
                sb.append(word2.charAt(y++));
                sec--;
            }
        }
        return sb.toString();
        
    }
}