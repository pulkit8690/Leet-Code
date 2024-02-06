class Solution {
public:
    int reverse(int x) {
        long temp=0;
        while(x!=0)
        {
            int n=x%10;
            temp=(temp*10)+n;
            x=x/10;
        }
        if(temp>INT_MAX || temp<INT_MIN){ 
            return 0;
            }
        return temp;
    }
};