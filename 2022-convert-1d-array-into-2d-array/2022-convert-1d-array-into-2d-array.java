class Solution {
    public int[][] construct2DArray(int[] o, int m, int n) {
        int l=o.length;
        if(m*n !=l)
        {
            return new int[0][0];
        }
        int t=0;
        int ans[][]= new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans[i][j]=o[t];
                t++;
            }
        }
        return ans;
    }
}