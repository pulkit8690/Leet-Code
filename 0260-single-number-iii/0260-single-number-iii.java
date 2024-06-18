class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[]=new int[2];
        int b1=0;
        int b2=0;
        int num=0;
        for(int i=0;i<nums.length;i++)
        {
            num=num^ nums[i];
        }
        int rightmost= num & -num;
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i] & rightmost)!=0)
            {
                b1^=nums[i];
            }
            else
            {
              b2^=nums[i];  
            }
        }
        arr[0]=b1;
        arr[1]=b2;
        return arr;
    }
}