class Solution {
public:
    vector<int> leftRightDifference(vector<int>& nums) {
        int n=nums.size();
        vector<int> leftSum(n,0);
        leftSum[0]=0;
        for(int i=1;i<n;i++)
        {
            leftSum[i]=leftSum[i-1]+nums[i-1];
        }
        vector<int> rightSum(n,0);
        rightSum[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            rightSum[i]=rightSum[i+1]+nums[i+1];
        }
        vector<int> ans(n);
        for(int i=0;i<n;i++)
        {
            ans[i]=abs(leftSum[i]-rightSum[i]);
        }
        return ans;
    }
};