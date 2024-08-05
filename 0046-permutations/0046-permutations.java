class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        helper(nums,ans,sub);
        return ans;
    }
    public void helper(int[] nums,List<List<Integer>> ans,List<Integer> sub )
    {
        if(sub.size()==nums.length)
        {
            ans.add(new ArrayList<>(sub));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!sub.contains(nums[i]))
            {
                sub.add(nums[i]);
                helper(nums,ans,sub);
                sub.remove(sub.size()-1);
            }
        }
    }
}