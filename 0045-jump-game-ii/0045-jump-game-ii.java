class Solution {
    public int jump(int[] nums) {
        int l=0,r=0,jumps=0,n=nums.length-1;
        while(r<n)
        {
            int far=0;
            for(int i=l;i<=r;i++)
            {
                far= Math.max(far, i+nums[i]);
            }
            jumps=jumps+1;
            l=r+1;
            r=far;
        }
        return jumps;
    }
}