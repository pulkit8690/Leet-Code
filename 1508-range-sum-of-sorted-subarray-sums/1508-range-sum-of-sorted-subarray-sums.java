class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int size=(n*(n+1))/2;
        int arr[]= new int[size];
        int k=0;
        for(int i=0;i<size;i++)
        {
            int s=0;
            for(int j=i;j<n;j++)
            {
                s+=nums[j];
                arr[k++]=s;
            }
        }
        Arrays.sort(arr);
        int ans=0;
        int mod=(int) 1e9 +7;
        for(int i=left-1;i<right;i++)
        {
            ans=(ans+arr[i])%mod;
        }
        return ans;
    }
}