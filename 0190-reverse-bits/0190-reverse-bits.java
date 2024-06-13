public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1; // Shift result left to make space for next bit
            result |= (n & 1); // OR with the least significant bit of n
            n >>= 1; // Shift n to the right to process the next bit
        }
        return result;
    }
}
