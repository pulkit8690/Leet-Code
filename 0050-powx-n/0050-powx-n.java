class Solution {
    public double myPow(double x, int n) {
        // Handle the special case where n is Integer.MIN_VALUE
        long N = n;
        
        // If n is negative, invert x and use the positive counterpart of n
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        return myPowHelper(x, N);
    }

    private double myPowHelper(double x, long n) {
        // Base case: any number to the power of 0 is 1
        if (n == 0) {
            return 1;
        }
        
        // Recursive step: compute half power
        double halfPow = myPowHelper(x, n / 2);
        double halfPowSq = halfPow * halfPow;
        
        // If n is odd, we need to multiply by x one more time
        if (n % 2 != 0) {
            halfPowSq *= x;
        }
        
        return halfPowSq;
    }
};
