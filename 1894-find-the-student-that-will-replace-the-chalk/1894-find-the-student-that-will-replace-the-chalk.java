class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum_arr = 0;
        for (int i = 0; i < chalk.length; i++) {
            sum_arr += chalk[i];
        }
        
        k %= sum_arr;
        
        for (int j = 0; j < chalk.length; j++) {
            if (k < chalk[j]) {
                return j;
            }
            k -= chalk[j];
        }
        
        return 0;
    }
}
