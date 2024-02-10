class Solution {
public:
    bool isPowerOfTwo(int n) {
        bool a=true;
        int count=0;
        while(n>0){
            if(n&1){
                count++;

            }
            n=n>>1;


        }
        if(count==1)
            a=true;
        
        else
            a=false;
        
        return a;
    }
};