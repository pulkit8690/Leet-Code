class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] leftsum = new int[n];
        for(int i=1;i<n;i++)
        {
            leftsum[i]=leftsum[i-1]+nums[i-1];
        }
        
        int[] rightsum=new int[n];
        for(int i=n-2;i>=0;i--)
        {
            rightsum[i]=rightsum[i+1]+nums[i+1];
        }
        
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return ans;
    }
}