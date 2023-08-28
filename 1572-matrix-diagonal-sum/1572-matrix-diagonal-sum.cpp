class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int n= mat.size();
        int sum=0;
        for(int i=0;i<n;i++)
        {
           sum=sum+mat[i][i];
            sum=sum+mat[n-1-i][i];
        }
        if(n%2!=0)
        {
            sum=sum-mat[n/2][n/2];
        }
        return sum;
    }
};