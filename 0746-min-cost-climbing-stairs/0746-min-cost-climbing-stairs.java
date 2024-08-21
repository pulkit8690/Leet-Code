class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n= cost.length;
        int dp[]= new int [n];
        Arrays.fill(dp,-1);
        return Math.min(helper(cost,0,n,dp), helper(cost,1,n,dp));
    }
    public int helper(int arr[], int i, int n,int dp[])
    {
        if(i>=n) return 0; 
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        int step1= arr[i]+helper(arr,i+1,n,dp);
        int step2= arr[i]+helper(arr,i+2,n,dp);
        return dp[i]= Math.min(step1,step2);
    }
}