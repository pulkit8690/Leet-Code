class Solution {
public:
    int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int low = 1;
        int high = x;
        int ans;

        while (low <= high) {
            long long int mid = low + (high - low) / 2;

            long long int sqr = mid * mid;

            if (sqr == x) {
                return mid;
            } else if (sqr < x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
};
