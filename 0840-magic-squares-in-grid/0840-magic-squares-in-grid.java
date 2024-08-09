class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        if (m < 3 || n < 3) {
            return 0;
        }
        
        int i = 0, j = 0;
        while (i <= m - 3 && j <= n - 3) {
            int sub[][] = new int[3][3];
            for (int k = 0; k < 3; k++) {
                for (int z = 0; z < 3; z++) {
                    sub[k][z] = grid[i + k][j + z];
                }
            }

            boolean isValid = isValidMagicSquare(sub);
            if (isValid) {
                count++;
            }

            i++;
            if (i + 3 > m) {
                j++;
                i = 0;
            }
        }
        return count;
    }

    private boolean isValidMagicSquare(int[][] sub) {
        if (!containsUniqueNumbers(sub)) {
            return false;
        }

        boolean sumR = sumRow(sub);
        boolean sumC = sumCol(sub);
        boolean sumD = sumDia(sub);

        return sumR && sumC && sumD;
    }

    private boolean containsUniqueNumbers(int[][] sub) {
        boolean[] seen = new boolean[10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = sub[i][j];
                if (num < 1 || num > 9 || seen[num]) {
                    return false;
                }
                seen[num] = true;
            }
        }
        return true;
    }

    public boolean sumRow(int[][] sub) {
        int sum = sub[0][0] + sub[0][1] + sub[0][2];
        for (int i = 1; i < 3; i++) {
            int newSum = sub[i][0] + sub[i][1] + sub[i][2];
            if (newSum != sum) {
                return false;
            }
        }
        return true;
    }

    public boolean sumCol(int[][] sub) {
        int sum = sub[0][0] + sub[1][0] + sub[2][0];
        for (int j = 1; j < 3; j++) {
            int newSum = sub[0][j] + sub[1][j] + sub[2][j];
            if (newSum != sum) {
                return false;
            }
        }
        return true;
    }

    public boolean sumDia(int[][] sub) {
        int sum1 = sub[0][0] + sub[1][1] + sub[2][2];
        int sum2 = sub[0][2] + sub[1][1] + sub[2][0];
        return sum1 == sum2 && sum1 == (sub[0][0] + sub[0][1] + sub[0][2]);
    }
}
