// Using Kadane Algorithm

class Solution {
    public int maxSubArray(int[] nums) {
        int count=0;
        int curr_sum=0;

        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                count++;
            }
        }
        if(count==nums.length)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>max_sum)
                {
                    max_sum=nums[i];
                }
            }
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                curr_sum=curr_sum+nums[i];
                if(curr_sum<0)
                {
                    curr_sum=0;
                }
                if(curr_sum>max_sum)
                {
                    max_sum=curr_sum;
                }
            }
        }
        return max_sum;
    }
}