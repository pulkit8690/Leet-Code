class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0)
        {
            x=1/x;
            N=-N;
        }
        return myPow2(x,N);
    }
    private double myPow2(double x, long N)
    {
        if(N==0)
        {
            return 1;
        }
        double halfPow=myPow2(x,N/2);
        double halfPow_Sq=halfPow*halfPow;
        if(N%2!=0)
        {
            halfPow_Sq=x*halfPow_Sq;
        }
        return halfPow_Sq;
    }
};