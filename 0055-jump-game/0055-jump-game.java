class Solution {
    public boolean canJump(int[] nums) {
        int n= nums.length-1;
        int dp[]= new int[n+1];
        Arrays.fill(dp, -1);
        return helper(nums,0,n,dp)==1;
    }
    public int helper(int arr[], int i,int n, int dp[])
    {
        if(i==n) return 1;
        if(arr[i]==0 || i>n) return 0;
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        for(int k=1;k<=arr[i];k++)
        {
            if(helper(arr,i+k,n,dp)==1)
            {
                return dp[i]=1;
            }
        }
        return dp[i]=0;
    }
}