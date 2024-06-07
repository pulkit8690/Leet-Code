class Solution {
    public int mySqrt(int x) {
        if(x==0)
        {
            return 0;
        }
        int start=0;
        int end=x;
        int ans=0;
        while(start<=end)
        {
            int mid=(start+end)/2;
            long sqr=(long) mid*mid;
            if(sqr==x)
            {
                ans=mid;
                return ans;
            }
            else if(sqr<x)
            {
                start=mid+1;
                ans=mid;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
    }
}