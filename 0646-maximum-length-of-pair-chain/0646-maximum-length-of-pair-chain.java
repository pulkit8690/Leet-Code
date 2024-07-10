class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int count=1;
        int last=pairs[0][1];
        for(int i=0;i<pairs.length;i++){
            if(pairs[i][0]>last)
            {
                count++;
                last=pairs[i][1];
            }
        }
        return count;
    }
}