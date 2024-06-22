class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=firstOccur(nums,target);
        arr[1]=lastOccur(nums, target);
        return arr;
    }
    private int firstOccur(int[] nums, int target)
    {
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        int mid= start+(end-start)/2;
        while(start<=end)
        {
            if(nums[mid]==target)
            {
                ans=mid;
                end= mid-1;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;;
            }
            else
            {
                end=mid-1;
            }
            mid= start+(end-start)/2;
        }
        return ans;
    }
    private int lastOccur(int[] nums, int target)
    {
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        int mid= start+(end-start)/2; 
        while(start<=end)
        {
            if(nums[mid]==target)
            {
                ans=mid;
                start = mid+1;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;;
            }
            else
            {
                end=mid-1;
            }
            mid= start+ (end-start)/2;
        }
        return ans;
    }
}