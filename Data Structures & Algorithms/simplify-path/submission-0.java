class Solution {
    public String simplifyPath(String path) {
        Stack<String> stk=new Stack<>();
        String [] paths=path.split("/");
        for(String curr:paths)
        {
            if(curr.equals(".."))
            {
                if(!stk.isEmpty()) stk.pop();
            }
            else if(!curr.equals("") && !curr.equals("."))
            {
                stk.push(curr);
            }
        }
        return "/" + String.join("/",stk); // first "/" is to start it with that "/"
    }
}