class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rstart, int cstart) {
        int dir[][]={{0,1},{1,0},{0,-1},{-1,0}};
        int n= rows*cols;
        int res[][]= new int[n][2];
        res[0][0]=rstart;
        res[0][1]=cstart;
        int count=1,step=1,index=0;
        while(count<n)
        {
            for(int times=0;times<2;times++)
            {
                int dr= dir[index%4][0];
                int dc= dir[index%4][1];
                for(int i=0;i<step;i++)
                {
                    rstart+=dr;
                    cstart+=dc;
                    if(rstart>=0 && rstart<rows && cstart>=0 && cstart<cols)
                    {
                        res[count][0]=rstart;
                        res[count][1]=cstart;
                        count++;
                    }
                }
                index++;
            }
            step++;
        }
        return res;
    }
}