class Solution {
public:
    vector<int> generateRow(int rows)
    {
        long long ans=1;
        vector <int> ansrow;
        ansrow.push_back(1);
        for(int col=1;col<rows;col++)
        {
            ans=ans*(rows-col);
            ans=ans/col;
            ansrow.push_back(ans);
        }
        return ansrow;
    }
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ans;
        for(int i=1;i<=numRows;i++)
        {
            ans.push_back(generateRow(i));
        }
        return ans;
    }
    
};