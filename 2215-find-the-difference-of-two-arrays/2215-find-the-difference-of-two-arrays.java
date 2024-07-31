class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1= new HashSet<>();
        for(int i =0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
        HashSet<Integer> set2= new HashSet<>();
        for(int i =0;i<nums2.length;i++)
        {
            set2.add(nums2[i]);
        }
        List<Integer> ans1= new ArrayList<>();
        for(Integer i : set1)
        {
            if(!set2.contains(i))
            {
                ans1.add(i);
            }
        }
        List<Integer> ans2= new ArrayList<>();
        for(Integer i : set2)
        {
            if(!set1.contains(i))
            {
                ans2.add(i);
            }
        }
        List<List<Integer>> ans= new ArrayList<>();
        ans.add(ans1);
        ans.add(ans2);
        return ans;
    }
}