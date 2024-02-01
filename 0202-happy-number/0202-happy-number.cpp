class Solution {
public:
    bool isHappy(int n) {
        set<int> s;
        while(1)
        {
            int temp=0;
            while(n)
            {
                int x=n%10;
                temp=temp+(x*x);
                n=n/10;
            }
            if(temp==1)
            {
                return true;
            }
            else if(s.find(temp)!=s.end())
            {
                return false;
            }
            else
            {
                s.insert(temp);
                n=temp;
            }
        }
        return false;
    }
};