class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int longest=1;
        for(int it : set)
        {
            if(!set.contains(it-1))
            {
                int cnt=1;
                int x=it;
                while(set.contains(x+1))
                {
                    cnt=cnt+1;
                    x=x+1;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}