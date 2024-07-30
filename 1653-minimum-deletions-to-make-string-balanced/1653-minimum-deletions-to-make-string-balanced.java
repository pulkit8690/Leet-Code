class Solution {
    public int minimumDeletions(String s) {
        int acount=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                acount++;
            }
        }
        int bcount=0,seenA=0;
        int minDel= Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                seenA++;
            }
            minDel= Math.min(minDel, (acount-seenA)+bcount);
            if(s.charAt(i)=='b')
            {
                bcount++;
            }
        }
        return minDel;
    }
}