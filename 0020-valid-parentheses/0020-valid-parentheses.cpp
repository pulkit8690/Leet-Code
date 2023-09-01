class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char c = s[i];
            
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.empty()) {
                    return false; // No corresponding opening bracket found
                }
                
                char top = st.top();
                st.pop();
                
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }
        
        // After processing the entire string, the stack should be empty
        return st.empty();
    }
};
