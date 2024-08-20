class Solution {
    public boolean canJump(int[] nums) {
        int n= nums.length-1;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(0,nums,n,dp)==1;
    }
    public int  helper(int i, int arr[], int n, int dp[])
    {
        if(i==n) return 1;
        if(arr[i]==0 || i>n) return 0;
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        for(int j=1;j<=arr[i];j++)
        {
            if( helper(i+j,arr,n,dp)==1)
            {
                return dp[i]=1;
            }
        }
        return dp[i]=0;
    }
}