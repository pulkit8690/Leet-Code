class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int output=0;
        while(i<g.length && j<s.length)
        {
            if(g[i]<=s[j])
            {
                output++;
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        return output;
    }
}