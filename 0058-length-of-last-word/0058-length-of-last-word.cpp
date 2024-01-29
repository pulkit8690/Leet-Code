#include <string>

class Solution {
public:
    int lengthOfLastWord(string s) {
        int x = 0;
        int i = s.size() - 1;

        
        while (i >= 0 && isspace(s[i])) {
            i--;
        }

        while (i >= 0 && !isspace(s[i])) {
            x++;
            i--;
        }

        return x;
    }
};
