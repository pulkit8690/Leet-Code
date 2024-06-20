class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> mainlist= new ArrayList<>();
        int n=nums.length;
        int tot_sub= 1<<n; // 2^n
        for(int num=0;num<tot_sub;num++)
        {
            List<Integer> sublist= new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                if((num & (1<<i))!=0)
                {
                    sublist.add(nums[i]);
                }
            }
            mainlist.add(sublist);
            
        }
        return mainlist;
    }
}