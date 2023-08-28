class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        int64_t temp = x;
        int64_t rev = 0;   
        
        while (x > 0) {
            int m = x % 10;
            rev = (rev * 10) + m;
            x = x / 10;
        }
        
        return rev == temp;
    }
};