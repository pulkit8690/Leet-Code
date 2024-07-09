class Solution {
    public double averageWaitingTime(int[][] customers) {
        long curr_time = 0;
        long wait_time = 0;
        int n = customers.length;
        for (int i = 0; i < n; i++) {
            int arr_time = customers[i][0];
            int prep_time = customers[i][1];
            if (curr_time < arr_time) {
                curr_time = arr_time;
            }
            curr_time += prep_time;
            wait_time += (curr_time - arr_time);
        }
        return (double) wait_time / n;
    }
}

