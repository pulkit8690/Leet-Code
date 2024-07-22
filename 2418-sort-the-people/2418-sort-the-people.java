class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i =0;i<names.length;i++)
        {
            hm.put(heights[i],names[i]);
        }
        Integer[] height = Arrays.stream(heights).boxed().toArray(Integer[]::new);
        Arrays.sort(height,Collections.reverseOrder());
        String[] ans = new String[names.length];
        for(int i=0;i<height.length;i++)
        {
            ans[i]= hm.get(height[i]);
        }
        return ans;
    }
}