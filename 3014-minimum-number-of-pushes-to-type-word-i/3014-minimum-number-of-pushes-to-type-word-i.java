class Solution {
    public int minimumPushes(String word) {
       int res=0;
        for(int i=0;i<word.length();i++)
        {
            if(i/8==0) res+=1;
            else if(i/8==1) res+=2;
            else if(i/8==2) res+=3;
            else res+=4;
        }
        return res;
    }
}