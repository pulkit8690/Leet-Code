class Solution {
    public int passThePillow(int n, int time) {
        int rounds= time/(n-1);
        if((rounds&1)==0)
        {
            return 1+(time%(n-1));
        }
        else
        {
            return n-(time%(n-1));
        }
    }
}