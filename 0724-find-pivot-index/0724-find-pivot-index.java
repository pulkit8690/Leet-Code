class Solution {
    public int pivotIndex(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        long leftSum=0;
        for(int j=0;j<nums.length;j++)
        {
            sum=sum-nums[j];
            if(leftSum==sum)
            {
                return j;
            }
            else
            {
                leftSum=leftSum+nums[j];
            }
        }
        return -1;
    }
}