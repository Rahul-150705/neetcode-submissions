class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        List<String> result=new ArrayList<>();
        result.add("");
        String[] map=new String[]
        {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        for(int i=0;i<digits.length();i++)
        {
            String letters=map[digits.charAt(i)-'0'];
            List<String> temp=new ArrayList<>();
            for(String combination:result)
            {
                for(int j=0;j<letters.length();j++)
                {
                    temp.add(combination+letters.charAt(j));
                }
            }
            result=temp;
        }
        return result;
    }
}
