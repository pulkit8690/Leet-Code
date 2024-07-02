class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1=nums1.length;
        int n2=nums2.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n1 && j<n2)
        {
            if(nums1[i]==nums2[j])
            {
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else{
                j++;
            }
        }
        return ListtoArr(ans);
    }
    public int[] ListtoArr(ArrayList<Integer> ans)
    {
        
        int arr[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            arr[i]=ans.get(i);
        }
        return arr;
    }
}