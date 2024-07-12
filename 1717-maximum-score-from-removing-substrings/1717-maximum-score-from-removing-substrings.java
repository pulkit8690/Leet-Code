class Solution {
    public int maximumGain(String s, int x, int y) {
        return x>y ? gain(s,"ab",x,"ba",y) : gain(s,"ba",y,"ab",x);
    }
    public int gain(String s , String s1 , int p1, String s2, int p2)
    {
        int points=0;
        Stack<Character> stack= new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!stack.isEmpty() && stack.peek()==s1.charAt(0) && ch==s1.charAt(1))
            {
                stack.pop();
                points+=p1;
            }
            else
            {
                stack.push(ch);
            }
        }
        StringBuilder remainingString = new StringBuilder();
        while (!stack.isEmpty()) {
            remainingString.insert(0, stack.pop());
        }
        for (int i = 0; i < remainingString.length(); i++) {
            char ch = remainingString.charAt(i);
            if (!stack.isEmpty() && stack.peek() == s2.charAt(0) && ch == s2.charAt(1)) {
                stack.pop();
                points += p2;
            } else {
                stack.push(ch);
            }
        }
        return points;
    }
}