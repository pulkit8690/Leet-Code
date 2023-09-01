class Solution {
public:
    vector <int> row(int n)
    {
        int m=n+1;
        vector <int> ans;
        ans.push_back(1);
        long long key=1;
        for(int col=1;col<m;col++)
        {
            key=key*(m-col);
            key=key/col;
            ans.push_back(key);
        }
        return ans;
    }
    vector<int> getRow(int rowIndex)
    {
       return row(rowIndex);
    }
};