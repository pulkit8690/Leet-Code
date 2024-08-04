class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans= new ArrayList();
        for(int i=num.length-1;i>=0;i--)
        {
            int sum= k+ num[i];
            ans.add(sum%10);
            k=sum/10;
        }
        while(k>0)
        {
            ans.add(k%10);
            k=k/10;
        }
        List<Integer> ans1= new ArrayList();
        for(int i=ans.size()-1;i>=0;i--)
        {
            ans1.add(ans.get(i));
        }
        return ans1;
    }
}