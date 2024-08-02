class Solution {
    public int minSwaps(int[] nums) {
        int winsize=0;
        for(int num:nums)
        {
            winsize+=num;
        }
        int currZeros=0;
        for(int i=0;i<winsize;i++)
        {
            if(nums[i]==0)
            {
                currZeros++;
            }
        }
        int minzero=currZeros;
        int start=0;
        int end=winsize-1;
        int n=nums.length;
        while(start<n)
        {
            if(nums[start]==0)
            {
                currZeros--;
            }
            start++;
            end++;
            if(nums[end%n]==0)
            {
                currZeros++;
            }
            minzero=Math.min(minzero,currZeros);
        }
        return minzero;
    }
}