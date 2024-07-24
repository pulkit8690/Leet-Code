class Solution {
        public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        Integer[] idx = new Integer[n];
        int[] mappedNums = new int[n];

        for (int i = 0; i < n; i++) {
            idx[i] = i; // Save original index
            mappedNums[i] = getMappedValue(nums[i], mapping);
        }

        Arrays.sort(idx, (a, b) -> {
            int cmp = Integer.compare(mappedNums[a], mappedNums[b]);
            if (cmp == 0) {
                return Integer.compare(a, b); // Maintain relative order
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
}