class Solution {

    public String encode(List<String> st) {
        StringBuilder sb = new StringBuilder();
        for (String s : st) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int prev = 0;
        int x=0;
        while (x < s.length()) {
            while (s.charAt(x) != '#') {
                x++;
            }
            int length = Integer.parseInt(s.substring(prev, x)); // length of the string
            result.add(s.substring(x + 1, x + 1 + length)); // extract the string
            prev = x + 1 + length; // move to the next string
            x=x+length+1;
        }
        return result;

    }
}
