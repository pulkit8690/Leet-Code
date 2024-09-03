class Solution {
    public int getLucky(String s, int k) {
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            ans.append(Integer.toString(s.charAt(i)-'a'+1));
        }
        int res=0;
        while(k!=0)
        {
            res=0;
            for(int i=0;i<ans.length();i++)
            {
                res+=ans.charAt(i)-'0';
            }
            ans.delete(0,ans.length());
            ans.append(Integer.toString(res));
            k--;
        }
        return res;
    }
}