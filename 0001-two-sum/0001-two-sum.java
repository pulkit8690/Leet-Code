class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[] = nums.clone();
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        while(l<r)
        {
            int sum= nums[l] + nums[r];
            if(sum==target) return find(a, nums[l], nums[r]);
            else if(sum<target) l++;
            else r--;
        }
        return new int[] {-1,-1};
    }
    public static int[] find(int o[], int a, int b)
    {
        int idx1=-1,idx2=-1;
        for(int i=0;i<o.length;i++)
        {
            if(o[i]==a && idx1==-1)
            {
                idx1=i;
            }
            else if(o[i]==b && idx2==-1)
            {
                idx2=i;
            }
            
        }
        return new int[]{idx1, idx2};
    }
}