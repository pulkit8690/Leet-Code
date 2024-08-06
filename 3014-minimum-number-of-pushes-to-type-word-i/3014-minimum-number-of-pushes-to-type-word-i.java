class Solution {
    public int minimumPushes(String word) {
        int arr[]= {0,0,0,0,0,0,0,0,0,0};
        int res=0;
        int assign_key=2;
        for(char ch : word.toCharArray())
        {
            if(assign_key>9)
            {
                assign_key=2;
            }
            arr[assign_key]++;
            res+=arr[assign_key];
            assign_key++;
        }
        return res;
    }
}