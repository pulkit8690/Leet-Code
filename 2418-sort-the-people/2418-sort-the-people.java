class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       TreeMap<Integer,String> map = new TreeMap<>();
        for(int i=0;i<names.length;i++)
        {
            map.put(heights[i],names[i]);
        }
        String[] ans = new String[names.length];
        int i=names.length-1;
        for(Integer key : map.keySet())
        {
            ans[i]=map.get(key);
            i--;
        }
        return ans;
    }
}