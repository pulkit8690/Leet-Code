class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')')
            {
                String curr="";
                while(st.peek()!='(')
                {
                    curr+=st.peek();
                    st.pop();
                }
                st.pop();
                for(int j=0;j<curr.length();j++)
                {
                    st.push(curr.charAt(j));
                }
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
        StringBuilder ans= new StringBuilder("");
        while(!st.isEmpty())
        {
        ans.append(st.peek());
        st.pop();
        }
        return ans.reverse().toString();
    }
}