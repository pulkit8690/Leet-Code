class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int arr[][]= new int[n][2];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=i;
            arr[i][1]=score[i];
        }
        Arrays.sort(arr, Comparator.comparingDouble(o->o[1]));
        String ans[]= new String[n];
        int rank=1;
        for(int i=1;i<=n;i++)
        {
            if(rank==1)
            {
                ans[arr[n-i][0]]="Gold Medal";
            }
            else if(rank==2)
            {
                ans[arr[n-i][0]]="Silver Medal";
            }
            else if(rank==3)
            {
                ans[arr[n-i][0]]="Bronze Medal";
            }
            else{
                ans[arr[n-i][0]]=Integer.toString(rank);
            }
            rank++;
        }
        return ans;
        
    }
}