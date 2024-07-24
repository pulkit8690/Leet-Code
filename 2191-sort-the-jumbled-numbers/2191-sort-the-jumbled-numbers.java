class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        Integer[] MappedNums = new Integer[n];
        Integer[] idx = new Integer[n];

        for (int i = 0; i < n; i++) {
            idx[i] = i; // Save original index
            MappedNums[i] = getMappedValue(nums[i], mapping);
        }

        Arrays.sort(idx, (a, b) -> {
            int cmp = Integer.compare(MappedNums[a], MappedNums[b]);
            if (cmp == 0) {
                return Integer.compare(a, b); 
            }
            return cmp;
        });

        int[] sortedNums = new int[n];
        for (int i = 0; i < n; i++) {
            sortedNums[i] = nums[idx[i]];
        }

        return sortedNums;
    }

    private int getMappedValue(int num, int[] mapping) {
        if (num == 0) {
            return mapping[0];
        }

        int mappedValue = 0;
        int place = 1;

        while (num > 0) {
            int digit = num % 10;
            mappedValue += mapping[digit] * place;
            place *= 10;
            num /= 10;
        }

        return mappedValue;
    }

    public int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}